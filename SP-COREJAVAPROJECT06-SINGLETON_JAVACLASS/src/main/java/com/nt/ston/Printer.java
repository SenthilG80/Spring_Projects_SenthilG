package com.nt.ston;

public class Printer {
	private static Printer  INSTANCE;	
	private Printer() {
		System.out.println("Zero Param Constructor");
	}
	public static Printer getINSTANCE() {
		
		if(INSTANCE==null)
		    INSTANCE=new Printer();
		return INSTANCE;
	}


}
