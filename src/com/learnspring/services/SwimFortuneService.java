package com.learnspring.services;

import org.springframework.stereotype.Component;

@Component
public class SwimFortuneService implements FortuneService {
	
	
	public String getFortune(){
		return "You have the blessings of Michael Phelphs.!";
	}

}
