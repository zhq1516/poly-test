package com.spring.build.poly.model.enums.vip;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 会员经验重置类型
 */
public enum VipExpResetTypeEnum {

    PERMANENT(1, "永久"),
    ONE_YEAR(2, "一年后重置");

    private Integer value;
    private String deccription;

    VipExpResetTypeEnum(Integer value, String deccription) {
        this.value = value;
        this.deccription = deccription;
    }

}
