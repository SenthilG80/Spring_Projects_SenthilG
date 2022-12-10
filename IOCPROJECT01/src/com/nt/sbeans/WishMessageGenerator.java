package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	// HAS-A Property
//	@Autowired
//	@Qualifier("ldt1")
	private LocalDateTime dateTime;
//	@Autowired
//	private Date date;

	@Autowired
	 public WishMessageGenerator(@Qualifier("ldt") LocalDateTime dateTime) {
		
		this.dateTime=dateTime;

	}
	
	
	
	// setter method for setter Injection
	/*	@Autowired
						public void setDateTime(LocalDateTime dateTime) {
						System.out.println("WishMessageGenerator.setDateTime()");
						this.dateTime=dateTime;
					}
		@Autowired
		public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date=date;
	}*/
	
	
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
