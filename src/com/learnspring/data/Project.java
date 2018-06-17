package com.learnspring.data;

import java.util.Random;

public class Project {
	
	private String[] projectNames;
	
	public void setProjectNames(String[] projectNames) {
		this.projectNames = projectNames;
	}
	
	public String assignRandomProject(){
		
		return projectNames[new Random().nextInt(projectNames.length)];
		
	}

}
