//Bike Factory pattern
package com.sairam.factory;

import com.sairam.comps.Bike;
import com.sairam.comps.BulletBike;
import com.sairam.comps.ElectricBike;
import com.sairam.comps.SportsBike;
import com.sairam.comps.StandardBike;

public class BikeFactory {
	
	//Factory methods common logic and return type is common to related class that is interface
	
	public  static  Bike orderBike(String type) {
		Bike bike =null;
		if(type.equalsIgnoreCase("standard")) {
			bike=new StandardBike();
		}else if (type.equalsIgnoreCase("sports")) {
			bike=new SportsBike();
		}else if (type.equalsIgnoreCase("electric")) {
			bike=new ElectricBike();
			
		}else if(type.equalsIgnoreCase("bullet")) {
			bike=new BulletBike();
			
		}else {
			throw new IllegalArgumentException();
		}
		return bike;
	}

}
