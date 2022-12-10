package com.nt.comps;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
@Lazy(true)
public class WishMessageGenerator {
	
	private LocalDateTime dateTime;
	
	@Autowired
	 public WishMessageGenerator(@Qualifier("ldt")LocalDateTime dateTime) {
			
			this.dateTime=dateTime;
			System.out.println("Constructor of WishMessageGenerator");

		}
	public String showWishMessage(String user) {

		System.out.println("WishMessageGenerator.showWishMessage()");
		System.out.println("DateTime   : "+dateTime );
//		System.out.println("Date   :"+date);
		int hour = dateTime.getHour();

		if (hour < 12)
			return "Good Morning" + user;
		else if (hour < 16)
			return "Good Afternoon" + user;
		else if (hour < 20)
			return "Good Evening" + user;
		else
			return "Good night" + user;
	}

		

}
