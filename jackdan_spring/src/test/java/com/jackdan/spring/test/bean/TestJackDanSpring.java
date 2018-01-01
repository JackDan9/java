package com.jackdan.spring.test.bean;

import com.jackdan.spring.service.JackDanService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JackDan9 on 2017/12/13.
 */
public class TestJackDanSpring {

//    public TestJackDanSpring() {
//       super("classpath*:spring-jackdan.xml");
//        ApplicationContext content = new ClassPathXmlApplicationContext("/spring-jackdan.xml");
//    }


    @Test
    public void testSetter() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-jackdan.xml");
        JackDanService service = (JackDanService) context.getBean("jackDanService");
        service.save("This is save data");
    }
}
