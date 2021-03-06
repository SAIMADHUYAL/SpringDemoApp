package com.saimadhu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class helloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve the bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class); 
		//Coach theCoach2 = context.getBean("myCoach2",Coach.class); 
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println(theCoach2.getDailyWorkout());
		
		//lets call the new methods
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
