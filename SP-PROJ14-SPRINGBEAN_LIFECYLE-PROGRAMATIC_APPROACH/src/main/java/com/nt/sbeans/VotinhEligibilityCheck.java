package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vec")
public class VotinhEligibilityCheck implements InitializingBean, DisposableBean{
	@Value("${voter.name)")
	private String name;
	@Value("${voter.age}")
	private int age;
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
	
	 

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("VotinhEligibilityCheck.destroy()");
		name=null;
		age=0;
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
      System.out.println("VotinhEligibilityCheck.afterPropertiesSet()");
		verifiedOn = new Date();
		if( name == null || name.trim().length()==0|| age<=0)
			throw new IllegalArgumentException("Invalid name and age");
		
	}
	
	
	

}
