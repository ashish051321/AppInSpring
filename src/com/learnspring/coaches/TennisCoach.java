package com.learnspring.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.learnspring.data.Project;
import com.learnspring.services.FortuneService;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	private String myProject; 
	
	@Autowired
	private Project projectRef;//autowiring of fields. Works the same as constructor and setter injection
	
	@Autowired
	@Qualifier("magicalFortuneService")
	public void setFortuneService(FortuneService hfs) {
		this.fortuneService = hfs;
	}

	@Override
	public String getInstructions() {
		return "practice backhand shots";
	}

	@Override
	public String getFortune() {
		return this.fortuneService.getFortune();
	}

	public String getMyProject(){
		myProject = projectRef.assignRandomProject();
		return myProject;
	}
}
