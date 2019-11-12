package com.spring.build.poly.utils;

import com.spring.build.poly.model.domain.UserDO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * @author: KangYiJun
 * @date: 2019-09-27
 */
public class ShiroUtils {

    /**  加密算法 */
    public final static String HASH_ALGORITHM_NAME = "SHA-256";

    /**  循环次数 */
    public final static int HASH_ITERATIONS = 16;

    public static String sha256(String password, String salt) {
        return new SimpleHash(HASH_ALGORITHM_NAME, password, salt, HASH_ITERATIONS).toString();
    }

    //获取一个测试账号 admin
    /*public static void main(String[] args) {
        System.out.println(sha256("123456","110")) ;
    }*/

    /**
     * 获取会话
     */
    public static Session getSession() {
        return SecurityUtils.getSubject().getSession();
    }
    /**
     * Subject：主体，代表了当前“用户”
     */
    public static Subject getSubject() {
        return SecurityUtils.getSubject();
    }

    public static UserDO getUserEntity() {
        return (UserDO)SecurityUtils.getSubject().getPrincipal();
    }

    public static Long getUserId() {
        return getUserEntity().getId();
    }

    public static void setSessionAttribute(Object key, Object value) {
        getSession().setAttribute(key, value);
    }

    public static Object getSessionAttribute(Object key) {
        return getSession().getAttribute(key);
    }

    public static boolean isLogin() {
        return SecurityUtils.getSubject().getPrincipal() != null;
    }

    public static void logout() {
        SecurityUtils.getSubject().logout();
    }

}
