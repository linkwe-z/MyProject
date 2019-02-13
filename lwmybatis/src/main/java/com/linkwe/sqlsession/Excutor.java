package com.linkwe.sqlsession;

/**
 * @Author: zenglw
 * @Date: 2019-01-31
 */
public interface Excutor {
     <T> T query(String statement,Object parameter);
}
