package com.chinmay.componentannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinmay.configuaration.AppConfig;

public class EX_3_6_Component_Annotation 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Inside Component Annotation Exapmle");

     Alien al=context.getBean(Alien.class);
     al.code();
     
    }
}
