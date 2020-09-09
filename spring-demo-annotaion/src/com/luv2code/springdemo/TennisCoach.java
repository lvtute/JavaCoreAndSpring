package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomfortuneService")
	private FortuneService fortuneService;
	
	// define my init method
	@PostConstruct
	public void doMyStratupStuffs() {
		System.out.println(">> TennisCoach: inside doMyStratupStuffs()");
	}
	@PreDestroy
	public void doMyCleanUpStuffs() {
		System.out.println(">> TennisCoach: inside doMyCleanUpStuffs()");
	}
	// define my destroy method
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}
	
	// define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
//	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService  = theFortuneService;
//		
//	}
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
