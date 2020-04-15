package org.example.spring.mvc.spring;

import org.example.spring.mvc.bean.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author rice
 * @version 1.0
 * @date 2020/4/8 21:18
 */
public class TestSpring {


    public static void main(String[] args) {
        //实例化方式一
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        //方式二
//        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/javaEE-SpringMVC/src/main/resources/app-context.xml");
        TestBean service = (TestBean)context.getBean("testBean",TestBean.class);
        System.out.println(service.toString());
    }
}
