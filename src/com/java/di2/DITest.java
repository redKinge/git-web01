package com.java.di2;

import com.java.pojo.DB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description:描述
 * author: 河发
 * time: 16:00
 */
public class DITest {
    public static void main(String[] args) {
        //通过set方法
        //通过有参构造方法
        //启动spring容器
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       DB db= context.getBean("haveMethod",DB.class);
        System.out.println(db);
        //关闭spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
