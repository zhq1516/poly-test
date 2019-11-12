package com.spring.build.poly.dao;

import com.spring.build.poly.model.domain.MenuDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: KangYiJun
 * @date: 2019-09-27
 * 菜单权限持久层
 */
@Component
@Mapper
public interface MenuDao {

    /**
     * 获取所有权限
     * @return
     */
    List<MenuDO> getAllList();

}
