package com.chefg;

import com.chefg.pojo.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
        //获取上下文对象
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        hello hello = (hello) context.getBean("hello");

        System.out.println(hello);


    }

}
