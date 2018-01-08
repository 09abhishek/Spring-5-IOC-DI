package com.atechlab.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneServices fortuneService;
		
	public TennisCoach(){
		System.out.println("inside default contructor");
	}
	/*
	@Autowired
	public void anyname(FortuneServices fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	public TennisCoach(FortuneServices fortuneService){
		this.fortuneService = fortuneService;
	}
	*/

	
	@Override
	public String getDailyWorkout() {
		return "Practise ball hitting for 30 mins!";
	}
	@Override
	public String getDailyFoodRoutine() {
		return "Avoid oily food";
	}
	@Override
	public String getdailyFortune() {
		return fortuneService.getFortune();
	}

}
