package com.spring.build.poly.model.enums.user;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 * 用户状态枚举
 */
public enum UserStatusEnum {

    // 启用状态
    ENABLE(1, "启用"),
    // 禁用状态
    DISABLE(2, "禁用"),
    // 系统自动注销
    AUTO_CANCEL(3, "系统自动注销"),
    // 注销状态
    CANCEL(4, "注销");

    private Integer value;
    private String description;

    UserStatusEnum(Integer value, String description) {
        this.value = value;
        this.description = description;
    }

    public Integer getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
