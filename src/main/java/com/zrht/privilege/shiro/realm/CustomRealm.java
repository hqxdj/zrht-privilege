package com.zrht.privilege.shiro.realm;

import cn.hutool.core.bean.BeanUtil;
import com.cloud.common.context.AppContext;
import com.zrht.privilege.dto.UserInfoParamDTO;
import com.zrht.privilege.entity.*;
import com.zrht.privilege.enums.ExceptionEnum;
import com.zrht.privilege.enums.YesOrNoEnum;
import com.zrht.privilege.exception.PrivilegeException;
import com.zrht.privilege.service.*;
import com.zrht.privilege.shiro.util.ShiroUtil;
import com.zrht.privilege.utils.AssertUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
public class CustomRealm extends AuthorizingRealm {

    /**
     * @param [principals]
     * @return org.apache.shiro.authz.AuthorizationInfo
     * @author xdj
     * @data 2019/7/22
     * @desc 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //通过SimpleAuthenticationInfo做授权
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        // 获取当前登录角色的信息也可以在用户认证的时候传入UserInfoParamDTO这个对象
        UserInfoParamDTO user = (UserInfoParamDTO) principals.getPrimaryPrincipal();
//        UserInfoParamDTO user = UserInfoUtil.getlocal();
        //这里如果使用了shiro的session则无法使用UserIfoUtil

//        AssertUtil.notNull(user, new PrivilegeException(ExceptionEnum.ROLE_INFO_IS_NULL.getCode(), ExceptionEnum.ROLE_INFO_IS_NULL.getMessage()));
        // 获取角色的权限信息
//        String roleId = user.getRoleId();
        // 通过获取session中的用户角色id来获取权限信息
        Session session = ShiroUtil.getSessionByUsername(user.getUserName());
        UserInfoParamDTO DTO = (UserInfoParamDTO) Objects.requireNonNull(session).getAttribute("user");


        String roleId = DTO.getRoleId();
        AssertUtil.notEmpty(roleId, new PrivilegeException(ExceptionEnum.ROLE_INFO_IS_NULL.getCode(), ExceptionEnum.ROLE_INFO_IS_NULL.getMessage()));
        RoleInfoService roleInfoService = AppContext.getBean(RoleInfoService.class);
        RolePrivilegeService rolePrivilegeService = AppContext.getBean(RolePrivilegeService.class);
        MenuPrivilegeService menuPrivilegeService = AppContext.getBean(MenuPrivilegeService.class);
        MenuService menuService = AppContext.getBean(MenuService.class);

        // 依次通过角色id->获取权限id->获取菜单id->获取权限URL
        RoleInfo roleInfo = roleInfoService.query().eq("role_id", roleId).one();

        AssertUtil.notNull(roleInfo, new PrivilegeException(ExceptionEnum.ROLE_INFO_IS_NULL.getCode(), ExceptionEnum.ROLE_INFO_IS_NULL.getMessage()));

        // 获取权限列表
        List<RolePrivilege> rolePrivileges = rolePrivilegeService.query().eq("role_id", roleId).list();
        AssertUtil.notNull(rolePrivileges, new PrivilegeException(ExceptionEnum.ROLE_INFO_IS_NULL.getCode(), ExceptionEnum.ROLE_INFO_IS_NULL.getMessage()));

        List<String> privilegeIds = rolePrivileges.stream()
                .map(RolePrivilege::getPrivilegeId).collect(Collectors.toList());
        List<MenuPrivilege> lists = menuPrivilegeService.query().in("privilege_id", privilegeIds).list();
        List<String> menuIds = lists.stream().map(MenuPrivilege::getMenuId).collect(Collectors.toList());
        List<Menu> menus = menuService.query().in("menu_id", menuIds).list();
        List<String> urls = menus.stream().map(Menu::getMenuUrl).collect(Collectors.toList());
        simpleAuthorizationInfo.addRole(roleInfo.getRoleName());
        simpleAuthorizationInfo.addStringPermissions(urls);

        return simpleAuthorizationInfo;
    }


    /**
     * @param [token]
     * @return org.apache.shiro.authc.AuthenticationInfo
     * @author xdj
     * @data 2019/7/22
     * @desc 用户认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UserInfoService userService = AppContext.getBean(UserInfoService.class);
        String userName = (String) token.getPrincipal();
        UserInfo user = userService.query().eq("login_name", userName).one();
        AssertUtil.notNull(user, new PrivilegeException(ExceptionEnum.USER_INFO_IS_NULL.getCode(), ExceptionEnum.USER_INFO_IS_NULL.getMessage()));
        //3.通过SimpleAuthenticationInfo做身份处理
        UserInfoParamDTO userInfoParamDTO = new UserInfoParamDTO();
        BeanUtil.copyProperties(user, userInfoParamDTO);
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userInfoParamDTO, userInfoParamDTO.getPassword(), getName());
        simpleAuthenticationInfo.setCredentialsSalt(ByteSource.Util.bytes("zrht"));
        //4.用户账号状态验证等其他业务操作
        if (user.getAvailable().equals(YesOrNoEnum.NO.getCode())) {
            throw new AuthenticationException("该账号已经被禁用");
        }
        //5.返回身份处理对象
        return simpleAuthenticationInfo;
    }

}
