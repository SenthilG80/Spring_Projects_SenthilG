package com.nt.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.FlipKart;
public class StaterfyDPTest {
	
	public static void main(String[] args) {
		
		
      ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("applicationContext.xml");

    FlipKart fpkt= ctx.getBean("flipKart", FlipKart.class);
    
      
		String result=fpkt.shopping(new String[] {"Shirts","trousers"}, new double[] {6000.65,55555.86});
		System.out.println(result);
		
		System.out.println("---------------------------------------------------------------------------------------------********");
		Date d1=ctx.getBean("java.util.Date",Date.class);
		System.out.println(d1.hashCode());
		System.out.println("---------------------------------------------------------------------------------------------********");
		Date d2=ctx.getBean("java.util.Date#0",Date.class);
		System.out.println(d2.hashCode());
		System.out.println("---------------------------------------------------------------------------------------------********");
		Date d3=ctx.getBean("java.util.Date#1",Date.class);
		System.out.println(d3.hashCode());
		
		
		
		ctx.close();
		
	}

}
