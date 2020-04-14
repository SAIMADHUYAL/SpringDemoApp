package com.saimadhu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they both are equal
		
		boolean result = (theCoach==alphaCoach);
		
		System.out.println("\nPointing to the Same object:"+ result);
		
		System.out.println("\nMemoery location for theCoach"+ theCoach);
		
		System.out.println("\nMemoery location for alphaCoach"+ alphaCoach);
		
		

	}

}
