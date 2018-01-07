package com.atechlab.springdemo;

public class BaseballCoach implements Coach {

	// defining a private field for the dependency
	private FortuneService fortuneservice;

	// defining a constructor for dependency injection.

	public BaseballCoach(FortuneService theFortuneservice) {
		fortuneservice = theFortuneservice;
	}
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 mins on batting pratice.";

	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}
}
