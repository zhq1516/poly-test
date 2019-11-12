package com.spring.build.poly.model.enums.user;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 用户角色枚举
 */
public enum UserRoleEnum {

    // 超级管理员
    ADMIN(1, "超级管理员"),
    // 普通管理员
    CUSTOM(2, "普通管理员"),
    // 普通用户
    CUSTOM_USER(3, "普通用户"),
    // VIP用户
    VIP_USER(4, "会员用户");

    private Integer value;

    private String decription;

    UserRoleEnum(Integer value, String decription) {
        this.value = value;
        this.decription = decription;
    }

    public Integer getValue() {
        return value;
    }

    public String getDecription() {
        return decription;
    }
}
