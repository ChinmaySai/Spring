package com.chinmay.autowiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinmay.configuaration.AppConfig;

public class EX_3_7_AutoWired_Annotation 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Inside Autowired Annotation Exapmle");

     Alien al=context.getBean(Alien.class);
     al.code();
     
    }
}
