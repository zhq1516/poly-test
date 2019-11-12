package com.spring.build.poly.model.domain;

import com.spring.build.poly.model.enums.vip.VipConfigStatusEnum;
import com.spring.build.poly.model.enums.vip.VipExpResetTypeEnum;
import com.spring.build.poly.model.enums.common.YesOrNoEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 会员配置信息
 */
@Data
public class VipConfigDO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 配置名称
     */
    private String name;

    /**
     * 配置描述
     */
    private String description;

    /**
     * 会员经验重置类型
     */
    private VipExpResetTypeEnum expResetType;

    /**
     * 会员配置状态
     */
    private VipConfigStatusEnum status;

    /**
     * 是否删除
     */
    private YesOrNoEnum isDelete;

    /**
     * 创建日期
     */
    private Date gmtCreate;

    /**
     * 修改日期
     */
    private Date gmtModify;

}
