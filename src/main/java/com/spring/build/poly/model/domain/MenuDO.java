package com.spring.build.poly.model.domain;

import com.spring.build.poly.model.enums.MenuTypeEnum;
import com.spring.build.poly.model.enums.common.YesOrNoEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author: KangYiJun
 * @date: 2019-09-27
 */
@Data
public class MenuDO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 父级菜单ID
     */
    private Long parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单URL
     */
    private String url;

    /**
     * 授权
     */
    private String perms;

    /**
     * 类型
     */
    private MenuTypeEnum type;

    /**
     * 图标
     */
    private String icon;

    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 是否删除
     */
    private YesOrNoEnum isDelete;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModify;

}
