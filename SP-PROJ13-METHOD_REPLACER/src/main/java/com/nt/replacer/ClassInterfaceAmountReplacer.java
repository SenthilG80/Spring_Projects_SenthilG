package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;
@Component("ciaReplacer")
public class ClassInterfaceAmountReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] arg) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ClassInterfaceAmountReplacer.reimplement()");
		double pamt =(double)arg[0];
		double  time =(double)arg[1];
		double rate =(double)arg[2];
		
		return pamt*time*rate/1000;

	}

}
