package com.chinmay.scopevalueannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinmay.configuaration.AppConfig;

public class EX_3_9_Scope_Value_Annotation 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Inside Scope and Value Annotation Example");

     Alien al=context.getBean(Alien.class);
     al.code();
     System.out.println("Age : "+al.getAge());
    }
}
