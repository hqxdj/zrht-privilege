package com.zrht.privilege.listener;

import com.zrht.privilege.dto.UserInfoParamDTO;
import com.zrht.privilege.utils.UserInfoUtil;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: session属性监听器
 * @Date 2019/7/22 18:07
 * Copyright (c)   xdj
 */
@WebListener
@Component
public class SessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        if ("user".equals(se.getName())) {
            UserInfoUtil.setLocal((UserInfoParamDTO) se.getValue());
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        if ("user".equals(se.getName())) {
            UserInfoUtil.remove();
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        if ("user".equals(se.getName())) {
            UserInfoUtil.setLocal((UserInfoParamDTO) se.getValue());
        }
    }
}
