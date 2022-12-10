package com.nt.test;

import java.util.Arrays;

import com.nt.comps.test;

public class PropertyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Class c1=test.class;
     System.out.println("c1 object data "+c1.toString());
     System.out.println("c1 object class name "+ c1.getClass());
     System.out.println("super class of c1 pointing class "+ c1.getSuperclass());
     System.out.println("Interface implemented by c1 pointing class "+ Arrays.toString(c1.getInterfaces()));
     System.out.println("methods of c1 objected pointed clqss "+Arrays.toString(c1.getDeclaredMethods()));
	}

}
