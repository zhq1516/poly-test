package com.spring.build.poly.model.domain;

import com.spring.build.poly.model.enums.common.YesOrNoEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 */
@Data
public class RoleDO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 角色枚举值
     */
    private String roleEnum;

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 是否删除
     */
    private YesOrNoEnum isDelete;

    /**
     * 创建者ID
     */
    private Long createUserId;

    /**
     * 创建日期
     */
    private Date gmtCreate;

    /**
     * 更新日期
     */
    private Date gmtModify;

}
