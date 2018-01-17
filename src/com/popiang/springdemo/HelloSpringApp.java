package com.popiang.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the method from the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}

}
