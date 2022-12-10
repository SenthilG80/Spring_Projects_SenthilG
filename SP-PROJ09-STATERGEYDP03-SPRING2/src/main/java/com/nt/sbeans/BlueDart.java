package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bdart")
public final class BlueDart implements Courier {

	@Override
	public String deliver(int old) {
		// TODO Auto-generated method stub
		return old +"Order items are kept for delivery by Blue Dart";
	}

}
