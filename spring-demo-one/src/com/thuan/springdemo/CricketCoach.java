package com.thuan.springdemo;

public class CricketCoach implements Coach {

	private FortuneService FortuneService;
	
	private CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor...");
	}

	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method...");
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return FortuneService.getFortune();
	}

}
