package com.spring.build.poly.model.common;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * REST API 错误码接口
 */
public interface IStatus {

    /**
     * 状态码
     *
     * @return 状态码
     */
    Integer getCode();

    /**
     * 返回信息
     *
     * @return 返回信息
     */
    String getMessage();

}
