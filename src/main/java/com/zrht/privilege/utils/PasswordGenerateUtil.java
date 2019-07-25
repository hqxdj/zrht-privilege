package com.zrht.privilege.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 密码生成策略
 * @Date 2019/7/24 14:53
 * Copyright (c)   xdj
 */

public class PasswordGenerateUtil {

    public static String getPassword(String password, String salt, int hashTime) {
        Md5Hash md5Hash = new Md5Hash(password, salt, hashTime);
        return md5Hash.toString();
    }

    public static void main(String[] args) {
        String string = getPassword("123xdj", "zrht", 2);
        System.out.println(string);
    }
}
