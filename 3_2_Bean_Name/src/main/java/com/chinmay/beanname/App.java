package com.chinmay.beanname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinmay.configuaration.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    		
    System.out.println("Inside Java Based Config");
     Desktop desktop=context.getBean("desktop",Desktop.class);
     Desktop desktop1=context.getBean("com1",Desktop.class);
     Desktop desktop2=context.getBean("Beast",Desktop.class);
     
     System.out.println(desktop.hashCode());
     System.out.println(desktop1.hashCode());
     System.out.println(desktop2.hashCode());
     
     
    }
}
