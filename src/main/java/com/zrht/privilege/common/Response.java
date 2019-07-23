package com.zrht.privilege.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 用于封装返回结果
 *
 * @param <T>
 */


@Data
public class Response<T> implements Serializable {
    private String code;
    private String message;
    private T data;

    public Response() {
    }

    public Response(T data) {
        this.data = data;
    }

    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
