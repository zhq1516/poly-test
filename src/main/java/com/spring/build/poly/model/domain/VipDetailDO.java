package com.spring.build.poly.model.domain;

import com.spring.build.poly.model.enums.common.YesOrNoEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 会员详情
 */
@Data
public class VipDetailDO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 会员编号
     */
    private String vipNo;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 会员配置ID
     */
    private Long vipConfigId;

    /**
     * 经验
     */
    private Long experience;

    /**
     * 是否删除
     */
    private YesOrNoEnum isDelete;

    /**
     * 创建日期
     */
    private Date gmtCreate;

    /**
     * 更新日期
     */
    private Date gmtModify;

}
