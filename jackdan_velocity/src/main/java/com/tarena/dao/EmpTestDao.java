package com.tarena.dao;

import com.tarena.entity.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by JackDan9 on 2017/11/10.
 */
public class EmpTestDao {
    @Test
    public void testFindAll() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao dao = ctx.getBean(EmpDao.class);
        List<Emp> list = dao.findAll();
        for (Emp e : list) {
            System.out.println(
                    e.getEmpno() + " " +
                    e.getEname() + " " +
                    e.getJob()
            );
        }
    }

}
