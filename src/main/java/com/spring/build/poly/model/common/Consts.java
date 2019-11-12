package com.spring.build.poly.model.common;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 常量池
 */
public interface Consts {

    /**
     * JWT 在 Redis 中保存的key前缀
     */
    String REDIS_JWT_KEY_PREFIX = "security:jwt:";

    /**
     * 星号
     */
    String SYMBOL_STAR = "*";

    /**
     * 邮箱符号
     */
    String SYMBOL_EMAIL = "@";

    /**
     * 引号
     */
    String SYMBOL_QUOT = "\"";

    /**
     * 默认当前页码
     */
    Integer DEFAULT_CURRENT_PAGE = 1;

    /**
     * 默认每页条数
     */
    Integer DEFAULT_PAGE_SIZE = 10;

}
