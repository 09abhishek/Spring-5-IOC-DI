package com.atechlab.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration file applicationContext.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");

		// Retrieve bean from spring container.
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if the both beans are same.
		boolean result = (theCoach== alphaCoach);

		System.out.println("\nIs both Pointing to the same Object " + result);
		System.out.println("\nMemory location for theCoach " + theCoach);	
		System.out.println("\nMemory location for alphacoach" + alphaCoach);

		// close the config file.

		context.close();
	}

}
