package com.infy.doublechecked;

public class DoubleCheckedSingleton {
	
	private static volatile DoubleCheckedSingleton theCheckedSingleton;
	
	
	private DoubleCheckedSingleton() {
		
	}
	
	
	public static DoubleCheckedSingleton getInstance() {
		if(theCheckedSingleton == null) {
			synchronized (DoubleCheckedSingleton.class) {
				if(theCheckedSingleton == null) {
					theCheckedSingleton = new DoubleCheckedSingleton();
				}
				
			}
			
		}
		return theCheckedSingleton;
	}
	
	public static void main(String[] args) {
		
		
		DoubleCheckedSingleton d1=DoubleCheckedSingleton.getInstance();
		DoubleCheckedSingleton d2=DoubleCheckedSingleton.getInstance();
		System.out.println(d1 == d2);
		
	}

}
