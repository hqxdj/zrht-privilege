package com.zrht.privilege.exception;

import com.cloud.common.bean.ResponseInfo;
import com.cloud.common.util.ResultUtils;
import com.zrht.privilege.enums.ExceptionEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author xdj
 * @version V1.0
 * @ProjectName: zrht-privilege
 * @Description: 权限异常信息捕获
 * @Date 2019/7/23 16:39
 * Copyright (c)   xdj
 */

@Slf4j
@ControllerAdvice
@ResponseBody
public class PrivilegeExceptionHandler {

    /**
     * 授权失败
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(AuthorizationException.class)
    public ResponseInfo handleAuthorizationException(Exception exception) {
        log.error(exception.getMessage(), exception);
        return ResultUtils.error(ExceptionEnum.AUTHORIZATION_FAILURE.getCode(),
                ExceptionEnum.AUTHORIZATION_FAILURE.getMessage());
    }

    /**
     * 非法参数异常
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseInfo handleIllegalArgumentException(Exception exception) {
        log.error(exception.getMessage(), exception);
        return ResultUtils.error(ExceptionEnum.AUTHORIZATION_FAILURE.getCode(),
                exception.getMessage());
    }

    /**
     * 权限异常
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(PrivilegeException.class)
    public ResponseInfo handlePrivilegeException(PrivilegeException exception) {
        log.error(exception.getMessage(), exception);
        return ResultUtils.error(exception.getCode(),
                exception.getMessage());
    }


}
