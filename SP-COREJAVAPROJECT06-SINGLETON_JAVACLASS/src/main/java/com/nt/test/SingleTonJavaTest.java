package com.nt.test;

import com.nt.ston.Printer;

public class SingleTonJavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1=Printer.getINSTANCE();
		Printer p2=Printer.getINSTANCE();
		Printer p3=Printer.getINSTANCE();
		
		System.out.println(p1.hashCode()+"  "+p2.hashCode()+" " + p3.hashCode());
		System.out.println("P1==P2 "+(p1== p2));
		
		System.out.println("P2==P3 "+(p2== p3));
		
		

	}

}
