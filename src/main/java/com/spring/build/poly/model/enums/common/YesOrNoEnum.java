package com.spring.build.poly.model.enums.common;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 * 是否枚举
 */
public enum YesOrNoEnum {

    // 否
    NO(0, "否"),
    // 是
    YES(1, "是"),
    // 不确定
    UNKOWN(2, "不确定");

    private Integer value;

    private String decription;

    YesOrNoEnum(Integer value, String decription) {
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
