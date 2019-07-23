package com.zrht.privilege.realm;

import com.cloud.common.context.AppContext;
import com.cloud.common.exception.ParameterException;
import com.zrht.privilege.dto.UserInfoParamDTO;
import com.zrht.privilege.entity.*;
import com.zrht.privilege.service.*;
import com.zrht.privilege.utils.UserInfoUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.List;
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
//        UserInfoParamDTO user = (UserInfoParamDTO) principals.getPrimaryPrincipal();
        UserInfoParamDTO user = UserInfoUtil.getlocal();
        if (user == null) {
            return simpleAuthorizationInfo;
        }
        // 获取角色的权限信息
        String roleId = user.getRoleId();
        if (StringUtils.isEmpty(roleId)) {
            throw new ParameterException("当前用户没有角色信息");
        }
        RoleInfoService roleInfoService = AppContext.getBean(RoleInfoService.class);
        RolePrivilegeService rolePrivilegeService = AppContext.getBean(RolePrivilegeService.class);
        MenuPrivilegeService menuPrivilegeService = AppContext.getBean(MenuPrivilegeService.class);
        MenuService menuService = AppContext.getBean(MenuService.class);

        // 依次通过角色id->获取权限id->获取菜单id->获取权限URL
        RoleInfo roleInfo = roleInfoService.query().eq("role_id", roleId).one();
        // 获取权限列表
        List<RolePrivilege> rolePrivileges = rolePrivilegeService.query().eq("role_id", roleId).list();
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
        if (user == null) {
            return null;
        }
        //3.通过SimpleAuthenticationInfo做身份处理
        SimpleAuthenticationInfo simpleAuthenticationInfo =
                new SimpleAuthenticationInfo(user, user.getPassword(), getName());
        //4.用户账号状态验证等其他业务操作
        if (user.getAvailable() == 1) {
            throw new AuthenticationException("该账号已经被禁用");
        }
        //5.返回身份处理对象
        return simpleAuthenticationInfo;
    }

}
