package com.nt.sbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer {
	
	public Cricketer() {
		System.out.println("Cricketer.Cricketer(:: 0 Param Constructor");
	}
	
	public String  batting() {
		
	 //Create additional IOC container    
		
  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
  // Get dependent Spring bean class object (Dependency Lookup)
    CrciketBat bat=ctx.getBean("cBat",CrciketBat.class);
    int runs=bat.scoreRuns();
    return "Cricketer is batting"+ runs;
    
	}
	
	public String bowling() {
		
		return "Cricketer is bowling";
		
	}
	
	public String wicketKeeping() {
		return "Cricketer is wicketKeeping";
	}

}
