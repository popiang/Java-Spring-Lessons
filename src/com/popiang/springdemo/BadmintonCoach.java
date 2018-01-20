package com.popiang.springdemo;

public class BadmintonCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice badminton smash for 1 hour";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	public void initMethod() {
		System.out.println("Inside init method..");
	}
	
	public void destroyMethod() {
		System.out.println("Inside destroy method");
	}
	
}
