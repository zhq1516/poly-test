package com.spring.build.poly.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author: KangYiJun
 * @date: 2019-09-23
 * 通用分页查询结果返回
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 3290266529111834953L;

    /**
     * 当前页数据
     */
    private List<T> rows;

    /**
     * 总条数
     */
    private Long total;

    public static <T> PageResult of(List<T> rows, Long total) {
        return new PageResult<>(rows, total);
    }

}
