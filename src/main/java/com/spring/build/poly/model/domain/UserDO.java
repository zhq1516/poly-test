package com.spring.build.poly.model.domain;

import com.spring.build.poly.model.enums.common.SexEnum;
import com.spring.build.poly.model.enums.common.YesOrNoEnum;
import com.spring.build.poly.model.enums.user.UserStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 * 用户类
 */
@Data
public class UserDO implements Serializable {

    private static final long serialVersionUID = 3563698058430569135L;

    /**
     * 唯一ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 加密盐
     */
    private String salt;

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 展示昵称
     */
    private String nickName;

    /**
     * 性别
     */
    private SexEnum sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 用户状态
     */
    private UserStatusEnum status;

    /**
     * 是否删除
     */
    private YesOrNoEnum isDelete;

    /**
     * 最近一次登录时间
     */
    private Date lastLoginTime;

    /**
     * 创建日期
     */
    private Date gmtCreate;

    /**
     * 更新日期
     */
    private Date gmtModify;

}
