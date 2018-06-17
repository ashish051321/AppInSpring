package com.learnspring.coaches;


import org.springframework.stereotype.Component;
import com.learnspring.services.FortuneService;


public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	

	public BasketballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getInstructions() {
		System.out.println(this.fortuneService.getFortune());
		return "Run for 4 miles";
		
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMyProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
	}	


}
