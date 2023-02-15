package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields for email address and team
	private String emailAddress;
	private String team;
	

	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("TrackCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("TrackCoach: inside setter method - setTeam");
		this.team = team;
	}


	// create a no-arg constructor
	public TrackCoach() {
		System.out.println("TrackCoach: inside no-arg constructor");
	}


	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TrackCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Run a hard 10k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
