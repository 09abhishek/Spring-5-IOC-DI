package com.atechlab.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneservice;
	
	public TrackCoach(FortuneService fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K Miles";
	}

	 @Override
	public String getDailyFortune() {
		
		return "Just Do it man! " + fortuneservice.getFortune();
	}
	
	// adding an init method.
	 public void domyStartupStuff(){
		 System.out.println("TrackCoach : inside init method");
	 }
	// adding a destroy method.
	 public void domyCleanupStuff(){
		 System.out.println("TrackCoach : inside destroy method");
	 }
	 
	
}
