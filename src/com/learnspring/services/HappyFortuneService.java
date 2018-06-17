package com.learnspring.services;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune(){
		return "Best of luck for your match !";
	}

}
