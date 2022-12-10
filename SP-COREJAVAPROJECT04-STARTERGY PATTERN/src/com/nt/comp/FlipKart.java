package com.nt.comp;
import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component("fpkt")
public final class FlipKart {
	//HAS A PROPERTIY
@Autowired	
private Courier courier;

public void setCourier(Courier courier) {
	this.courier = courier;
}

public 	 String shopping(String items[],double prices[]) {
	double billAmount=0.0;
	for(double p:prices) {
		billAmount=billAmount+p;
	}
	int oid=new Random().nextInt(1000);
	String message=courier.deliver(oid);
	return Arrays.toString(items)+ " Items with bill amount :: "+billAmount+ " -.-.-.----"+ message;

}
}