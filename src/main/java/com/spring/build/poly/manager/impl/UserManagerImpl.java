package com.spring.build.poly.manager.impl;

import com.spring.build.poly.dao.UserDao;
import com.spring.build.poly.manager.UserManager;
import com.spring.build.poly.model.domain.UserDO;
import com.spring.build.poly.model.dto.UserDTO;
import com.spring.build.poly.model.query.UserQuery;
import com.spring.build.poly.model.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 */
@Service
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserDao userDao;

    @Override
    public UserVO getUserInfoByQuery(UserQuery query) {
        UserVO userVO = new UserVO();
        UserDO userDO = userDao.getUserByQuery(query);
        if (null == userDO) {
            return null;
        } else {
            BeanUtils.copyProperties(userDO, userVO);
        }
        return userVO;
    }

    @Override
    public UserDTO getLoginUserByUsername(String username) {
        UserDTO userDTO = new UserDTO();
        UserDO userDO = userDao.getLoginUser(username);
        if(null == userDO){
            return null;
        }else{

        }
        return null;
    }

}
