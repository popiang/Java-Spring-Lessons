package com.popiang.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside set method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside set method - setTeam");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: Inside set method - setFortuneService");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
