package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pinfo")
@PropertySource("com/nt/commons/info.properties")
public class Personalinfo {
	
  @Value("${per.name}") 
  private String name;
  
  @Value("${per.age}") 
  private int age;
  
  @Value("${per.address}") 
  private String address;

  @Value("${os.name}")
  private String osName;
  
  @Value("${user.name}")
  private String uName;
  
  @Value("${Path}")
  private String pathdata;

@Override
public String toString() {
	return "Personalinfo [name=" + name + ", age=" + age + ", address=" + address + ", osName=" + osName + ", uName="
			+ uName + ", pathdata=" + pathdata + "]";
}
  
  
}
