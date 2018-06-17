package com.learnspring.core;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnspring.coaches.BasketballCoach;
import com.learnspring.coaches.Coach;

public class App {

	public static void main(String[] args) {
		
	      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      
	      
	      System.out.println("===========================");
	      //The actions
	      Coach c1 = context.getBean("tennisCoach",Coach.class);
	      System.out.println("This is the " + c1.getClass().getSimpleName() +".....");
	      System.out.println("Instructions:- " + c1.getInstructions());
	      System.out.println("Fortune:- " + c1.getFortune());
	      System.out.println("My Project:- "+c1.getMyProject());
	      c1.printDetails();
	      
	      
	      context.close();
	}
}
