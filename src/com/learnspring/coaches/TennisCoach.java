package com.learnspring.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.learnspring.data.Project;
import com.learnspring.services.FortuneService;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	private String myProject; 
	
	@Value("${developer.email}")
	private String developer_email;
	
	@Value("${developer_name}")
	private String developer_name;
	
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

	@Override
	public String getMyProject(){
		myProject = projectRef.assignRandomProject();
		return myProject;
	}

	@Override
	public void printDetails(){
		System.out.println("Developer Name: "+this.developer_name);
		System.out.println("Developer Email: "+this.developer_email);
	}
	
	
}
