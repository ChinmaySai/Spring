package com.chinmay.primarybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    	System.out.println("After Object Creation ");
        Alien al=(Alien) context.getBean("alien");
        //al.age=20;
        System.out.println(al.getAge());
        al.code();
    }
}
