package com.spring.build.poly.manager;

import com.spring.build.poly.model.vo.MenuVO;

import java.util.List;

/**
 * @author: KangYiJun
 * @date: 2019-09-27
 */
public interface MenuManager {

    /**
     * 获取所有菜单/授权
     * @return
     */
    List<MenuVO> getAllList();

}
