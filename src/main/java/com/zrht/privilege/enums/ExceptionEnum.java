package com.zrht.privilege.enums;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 异常信息类
 * @Date 2019/7/23 16:17
 * Copyright (c)   xdj
 */

public enum ExceptionEnum {
    USER_INFO_IS_NULL(20000, "用户信息为空！"),
    ROLE_INFO_IS_NULL(20001, "角色信息为空！"),
    PRIVILEGE_INFO_IS_NULL(20002, "全信息为空！"),
    //    USER_INFO_IS_NULL("pri_10003", "用户信息为空！"),
//    USER_INFO_IS_NULL("pri_10004", "用户信息为空！"),
    AUTHORIZATION_FAILURE(20003, "授权失败！"),


    ;


    private Integer code;
    private String message;

    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
