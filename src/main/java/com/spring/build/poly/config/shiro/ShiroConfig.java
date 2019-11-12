package com.spring.build.poly.config.shiro;

import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: KangYiJun
 * @date: 2019-09-24
 * Shiro框架配置类
 */
//@Configuration
public class ShiroConfig {

    /**
     * Session Manager：会话管理
     * 即用户登录后就是一次会话，在没有退出之前，它的所有信息都在会话中；
     * 会话可以是普通JavaSE环境的，也可以是如Web环境的；
     */
    @Bean("sessionManager")
    public SessionManager sessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        // 设置session过期时间，精确到毫秒
        sessionManager.setGlobalSessionTimeout(60 * 60 * 1000);
        sessionManager.setSessionValidationSchedulerEnabled(true);
        // 删除shiro登录时url里的JSESSION_ID
        sessionManager.setSessionIdUrlRewritingEnabled(false);
        return sessionManager;
    }

    /**
     * SecurityManager：安全管理器
     */
    @Bean("securityManager")
    public DefaultSecurityManager securityManager(UserRealm userRealm, SessionManager sessionManager) {
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        securityManager.setSessionManager(sessionManager);
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    /**
     * ShiroFilter：用于拦截需要安全控制的请求进行处理
     */
    @Bean("shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
        shiroFilter.setSecurityManager(securityManager);
        // 拦截器
        Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String,String>();
        // 配置不会被拦截的链接，按顺序判断，因为前端模板采用了thymeleaf，这里不能直接使用 ("/static/**", "anon")来配置匿名访问，必须配置到每个静态目录
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/img/**", "anon");
        filterChainDefinitionMap.put("/html/**", "anon");
        // 配置退出 过滤器,其中的具体的退出代码Shiro已经替我们实现了
        filterChainDefinitionMap.put("/logout", "logout");
        // <!-- 过滤链定义，从上向下顺序执行，一般将/**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
        // <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
        filterChainDefinitionMap.put("/**", "authc");
        // 如果不设置默认会自动寻找Web工程根目录下的"/login.html"页面
        shiroFilter.setLoginUrl("/login");
        // 登录成功后要跳转的链接
        shiroFilter.setSuccessUrl("/home");
        // 未授权界面;
        shiroFilter.setUnauthorizedUrl("/403");
        shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilter;
    }

}
