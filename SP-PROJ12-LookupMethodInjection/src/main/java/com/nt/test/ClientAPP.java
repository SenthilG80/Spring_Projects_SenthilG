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
		   
		  System.out.println("_____________________________________________________");
		    Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		    System.out.println(cktr.getClass() + "                           " + cktr.getClass().getSuperclass());
		    System.out.println(cktr.batting());
		    System.out.println (cktr.bowling() );
		    System.out.println(cktr.wicketKeeping() );
		    System.out.println("_____________________________________________________");
		    System.out.println(cktr.batting());
		    ctx.close();
		    
		    
	}

}
