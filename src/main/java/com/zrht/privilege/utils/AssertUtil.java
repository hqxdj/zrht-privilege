package com.zrht.privilege.utils;

import com.zrht.privilege.exception.PrivilegeException;
import org.apache.commons.lang3.StringUtils;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 自定义的校验工具
 * @Date 2019/7/24 9:43
 * Copyright (c)   xdj
 */

public class AssertUtil {

    public static void notNull(Object object, Exception e) {
        if (object == null) {
            if (e instanceof PrivilegeException) {
                throw (PrivilegeException) e;
            }
        }
    }


    public static void notEmpty(String string, Exception e) {
        if (StringUtils.isEmpty(string)) {
            if (e instanceof PrivilegeException) {
                throw (PrivilegeException) e;
            }
        }
    }
}
