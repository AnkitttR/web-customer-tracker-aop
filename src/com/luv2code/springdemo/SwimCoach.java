package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService; //Defining private field fortuneService
	
	@Value("${foo.email}")  //Injecting values from sport.properties file
	private String email;
	
	@Value("${foo.team}")  //Injecting values from sport.properties file
	private String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;  //Constructor is defined only not executed here	
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}



	public String getEmail() {
		return email;
	}



	public String getTeam() {
		return team;
	}

	
}
