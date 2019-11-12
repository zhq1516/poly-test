package com.spring.build.poly.model.vo;

import com.spring.build.poly.model.enums.MenuTypeEnum;
import com.spring.build.poly.model.enums.common.YesOrNoEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author: KangYiJun
 * @date: 2019-09-27
 */
@Data
public class MenuVO {

    private Long id;

    private Long parentId;

    private String name;

    private String url;

    private String perms;

    private MenuTypeEnum type;

    private String icon;

    private Integer orderNum;

    private Date gmtCreate;

    private Date gmtModify;

}
