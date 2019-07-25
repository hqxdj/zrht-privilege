package com.zrht.privilege.enums;

/**
 * 用于定义返回结果信息的枚举值
 */
public enum ResponseCodeEnum {
    RESPONSE_CODE_FAILURE(10000, "请求失败、结果处理失败"),
    RESPONSE_CODE_SUCCESS(10001, "请求成功、结果处理成功"),
    RESPONSE_CODE_PARAM_FORMAT_ERROR(10002, "请求失败、参数格式错误"),
    RESPONSE_CODE_PARAM_ERROR(10003, "参数错误"),
    RESPONSE_CODE_REQ_CANNOT_EMPTY(10004, "必要的请求参数不能为空"),
    RESPONSE_CODE_USER_DOES_NOT_EXIST(10005, "用户不存在"),
    RESPONSE_CODE_QUERY_SUCCESS(10006, "数据查询成功"),
    RESPONSE_CODE_QUERY_NO_DATA(10007, "无数据或者结果"),
    USER_LOGIN_PWD_ERROR(10008, "用户名密码错误"),
    REQUEST_URL_NOT_SERVICE(10009, "访问了非服务路径"),
    RESPONSE_CODE_UNLOGIN_ERROR(421, "未登录异常"),
    RESPONSE_CODE_LOGIN_SUCCESS(200, "用户登录成功"),
    RESPONSE_CODE_NO_PERMISSION(403, "无权访问该系统"),
    RESPONSE_CODE_SYSTEM_ERROR(500, "系统内部异常"),
    RESPONSE_CODE_TIME_OUT(504, "上游服务端网关超时");

    private Integer code;
    private String message;

    ResponseCodeEnum(Integer code, String message) {
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
