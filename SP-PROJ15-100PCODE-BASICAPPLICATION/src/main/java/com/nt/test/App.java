package com.nt.test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.configs.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
        String result=generator.generateWishMessage("raja");
        System.out.println(result);
        
     System.out.println("__________________________________-------");
     int count =ctx.getBeanDefinitionCount();
     System.out.println("Count is ::" + count);
     String beandetails[]=ctx.getBeanDefinitionNames();
     System.out.println("bean details  is ::" + Arrays.toString(beandetails));
     for(String id:beandetails) {
    	 if (ctx.isSingleton(id))
    		 System.out.println("Singleton bean is " + id);
     }
        ctx.close();
       }
}
