package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.Personalinfo;
import com.nt.sbeans.Personalinfotwo;

public class Propertiestestg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
  Personalinfo p1=ctx.getBean("pinfo", Personalinfo.class );
  System.out.println(p1);
  
  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
   Personalinfotwo p2=ctx.getBean("pinfo2", Personalinfotwo.class );
   System.out.println(p2);
   System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
   
   Environment env=ctx.getEnvironment();
	System.out.println( env.getProperty("per.name") + "  "+  env.getProperty("per.age") + "  "+ env.getProperty("per.address") + " \n "+ env.getProperty("os.name") + "  "+
	 env.getProperty("user.name") + "  "+ env.getProperty("Path")) ;
	  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	  Personalinfotwo tp1=ctx.getBean("pinfo2", Personalinfotwo.class );
	  Personalinfotwo tp2=ctx.getBean("pi2", Personalinfotwo.class );
	  System.out.println(tp1.hashCode()  +  "  "+ tp2.hashCode());
	  System.out.println(tp1==tp2);
	  
	  
	  

   ctx.close();
	}

}
