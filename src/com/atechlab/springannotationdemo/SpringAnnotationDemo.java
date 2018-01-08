package com.atechlab.springannotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

		Coach thecoach = context.getBean("tennisCoach",Coach.class);
		// Coach thevollycoach = context.getBean("vollyCoach",Coach.class);
		// System.out.println(thevollycoach.getDailyFoodRoutine());
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getdailyFortune());
		
		context.close();
	}

}
