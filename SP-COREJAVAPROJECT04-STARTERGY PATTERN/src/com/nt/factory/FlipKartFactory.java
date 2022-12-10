package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FlipKart;

public class FlipKartFactory {
	public static FlipKart  getInstance(String courierType) {
		 Courier courier=null;
		 if(courierType.equalsIgnoreCase("dtdc"))
			 courier=new DTDC();
		 if(courierType.equalsIgnoreCase("bluedart"))
		 courier=new BlueDart();
		 else
			 throw new IllegalArgumentException("Invalid Courier Type");
		 
		 FlipKart fpkt=new FlipKart();
		 fpkt.setCourier(courier);
		 
		 return fpkt;
		 
		 
		 
		 
		 
	}

}
