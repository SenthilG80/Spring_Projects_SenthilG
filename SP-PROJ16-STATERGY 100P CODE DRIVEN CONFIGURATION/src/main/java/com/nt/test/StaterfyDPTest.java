package com.nt.test;
import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.configs.AppConfig;
import com.nt.sbeans.FlipKart;
public class StaterfyDPTest {
	
	public static void main(String[] args) {
		
 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
 
    FlipKart fpkt= ctx.getBean("fpkt", FlipKart.class);
    
      
		String result=fpkt.shopping(new String[] {"Shirts","trousers"}, new double[] {6000.65,55555.86});
		System.out.println(result);

		  
		ctx.close();
		
	}

}
