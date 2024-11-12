package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main( String[] args ) {
    	
    	ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("configure.xml");
    	
    	JavaTrainee j=(JavaTrainee)cpx.getBean("java");
    	System.out.println(j);
    	System.out.println(j.getName());
    	
    	SqlTrainee s=(SqlTrainee)cpx.getBean("sql");
    	System.out.println(s);
    	System.out.println(s.getName());
    	
    	WebTrainee w=(WebTrainee)cpx.getBean("web");
    	System.out.println(w);
    	System.out.println(w.getName());
    	

    }
}
