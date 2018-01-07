package com.atechlab.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		
	// load spring configuration file applicationContext.xml
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	// Retrieve bean from spring container.
	
	CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
	
	// Call methods on the bean.
		
	System.out.println(theCoach.getDailyWorkout());
	
	System.out.println(theCoach.getDailyFortune());
	
	//call the new methods to get the literal values.
	System.out.println("Value fetched from properties file :  " +theCoach.getHeadEmailAddress());
	System.out.println("Value fetched from the spring config file(hardcoded)  : " + theCoach.getEmailAddress());
	
	System.out.println(theCoach.getTeam());
	
	// close the config file.
	
	context.close();
	}

}
