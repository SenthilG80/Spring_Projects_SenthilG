package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier {

	@Override
	public String deliver(int old) {
		// TODO Auto-generated method stub
		return  old +"Order items are kept for delivery by DTC";
	}

}
