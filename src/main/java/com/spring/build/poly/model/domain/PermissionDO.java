package com.spring.build.poly.model.domain;

import com.spring.build.poly.model.enums.PermissionTypeEnum;
import com.spring.build.poly.model.enums.common.YesOrNoEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author: KangYiJun
 * @date: 2019-09-27
 */
@Data
public class PermissionDO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**‘
     * 权限类型
     */
    private PermissionTypeEnum type;

    /**
     * 地址
     */
    private String url;

    /**
     * 权限字符串
     */
    private String permission;

    /**
     * 父编号
     */
    private Long parentId;

    /**
     * 父编号列表
     */
    private String parentIds;

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
