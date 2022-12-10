package com.nt.sbeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vec")
public class VotinhEligibilityCheck {
	@Value("${voter.name}")
	private String name;
	
	@Value("${voter.age}")
	private int  age;
	
	private Date verifiedOn;
	public VotinhEligibilityCheck( ) {
		System.out.println("VotinhEligibilityCheck## 0 Param Constructor");
	}
	public String checkVotingElegibility() {
		
		System.out.println("Business Method Execution");
		if(age < 18)
return name +" u r not eligeble for voting  :: "+verifiedOn;
else
	return name + " u r eligeble for voting  :: " +verifiedOn; 
		
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("VotinhEligibilityCheck.myInit()");
		
		verifiedOn = new Date();
//		if( name == null || name.trim().length()==0|| age<=0)
//			throw new IllegalArgumentException("Invalid name and age");
//		
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("VotinhEligibilityCheck.myDestroy()");
		name=null;
		age=0;
		
	}
	
	
	

}
