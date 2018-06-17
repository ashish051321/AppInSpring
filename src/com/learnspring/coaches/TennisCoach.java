package com.learnspring.coaches;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.learnspring.data.Project;
import com.learnspring.services.FortuneService;

@Component
@Scope("prototype")
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
	
	@PostConstruct
	private void anyMethod(){
		System.out.println("I was called as a part of PostConstruct in TennisCoach");
	}
	
	@PreDestroy
	private void wrappingThingsUp(){
		System.out.println("The PreDestroy methd being called on TennisCoach");
//		To get the Spring container to release resources held by prototype-scoped beans, 
//		try using a custom bean post-processor, which holds a reference 
//		to beans that need to be cleaned up.
		
	}
	
	
}
