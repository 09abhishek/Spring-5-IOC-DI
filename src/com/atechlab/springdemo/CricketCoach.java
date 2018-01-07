package com.atechlab.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	private String headEmailAddress;
		
	public String getHeadEmailAddress() {
		return headEmailAddress;
	}
	public void setHeadEmailAddress(String headEmailAddress) {
		this.headEmailAddress = headEmailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach : inside setter method - set EmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Cricket coach : inside setter method - set team");
		this.team = team;
	}
	
	// creating  a no-arg constructor
	
	public CricketCoach() {
		System.out.println("Cricket coach : inside no arg contructor");
	}
	// our setter method that will be called by spring to inject the DI  
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach : inside Setter method - SetFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Fast bolwing for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		
		return fortuneService.getFortune();
	}

}
