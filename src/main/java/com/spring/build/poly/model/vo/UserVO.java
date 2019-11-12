package com.spring.build.poly.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.spring.build.poly.model.enums.user.UserStatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 */
@Getter
@Setter
public class UserVO {

    /**
     * 唯一ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户角色
     */
    private String role;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 用户编号
     */
    private String userCode;

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
     * 创建日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreate;

    /**
     * 更新日期
     */
    private Date gmtModify;

}
