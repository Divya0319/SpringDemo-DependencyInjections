package com.luv2code.springdemo;

public class ChessCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public ChessCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play 10 rounds with Computer as opponent";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: " + fortuneService.getFortune();
	}

}
