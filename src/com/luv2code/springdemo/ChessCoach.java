package com.luv2code.springdemo;

public class ChessCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Play 10 rounds with Computer as opponent";
	}

}
