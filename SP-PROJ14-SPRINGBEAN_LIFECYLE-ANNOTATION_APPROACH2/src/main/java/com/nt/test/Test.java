package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotinhEligibilityCheck;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		System.out.println("__________________________________________________");
		 VotinhEligibilityCheck vec=ctx.getBean("vec",VotinhEligibilityCheck.class);
		 String result=vec.checkVotingElegibility();
		 System.out.println(result);
		System.out.println("__________________________________________________");
		 ctx.close();

	}

}
