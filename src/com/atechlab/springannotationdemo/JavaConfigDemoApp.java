package com.atechlab.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach thecoach = context.getBean("tennisCoach",Coach.class);
		// Coach thevollycoach = context.getBean("vollyCoach",Coach.class);
		// System.out.println(thevollycoach.getDailyFoodRoutine());
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getdailyFortune());
		
		context.close();
	}

}
