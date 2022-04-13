package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;   //Defining pvt field

	//define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default constructor");
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
