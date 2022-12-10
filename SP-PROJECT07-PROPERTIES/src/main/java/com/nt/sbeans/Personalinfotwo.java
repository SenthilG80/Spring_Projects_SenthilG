package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("pinfo2")
@PropertySource("com/nt/commons/info.properties")
 
public class Personalinfotwo {
	
	@Autowired
	private Environment env;

	@Override
	public String toString() {
		return  env.getProperty("per.name") + "  "+  env.getProperty("per.age") + "  "+ env.getProperty("per.address") + " \n "+ env.getProperty("os.name") + "  "+
				 env.getProperty("user.name") + "  "+ env.getProperty("Path") ;
	}
	
	

}
