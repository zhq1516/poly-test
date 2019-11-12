package com.spring.build.poly.service;

import com.spring.build.poly.model.query.UserQuery;
import com.spring.build.poly.model.vo.UserVO;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 */
public interface IUserService {

    UserVO getUserInfoByQuery(UserQuery query);

}
