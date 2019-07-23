package com.zrht.privilege.filter;

import com.zrht.privilege.dto.UserInfoParamDTO;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: session过滤器
 * @Date 2019/7/22 17:42
 * Copyright (c)   xdj
 */

@Component
public class SessionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        UserInfoParamDTO user = (UserInfoParamDTO) request.getSession().getAttribute("user");
        if (user != null) {
            request.getSession().removeAttribute("user");
            request.getSession().setAttribute("user", user);
        }

        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {

    }
}
