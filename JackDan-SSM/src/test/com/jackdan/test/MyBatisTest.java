package com.jackdan.test;

import com.jackdan.domain.User;
import com.jackdan.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by JackDan9 on 2017/12/31.
 */
public class MyBatisTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp()  throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey("111");
//        ArticleMapper articleMapper = sqlSession.getMapper(ArticleMapper.class);
//        Article article = articleMapper.selectByPrimaryId(id, '0');
        System.out.println(user);
        System.out.println('0');
    }
}
