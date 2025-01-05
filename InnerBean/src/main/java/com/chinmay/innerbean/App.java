package com.chinmay.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Alien al=context.getBean("alien",Alien.class);
        //al.age=20;
        System.out.println(al.getAge());
        al.code();
       //Desktop d=context.getBean("com",Desktop.class);
//        Computer com=context.getBean(Computer.class);
//         Desktop d1=context.getBean(Desktop.class);

     
    }
}
