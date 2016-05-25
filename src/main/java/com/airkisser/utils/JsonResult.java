package com.airkisser.utils;

import java.io.Serializable;

public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = 4095512373698538582L;

    private boolean success = true;//代表方法有没有异常
    private T data;
    private String message;

    public JsonResult(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
