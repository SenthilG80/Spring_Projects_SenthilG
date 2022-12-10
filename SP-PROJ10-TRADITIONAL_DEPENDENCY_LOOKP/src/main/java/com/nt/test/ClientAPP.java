package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.CrciketBat;
import com.nt.sbeans.Cricketer;

public class ClientAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Create additional IOC container    
		
		  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		  // Get dependent Spring bean class object (Dependency Lookup)
		    Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		    System.out.println(cktr.batting());
		    System.out.println (cktr.bowling() );
		    System.out.println(cktr.wicketKeeping() );
		    
		    ctx.close();
		    
		    
	}

}
