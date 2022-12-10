package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("cBat")
public class CrciketBat {
	public CrciketBat() {
		System.out.println("CrciketBat.CrciketBat():: 0-Param Constructor");
	}

	 public int scoreRuns() {
		 return new Random().nextInt(199);
	 }
}
