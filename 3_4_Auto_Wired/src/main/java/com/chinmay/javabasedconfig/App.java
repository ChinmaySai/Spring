package com.chinmay.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinmay.configuaration.AppConfig;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Inside Auto Wired Exapmle");

     Alien al=context.getBean(Alien.class);
     al.code();
     
    }
}
