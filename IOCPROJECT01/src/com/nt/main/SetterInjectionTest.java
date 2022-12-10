package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creates the IOC container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//get the target spring bean class obj
		 
		Object obj=ctx.getBean("wmg");
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		String result=generator.showWishMessage("success");
		System.out.println(result);
		ctx.close();
				

	}

}
