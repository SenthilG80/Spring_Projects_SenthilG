package com.nt.sbeans;

import java.util.Date;

public class VotinhEligibilityCheck {
	
	private String name;
	private int age;
	private Date verifiedOn;
	public VotinhEligibilityCheck( ) {
		System.out.println("VotinhEligibilityCheck## 0 Param Constructor");
	}
	public void setName(String name) {
		System.out.println("VotinhEligibilityCheck.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VotinhEligibilityCheck.setAge()");
		this.age = age;
	}
	public void setVerifiedOn(Date verifiedOn) {
		System.out.println("VotinhEligibilityCheck.setVerifiedOn()");
		this.verifiedOn = verifiedOn;
	}
	
	public String checkVotingElegibility() {
		
		System.out.println("Business Method Execution");
		if(age < 18)
			return name +" u r not eligeble for voting  :: "+verifiedOn;
		else
			return name + " u r eligeble for voting  :: " +verifiedOn; 
	}
	
	public void myInit() {
		System.out.println("VotinhEligibilityCheck.myInit()");
		
		verifiedOn = new Date();
		if( name == null || name.trim().length()==0|| age<=0)
			throw new IllegalArgumentException("Invalid name and age");
		
	}
	
	public void myDestroy() {
		System.out.println("VotinhEligibilityCheck.myDestroy()");
		name=null;
		age=0;
		
	}
	
	
	

}
