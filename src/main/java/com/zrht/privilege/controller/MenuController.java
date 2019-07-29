package com.zrht.privilege.controller;


import com.cloud.common.bean.ResponseInfo;
import com.cloud.common.util.ResultUtils;
import com.zrht.privilege.enums.ExceptionEnum;
import com.zrht.privilege.exception.PrivilegeException;
import com.zrht.privilege.service.MenuService;
import com.zrht.privilege.utils.AssertUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 权限菜单表 前端控制器
 * </p>
 *
 * @author xdj
 * @since 2019-07-19
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/menuList/{roleId}")
    @ApiOperation(value = "获取角色权限菜单列表", notes = "返回菜单列表")
    @ApiImplicitParam(name = "roleId", value = "角色id", paramType = "query", required = true, dataType = "String", defaultValue = "ealenxie")
    @ApiResponse(code = 200, message = "获取成功")
    public ResponseInfo getMenuList(@PathVariable("roleId") String roleId) {

        AssertUtil.notEmpty(roleId, new PrivilegeException(ExceptionEnum.ROLE_INFO_IS_NULL.getCode(),
                ExceptionEnum.ROLE_INFO_IS_NULL.getMessage()));

//        return new ResponseInfo(000,menuService.getMenuList(roleId));
        return ResultUtils.success(menuService.getMenuList(roleId));
    }

}

