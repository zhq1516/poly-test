package com.spring.build.poly.model.common;

/**
 * @author: KangYiJun
 * @date: 2019-09-26
 */
public enum ErrorCodeEnum {

    // 非法参数
    PARAM_ERROR("PARAM_ERROR", "非法参数");

    private String code;
    private String msg;
    ErrorCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
