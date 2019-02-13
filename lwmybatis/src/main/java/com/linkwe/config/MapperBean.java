package com.linkwe.config;

import lombok.Data;

import java.util.List;

/**
 * @Author: zenglw
 * @Date: 2019-01-31
 */
@Data
public class MapperBean {
    private String interfaceName; //接口名
    private List<Function> list; //接口下所有方法
}