package com.maven.spring.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maven.spring.spring.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	//Bean Type below code in the parathesis!
//    	Desktop dk = context.getBean(Desktop.class);
    	Alien alien = context.getBean(Alien.class);
    	alien.code();
//    	dk.compile();
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); Alien alien = (Alien)
		 * context.getBean("alien"); Desktop d = context.getBean(Desktop.class);
		 * alien.code();
		 */
    }
}
