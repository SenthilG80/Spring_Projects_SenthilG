package com.nt.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component("pmListener")
public class IOCContainerPerformanceMonitorListener implements ApplicationListener<ApplicationEvent> {
  private long start,end;
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println("Application Event Details ::-"+event.toString());
		
		if (event.toString().contains("Refreshed")) {
			start =System.currentTimeMillis();
		}else if (event.toString().contains("Closed")) {
			end=System.currentTimeMillis();
		}
		
		System.out.println(" IOC container is in active mode for " + (end-start) + "ms");
		
	}
	

}
