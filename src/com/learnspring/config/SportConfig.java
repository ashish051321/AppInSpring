package com.learnspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.learnspring.coaches.Coach;
import com.learnspring.coaches.SwimCoach;
import com.learnspring.services.FortuneService;
import com.learnspring.services.SwimFortuneService;

@Configuration
@PropertySource("classpath:details.properties")
//@ComponentScan --- this could have been included as well....
public class SportConfig {

	@Bean
	public FortuneService getSwimFortune(){
		return new SwimFortuneService();
	}
	
	@Bean
	public Coach mySwimCoach(){
		return new SwimCoach(getSwimFortune());
	}
	
}
