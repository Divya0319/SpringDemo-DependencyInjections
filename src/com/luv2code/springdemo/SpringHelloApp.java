package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach myCoach = appContext.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		
		System.out.println(myCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(myCoach.getDailyFortune());
		
		// close the context
		appContext.close();
	}

}
