package com.spring.build.poly.dao;

import com.spring.build.poly.model.domain.RoleDO;
import com.spring.build.poly.model.query.RoleQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: KangYiJun
 * @date: 2019-09-24
 * 用户角色持久层
 */
@Mapper
@Component
public interface RoleDao {

    /**
     * 获取所有角色
     *
     * @return
     */
    List<RoleDO> getAllList();

    /**
     * 根据用户ID获取角色列表
     * @param userId
     * @return
     */
    List<RoleDO> getListByUserId(Long userId);

}
