package com.learnspring.coaches;

import org.springframework.beans.factory.annotation.Value;

import com.learnspring.services.FortuneService;

public class SwimCoach implements Coach{
	
	FortuneService fortuneService; 
	
	@Value("${details.team}")
	private String teamName;
	
	@Value("${details.homeGround}")
	private String homeGround;
	
	public SwimCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}

	@Override
	public String getInstructions() {
		// TODO Auto-generated method stub
		return "Swim 500 mteres for warm up.";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getMyProject() {
		// TODO Auto-generated method stub
		return "Right now.. I am just a placeholder";
	}

	@Override
	public void printDetails() {
		System.out.println("I am SwimCoach and I have been made for demonstrating AnnotationConfigApplicationContext..");
		System.out.println("HomeGround and TeamNames are "+homeGround+" , "+ teamName);
	}

}
