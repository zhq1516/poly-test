package com.spring.build.poly.service.impl;

import com.spring.build.poly.manager.UserManager;
import com.spring.build.poly.model.query.UserQuery;
import com.spring.build.poly.model.vo.UserVO;
import com.spring.build.poly.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserManager userManager;

    @Override
    public UserVO getUserInfoByQuery(UserQuery query) {
        return userManager.getUserInfoByQuery(query);
    }

}
