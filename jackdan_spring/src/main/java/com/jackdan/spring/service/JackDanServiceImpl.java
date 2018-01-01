package com.jackdan.spring.service;

import com.jackdan.spring.dao.JackDanDao;

/**
 * Created by JackDan9 on 2017/12/13.
 */
public class JackDanServiceImpl implements JackDanService {

    private JackDanDao jackDanDao;

    public void setJackDanDao(JackDanDao jackDanDao) {
        this.jackDanDao = jackDanDao;
    }

    @Override
    public void save(String arg) {
        System.out.println("Service Operate: " + arg);
        arg = arg + ":" + this.hashCode();
        jackDanDao.save(arg);
    }
}
