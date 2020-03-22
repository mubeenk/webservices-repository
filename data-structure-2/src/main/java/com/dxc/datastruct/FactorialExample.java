package com.dxc.datastruct;

public class FactorialExample {

	public static int factorialWithFor(int n) {
		int value = 1;
		
		for(int i=n;i>1;i--) {
			value *= i;
		}
		
		return value;
	}
	
	public static int factorialWithRecursive(int n) {
		
		if(n == 0)
			return 1;
		
		return n * factorialWithRecursive(n-1);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long tick1 = System.currentTimeMillis();
		System.out.println("Factorial is := " + factorialWithFor(5));
		long tick2 = System.currentTimeMillis();
		System.out.println(tick2-tick1);
		long tick3 = System.currentTimeMillis();
		System.out.println("Factorial is := " + factorialWithRecursive(5));
		long tick4 = System.currentTimeMillis();
		System.out.println(tick4-tick3);
		
	}

}
