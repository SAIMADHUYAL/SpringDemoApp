package com.saimadhu.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//Create Private variables
	
	private String emailAddress;
	private String team;
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside Setter Method- setEmailId");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside Setter Method-setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice 15min of Fast Bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	//Create a no-arg constructor
//	public CricketCoach() {
//		System.out.println("CricketCoach: inside no-arg Constructor");
//	}

	//create a setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside Setter Method-setFortuneService");
		this.fortuneService = fortuneService;
	}

}
