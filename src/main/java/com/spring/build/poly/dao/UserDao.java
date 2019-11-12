package com.spring.build.poly.dao;

import com.spring.build.poly.model.domain.UserDO;
import com.spring.build.poly.model.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 * 用户持久层
 */
@Mapper
@Component
public interface UserDao {

    /**
     * 查询用户
     *
     * @param query
     * @return
     */
    UserDO getUserByQuery(UserQuery query);

    /**
     * 创建用户
     *
     * @param userDO
     * @return
     */
    Integer createUser(UserDO userDO);


    UserDO getLoginUser(String username);

}
