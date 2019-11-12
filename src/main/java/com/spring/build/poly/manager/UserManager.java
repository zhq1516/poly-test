package com.spring.build.poly.manager;

import com.spring.build.poly.model.dto.UserDTO;
import com.spring.build.poly.model.query.UserQuery;
import com.spring.build.poly.model.vo.UserVO;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 */
public interface UserManager {

    UserVO getUserInfoByQuery(UserQuery query);

    /**
     * 获取登录用户信息
     * @param username
     * @return
     */
    UserDTO getLoginUserByUsername(String username);

}
