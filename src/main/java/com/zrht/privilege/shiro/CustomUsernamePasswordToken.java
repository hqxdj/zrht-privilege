package com.zrht.privilege.shiro;

import lombok.Data;
import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 自定义实现token类
 * @Date 2019/8/1 15:36
 * Copyright (c)   xdj
 */
@Data
public class CustomUsernamePasswordToken extends UsernamePasswordToken {

    private String roleId;

    public CustomUsernamePasswordToken(final String username, final char[] password, String roleId) {
        super(username, password);
        this.roleId = roleId;

    }
}
