package com.spring.build.poly.manager.impl;

import com.spring.build.poly.dao.MenuDao;
import com.spring.build.poly.manager.MenuManager;
import com.spring.build.poly.model.domain.MenuDO;
import com.spring.build.poly.model.vo.MenuVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: KangYiJun
 * @date: 2019-09-27
 */
@Service
public class MenuManagerImpl implements MenuManager {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<MenuVO> getAllList() {
        List<MenuVO> menuVOS = new ArrayList<>();
        List<MenuDO> menuDOS = menuDao.getAllList();
        if(null == menuDOS){
            return null;
        }else{
            menuDOS.forEach(menuDO -> {
                MenuVO menuVO = new MenuVO();
                BeanUtils.copyProperties(menuDO, menuVO);
                menuVOS.add(menuVO);
            });
        }
        return menuVOS;
    }
}
