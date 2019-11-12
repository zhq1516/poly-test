package com.spring.build.poly.model.enums.user;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 用户行为枚举
 */
public enum UserBehaviorEnum {

    // 登录
    LOGIN(1, "用户登录"),
    // 登出
    LOGOUT(2, "用户登出"),
    // 请求接口
    REQUEST(3, "用户请求");

    private Integer value;
    private String decription;

    UserBehaviorEnum(Integer value, String decription) {
        this.value = value;
        this.decription = decription;
    }

}
