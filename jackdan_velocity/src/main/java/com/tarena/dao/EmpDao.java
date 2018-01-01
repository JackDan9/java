package com.tarena.dao;

import com.tarena.entity.Emp;
import com.tarena.annotation.MyBatisRepository;
import java.util.List;

/**
 * Created by JackDan9 on 2017/11/9.
 */

@MyBatisRepository
public interface EmpDao {
    List<Emp> findAll();
}
