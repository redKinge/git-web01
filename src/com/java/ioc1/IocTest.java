package com.java.ioc1;

import com.java.pojo.Chicken;
import com.java.pojo.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description:描述
 * author: 河发
 * time: 8:23
 */
public class IocTest {
    public static void main(String[] args) {


        //Dog dog = new Dog();   applicationContext.xml
        //启动spring框架：ApplicationContext 、ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器中取出创建的dog对象
       Dog smallDog1 = context.getBean("smallDog", Dog.class);
       //Chicken ck= context.getBean("ck",Chicken.class);
        smallDog1.eat();

        //关闭spring容器
    //ClassPathXmlApplicationContext类中有close方法，但是ApplicationContext接口中没有定义close方法
        ((ClassPathXmlApplicationContext)context).close();
    }
}
