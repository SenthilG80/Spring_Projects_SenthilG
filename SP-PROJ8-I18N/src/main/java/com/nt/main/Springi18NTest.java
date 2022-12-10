package com.nt.main;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springi18NTest {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Locale locale=new Locale(args[0],args[1]);
		String msg1=ctx.getMessage("welcome.msg", new Object[] {}, locale);
		String msg2=ctx.getMessage("goodbye.msg", new Object[] {}, locale);
		System.out.println(msg1);
		System.out.println(msg2);
		ctx.close();
		

	}

}
