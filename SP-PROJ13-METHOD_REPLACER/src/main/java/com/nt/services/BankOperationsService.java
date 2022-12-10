//BankOperationService.java

package com.nt.services;

//import org.springframework.stereotype.Component;

//@Component("bankService")
public class BankOperationsService {
	
	public double calculateInterestAmount(double pamt,double rate, double time) {
		System.out.println("BankOperationsService.calculateInterestAmount()");
		return (pamt*Math.pow(1+rate/100, time))-pamt;
	}

}
