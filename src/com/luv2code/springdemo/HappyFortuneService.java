package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component  //Explicitly Bean ID nahi deni padegi
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

}
