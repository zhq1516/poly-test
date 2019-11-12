package com.spring.build.poly.model.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 异常基类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseException extends RuntimeException {

    private Integer code;
    private String message;
    private Object data;

    public BaseException(Status status) {
        super(status.getMessage());
        this.code = status.getCode();
        this.message = status.getMessage();
    }

    public BaseException(Status status, Object data) {
        this(status);
        this.data = data;
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BaseException(Integer code, String message, Object data) {
        this(code, message);
        this.data = data;
    }

}
