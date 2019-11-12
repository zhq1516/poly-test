package com.spring.build.poly.controller;

import com.spring.build.poly.model.common.ApiResponse;
import com.spring.build.poly.model.query.UserQuery;
import com.spring.build.poly.model.vo.UserVO;
import com.spring.build.poly.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: KangYiJun
 * @date: 2019-09-19
 */
@RestController
public class BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "home")
    public ModelAndView home(ModelMap map) {

        UserQuery query = new UserQuery();
        query.setUsername("admin");
        UserVO result = userService.getUserInfoByQuery(query);

        if(null == result){
            result = new UserVO();
            result.setUsername("未获取到用户账号");
        }

        map.put("user", result);
        map.put("title", "测试页面第一波");
        return new ModelAndView("page/home");
    }

    @RequestMapping(value = "login")
    public ModelAndView login(ModelMap map){
        map.put("msg","测试信息");
        return new ModelAndView("login");
    }

    @RequestMapping(value = "test1")
    public ModelAndView test1(ModelMap map){
        map.put("msg","测试页面1");
        return new ModelAndView("page/chart");
    }

    @RequestMapping(value = "test2")
    public ModelAndView test2(ModelMap map){
        map.put("msg","测试页面2");
        return new ModelAndView("page/test");
    }


}
