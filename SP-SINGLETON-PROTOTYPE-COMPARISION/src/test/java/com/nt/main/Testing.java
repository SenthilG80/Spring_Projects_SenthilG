package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.comps.WishMessageGenerator;

public class Testing {

	/**X
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creates the IOC container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//get the target spring bean class obj
	  WishMessageGenerator wtx1=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator wtx2=ctx.getBean("wmg",WishMessageGenerator.class);
		
	System.out.println(wtx1.hashCode() +" "+ wtx2.hashCode());
	System.out.println(wtx1==wtx2);
	String result=wtx1.showWishMessage("success");
    System.out.println(result);
		ctx.close();
				
	}

}
