package com.atechlab.springannotationdemo;

import org.springframework.stereotype.Component;
// here we are not explicitly assigning any bean ID. so the spring will assume the component name as "vollyCoach"
@Component
public class VollyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
	
		return "Do Volleyball ball push activity 40 mins";
	}

	@Override
	public String getDailyFoodRoutine() {
		
		return "Do not eat oily foods";
	}

	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
 