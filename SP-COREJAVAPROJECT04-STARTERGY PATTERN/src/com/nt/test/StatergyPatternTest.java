package com.nt.test;

import com.nt.factory.FlipKartFactory;
import com.nt.comp.FlipKart;

public class StatergyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipKart fpkt=FlipKartFactory.getInstance("bluedart");
		String resultmessage=fpkt.shopping(new String[] {"shirt","pant"}, new  double[] {10000,5000});
		System.out.println(resultmessage);
		
		

	}

}
