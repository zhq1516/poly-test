package com.spring.build.poly.model.enums.common;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 性别枚举
 */
public enum SexEnum {

    // 男性
    MALE(1, "男性"),
    // 女性
    FEMALE(2, "女性"),
    // 不确定
    UNKOWN(3, "不确定");

    private Integer value;

    private String decription;

    SexEnum(Integer value, String decription) {
        this.value = value;
        this.decription = decription;
    }

}
