package com.atechlab.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load spring configuration file applicationContext.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleapplicationContext.xml");

		// Retrieve bean from spring container.
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		// close the config file.

		context.close();
	}

}
