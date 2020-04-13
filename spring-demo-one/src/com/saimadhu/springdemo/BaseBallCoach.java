package com.saimadhu.springdemo;

public class BaseBallCoach implements Coach{
	
	
	//Define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for the dependency injection
	
	public BaseBallCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins";
	}

	@Override
	public String getDailyFortune() {
		// Use fortune service to get a fortune
		return fortuneService.getFortune();
	}
	public BaseBallCoach() {
		System.out.println("This is baseball coach no arg");
	}

}
