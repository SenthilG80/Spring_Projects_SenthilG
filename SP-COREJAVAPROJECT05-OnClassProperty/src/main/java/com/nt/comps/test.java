package com.nt.comps;

public class test {

	private int a,b;
	
	public test() {
		System.out.println("Test 0 paran constructor");
		
	}
	
	public test(int x, int y) {
		this.a=x;
		this.b=y;
	}

	@Override
	public String toString() {
		return "test [a=" + a + ", b=" + b + "]";
	}
	

}
