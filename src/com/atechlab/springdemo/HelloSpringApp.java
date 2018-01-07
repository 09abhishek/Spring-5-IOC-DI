package com.atechlab.springdemo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args)throws IOException {
		// load the spring configuration file.
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		
		//System.out.println("Execution of beans");
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		
		// call method on the bean
		
		System.out.println("\n"+theCoach.getDailyWorkout());
		 
		// call method for the fortune
		System.out.println(theCoach.getDailyFortune()+"\n");
		
		// close the context  
		context.close();
		
	}

}
