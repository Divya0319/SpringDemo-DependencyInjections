package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
	
	private String[] fortunes = {
			"Today is your lucky day!",
			"You will meet someone special", 
			"You will find the thing you lost"};
	
	Random r = new Random();

	@Override
	public String getFortune() {
		
		int fIndex = r.nextInt(fortunes.length);
		
		return fortunes[fIndex];
	}

}
