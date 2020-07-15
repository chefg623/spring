package com.chefg;

import com.chefg.pojo.hello;
import com.chefg.pojo.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        student student= (com.chefg.pojo.student) context.getBean("student");
        System.out.println(student.getName());
    }

}
