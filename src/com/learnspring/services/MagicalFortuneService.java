package com.learnspring.services;

import org.springframework.stereotype.Component;

@Component
public class MagicalFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Felix Felicis will help u win the game";
	}

}
