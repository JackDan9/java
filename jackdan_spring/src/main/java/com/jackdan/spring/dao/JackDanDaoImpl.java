package com.jackdan.spring.dao;

/**
 * Created by JackDan9 on 2017/12/13.
 */
public class JackDanDaoImpl implements JackDanDao {
    @Override
    public void save(String arg) {
        System.out.println("Save Data: " + arg);
    }
}
