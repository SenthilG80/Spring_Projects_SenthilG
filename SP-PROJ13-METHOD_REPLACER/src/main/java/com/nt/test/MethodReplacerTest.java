package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.services.BankOperationsService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		//Create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
		//get Target Spring Bean Class Object
		BankOperationsService service=ctx.getBean("bankService",BankOperationsService.class);
		System.out.println(service.getClass() +"    "+service.getClass().getSuperclass());
		//invoke b.method
		
		try {
			double intrAmt=service.calculateInterestAmount(100000.00, 2, 12.00);
			System.out.println("INTEREST AMOUNT IS "+ intrAmt);
					
		}catch (Exception e) {
			// TODO: handle exception
		          e.printStackTrace();
		}
		ctx.close();
		
		

	}

}
