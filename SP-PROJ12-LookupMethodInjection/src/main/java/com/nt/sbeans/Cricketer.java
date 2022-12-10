// Circketer.java is the ((( Target Class)))

package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public abstract  class Cricketer {
	public Cricketer() {
		System.out.println("Cricketer.Cricketer(:: 0 Param Constructor " + this.hashCode());
	}
	
	@Lookup
	public  abstract CrciketBat getBat();
	
	public String  batting() {

  // Get dependent Spring bean class object (Dependency Lookup)
    CrciketBat bat=getBat();
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
