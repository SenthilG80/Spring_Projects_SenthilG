package com.sairam.test;

import com.sairam.comps.*;
import com.sairam.factory.*;
public class FactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=BikeFactory.orderBike("standard");
		bike.drive();
		System.out.println("___________________________");
		Bike bike1=BikeFactory.orderBike("sports");
		bike1.drive();
		System.out.println("___________________________");
		Bike bike2=BikeFactory.orderBike("bullet");
		bike2.drive();
		System.out.println("___________________________");
		Bike bike3=BikeFactory.orderBike("electric");
		bike3.drive();
		System.out.println("___________________________");

	}

}
