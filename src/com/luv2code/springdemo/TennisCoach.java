package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;   //Defining pvt field

	//define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default constructor");
	}
	
	//define my init method
	@PostConstruct //Code will execute after bean is created
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach : inside of doMyStartupStuff() method");	
	}
	
	//define my destroy method
	@PreDestroy //Code will execute before bean is destroyed
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach : inside of doMyCleanupStuff() method");
	}
	
	
	
//	//define a setter method
//	@Autowired //spring will scan for a component(class) that implements FortuneService Interface
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach : inside doSomeCrazyStuff() method");
//		fortuneService = theFortuneService;
//	}

	
//	@Autowired  //Spring will scan for a component(class) that implements FortuneService interface // HappyFortuneService meets the requirement
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;  //Constructor created here but will executed by driver class
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
