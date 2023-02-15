package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// create a no-arg constructor
	public TrackCoach() {
		System.out.println("TrackCoach: inside no-arg constructor");
	}


	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TrackCoach: inside setter method: setFortuneService");
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
