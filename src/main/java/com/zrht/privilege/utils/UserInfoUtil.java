package com.zrht.privilege.utils;

import com.zrht.privilege.dto.UserInfoParamDTO;
import lombok.Data;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 用于获取用户信息
 * @Date 2019/7/22 17:29
 * Copyright (c)   xdj
 */
@Data
public class UserInfoUtil {

    private static final ThreadLocal<UserInfoParamDTO> local = new ThreadLocal<>();

    public static void setLocal(UserInfoParamDTO user) {
        local.set(user);
    }

    public static UserInfoParamDTO getlocal() {
        return local.get();
    }

    public static void remove() {
        local.remove();
    }
}
