package com.atechlab.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach thecoach = context.getBean("swimCoach",SwimCoach.class);
		// Coach thevollycoach = context.getBean("vollyCoach",Coach.class);
		// System.out.println(thevollycoach.getDailyFoodRoutine());
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getdailyFortune());
		
		// calling the new methods of getemail nd getname from injected from prop.
		System.out.println(thecoach.getTeam());
		System.out.println(thecoach.getEmail());
		context.close(); 
	}

}
