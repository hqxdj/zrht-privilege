package com.zrht.privilege.exception;

import lombok.Data;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 权限异常
 * @Date 2019/7/24 9:14
 * Copyright (c)   xdj
 */
@Data
public class PrivilegeException extends RuntimeException {

    private Integer code;

    public PrivilegeException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
