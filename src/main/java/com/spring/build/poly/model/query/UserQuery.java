package com.spring.build.poly.model.query;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 */
@Getter
@Setter
public class UserQuery {

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 创建日期（始）
     */
    private Date gmtCreateStart;

    /**
     * 创建日期（终）
     */
    private Date gmtCreateEnd;

}
