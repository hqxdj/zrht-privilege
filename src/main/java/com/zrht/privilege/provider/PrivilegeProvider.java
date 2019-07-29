package com.zrht.privilege.provider;

import com.cloud.common.bean.ResponseInfo;
import com.cloud.common.feign.FeignInvoke;
import com.zrht.privilege.entity.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 提供权限操作的接口
 * @Date 2019/7/26 16:03
 * Copyright (c)   xdj
 */

@FeignClient("zrht-privilege")
public interface PrivilegeProvider {

    @FeignInvoke
    @PostMapping("/menu/menuList")
    ResponseInfo<List<Menu>> getMenuList(String roleId);


}
