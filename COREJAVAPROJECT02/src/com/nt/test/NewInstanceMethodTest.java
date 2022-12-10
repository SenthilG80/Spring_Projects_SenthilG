package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class NewInstanceMethodTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class c=Class.forName(args[0]);
		Constructor cons[]=c.getDeclaredConstructors();
		Object ob1=cons[0].newInstance();
		System.out.println(ob1.toString());
		
		System.out.println("-----------------------------------------------------");
		Object ob2=cons[1].newInstance(1,9);
		System.out.println(ob2.toString());
		
		//Accessing Fields throgh Reflection API
		
		Field fields[]=ob2.getClass().getDeclaredFields();
		fields[0].setAccessible(true);
		fields[1].setAccessible(true);
		fields[0].setInt(ob2, 2000);
		fields[1].setInt(ob2, 9999);
		System.out.println(ob2.toString());
	}

}
