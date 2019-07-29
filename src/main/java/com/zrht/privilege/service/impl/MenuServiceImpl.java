package com.zrht.privilege.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrht.privilege.dao.MenuDao;
import com.zrht.privilege.entity.Menu;
import com.zrht.privilege.entity.MenuPrivilege;
import com.zrht.privilege.entity.RolePrivilege;
import com.zrht.privilege.enums.ExceptionEnum;
import com.zrht.privilege.exception.PrivilegeException;
import com.zrht.privilege.service.MenuPrivilegeService;
import com.zrht.privilege.service.MenuService;
import com.zrht.privilege.service.RolePrivilegeService;
import com.zrht.privilege.utils.AssertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 权限菜单表 服务实现类
 * </p>
 *
 * @author xdj
 * @since 2019-07-19
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuDao, Menu> implements MenuService {

    @Autowired
    private RolePrivilegeService rolePrivilegeService;

    @Autowired
    private MenuPrivilegeService menuPrivilegeService;

    @Override
    public List<Menu> getMenuList(String roleId) {

        // 获取权限列表
        List<RolePrivilege> rolePrivileges = rolePrivilegeService.query().eq("role_id", roleId).list();
        AssertUtil.notNull(rolePrivileges, new PrivilegeException(ExceptionEnum.ROLE_INFO_IS_NULL.getCode(), ExceptionEnum.ROLE_INFO_IS_NULL.getMessage()));

        List<String> privilegeIds = rolePrivileges.stream()
                .map(RolePrivilege::getPrivilegeId).collect(Collectors.toList());
        List<MenuPrivilege> lists = menuPrivilegeService.query().in("privilege_id", privilegeIds).list();
        List<String> menuIds = lists.stream().map(MenuPrivilege::getMenuId).collect(Collectors.toList());
        List<Menu> menus = this.query().in("menu_id", menuIds).list();
        return menus;
    }
}
