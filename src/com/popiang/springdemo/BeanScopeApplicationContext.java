package com.popiang.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApplicationContext {

	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same object: " + result);
		
		System.out.println("theCoach memory location: " + theCoach);
		
		System.out.println("alphaCoach memory location: " + alphaCoach);
		
		context.close();
	}

}
