package com.zrht.privilege.enums;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 是和否枚举
 * @Date 2019/7/24 9:58
 * Copyright (c)   xdj
 */

public enum YesOrNoEnum {
    YES(0, "是"),
    NO(1, "否"),
    ;


    private Integer code;
    private String message;

    YesOrNoEnum(Integer code, String message) {
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
