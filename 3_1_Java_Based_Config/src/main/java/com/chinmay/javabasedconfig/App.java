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
    		
    System.out.println("Inside Java Based Config");
     Desktop desktop=context.getBean(Desktop.class);
     desktop.compile();
           Desktop d1=context.getBean(Desktop.class);

     
    }
}
