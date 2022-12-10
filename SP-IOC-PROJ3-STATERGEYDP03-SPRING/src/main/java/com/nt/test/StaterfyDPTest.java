package com.nt.test;
import java.time.LocalDateTime;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.FlipKart;
public class StaterfyDPTest {
	
	public static void main(String[] args) {
		
		//Creating IOC container
		 //FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
	//	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("D:\\workspace\\SP-IOC-PROJ3-STATERGEYDP03-SPRING\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml");
      ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("applicationContext.xml");
		//get target spring bean class object
		//Object obj=ctx.getBean("fpkt");
		//  FlipKart  fpkt=(FlipKart)obj;
      
    FlipKart fpkt= ctx.getBean("fpkt", FlipKart.class);
    
      
		String result=fpkt.shopping(new String[] {"Shirts","trousers"}, new double[] {6000.65,55555.86});
		System.out.println(result);
		//singleton scope example
		System.out.println("==========================================================================");
		  LocalDateTime dt1= ctx.getBean("ldt",LocalDateTime.class);
		  LocalDateTime dt2= ctx.getBean("ldt",LocalDateTime.class);
		    System.out.println(dt1.hashCode());
		    System.out.println(dt2.hashCode());
		    System.out.println(dt1==dt2);
			System.out.println("==========================================================================");
			
			  LocalDateTime dt3= ctx.getBean("ldt",LocalDateTime.class);
			  LocalDateTime dt4= ctx.getBean("ldt2",LocalDateTime.class);
			    System.out.println(dt3.hashCode());
			    System.out.println(dt4.hashCode());
			    System.out.println(dt3==dt4);
			
			//prototype scope example
			System.out.println("==========================================================================");
			
			  LocalDateTime dt5= ctx.getBean("ldt3",LocalDateTime.class);
			  LocalDateTime dt6= ctx.getBean("ldt3",LocalDateTime.class);
			    System.out.println(dt5.hashCode());
			    System.out.println(dt6.hashCode());
			    System.out.println(dt5==dt6);
			
			
			
			
			System.out.println("==========================================================================");
		  
		ctx.close();
		
	}

}
