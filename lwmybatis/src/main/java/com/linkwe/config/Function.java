package com.linkwe.config;

import lombok.Data;

/**
 * @Author: zenglw
 * @Date: 2019-01-31
 */
@Data
public class Function {
    private String sqltype;
    private String funcName;
    private String sql;
    private Object resultType;
    private String parameterType;
}

