package com.saimadhu.springdemo;

public class trackCoach implements Coach {

	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		System.out.println("This is inside trackCoach setter method");
		this.message = message;
	}

	private FortuneService fortuneService;
	public trackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a 5K";
	}

	
	public trackCoach() {
		System.out.println("This is trackCoach constructor-noarg");
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside init method doMyStartUpStuff");
	}
	
	
	// add an destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside destroy method doMyCleanUpStuff");
	}
	

}
