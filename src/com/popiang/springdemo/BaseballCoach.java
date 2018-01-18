package com.popiang.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on betting practice";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
