package com.zrht.privilege.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {
    private String code;
    private String message;
    private T data;

    public Response(T data) {
        this.data = data;
    }


}
