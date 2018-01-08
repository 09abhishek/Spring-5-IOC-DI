package com.atechlab.springannotationdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

	private FortuneServices fortuneServices;
	
	public SwimCoach(FortuneServices fortuneServices) {
		this.fortuneServices = fortuneServices;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Swim 100 mins";
	}

	@Override
	public String getdailyFortune() {
		
		return fortuneServices.getFortune();
	}

	@Override
	public String getDailyFoodRoutine() {

		return fortuneServices.getFortune();
	}

}
