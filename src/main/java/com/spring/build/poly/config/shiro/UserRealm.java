package com.spring.build.poly.config.shiro;

import com.spring.build.poly.dao.MenuDao;
import com.spring.build.poly.dao.UserDao;
import com.spring.build.poly.model.domain.MenuDO;
import com.spring.build.poly.model.domain.UserDO;
import com.spring.build.poly.model.enums.user.UserStatusEnum;
import com.spring.build.poly.utils.ShiroUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author: KangYiJun
 * @date: 2019-09-24
 * 域对象配置
 */
//@Component
public class UserRealm extends AuthorizingRealm {

    @Resource
    private UserDao userDao;

    @Resource
    private MenuDao menuDao;

    /**
     * 授权(验证权限时调用)
     * 获取用户权限集合
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        UserDO user = (UserDO) principals.getPrimaryPrincipal();
        if (null == user) {
            throw new UnknownAccountException("账号不存在");
        }
        List<String> permsList;
        // 默认用户拥有最高权限
        List<MenuDO> menuList = menuDao.getAllList();
        permsList = new ArrayList<>(menuList.size());
        menuList.forEach(menu -> permsList.add(menu.getPerms()));
        // 用户权限列表
        Set<String> permsSet = new HashSet<>();
        permsList.forEach(perms -> {
            if(!StringUtils.isEmpty(perms)){
                permsSet.addAll(Arrays.asList(perms.trim().split(",")));
            }
        });
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(permsSet);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authToken;
        // 查询用户信息
        UserDO user = userDao.getLoginUser(token.getUsername());
        if(null == user){
            throw new UnknownAccountException("账号或密码不正确");
        }
        if(UserStatusEnum.ENABLE != user.getStatus()){
            throw new LockedAccountException("账号已被注销或禁用，请联系管理员");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), ByteSource.Util.bytes(user.getSalt()), getName());
        return info;
    }

    @Override
    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
        HashedCredentialsMatcher shaCredentialsMatcher = new HashedCredentialsMatcher();
        shaCredentialsMatcher.setHashAlgorithmName(ShiroUtils.HASH_ALGORITHM_NAME);
        shaCredentialsMatcher.setHashIterations(ShiroUtils.HASH_ITERATIONS);
        super.setCredentialsMatcher(shaCredentialsMatcher);
    }

}
