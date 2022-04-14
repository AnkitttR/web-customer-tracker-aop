package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for our sad fortune service
	//sadFortuneService() method name will be beanId
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
		
	}
	
	// define bean for our swim coach & inject dependency
	@Bean
	public Coach swimCoach() {    //Bean for our SwimCoach class created with id "swimCoach"
								//First letter is small
		return new SwimCoach(sadFortuneService()); //passing bean which is created in line 13 above
		
	}
	
	
}
