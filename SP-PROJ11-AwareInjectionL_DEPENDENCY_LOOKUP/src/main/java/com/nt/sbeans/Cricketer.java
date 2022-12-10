// Circketer.java is the ((( Target Class)))

package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer implements ApplicationContextAware{
	public Cricketer() {
		System.out.println("Cricketer.Cricketer(:: 0 Param Constructor");
	}
	
	private ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx=ctx;
	}	

	
	public String  batting() {

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
