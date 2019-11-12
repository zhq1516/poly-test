package com.spring.build.poly.model.enums.vip;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 会员配置状态枚举
 */
public enum VipConfigStatusEnum {

    // 启用
    ENABLE(1, "启用"),
    // 禁用
    DISABLE(2, "禁用"),
    // 弃用
    ABANDONING(3, "弃用");

    private Integer value;
    private String decription;

    VipConfigStatusEnum(Integer value, String decription) {
        this.value = value;
        this.decription = decription;
    }

}
