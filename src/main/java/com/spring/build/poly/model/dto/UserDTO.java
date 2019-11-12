package com.spring.build.poly.model.dto;

import com.spring.build.poly.model.domain.PermissionDO;
import com.spring.build.poly.model.domain.RoleDO;
import com.spring.build.poly.model.enums.user.UserStatusEnum;
import lombok.Data;

import java.util.List;

/**
 * @author: KangYiJun
 * @date: 2019-09-27
 * 内部传输-用户类
 */
@Data
public class UserDTO {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 用户登录名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 用户状态
     */
    private UserStatusEnum status;

    /**
     * 角色列表
     */
    private List<RoleDO> roleList;

    /**
     * 权限列表
     */
    private List<PermissionDO> permissionList;

}
