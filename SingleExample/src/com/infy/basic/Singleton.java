package com.infy.basic;

public class Singleton {

	private static Singleton theSingleton;
	     
	private Singleton() {
		
	}
	
	
	public static Singleton getInstance() {
		if(theSingleton == null) {
			theSingleton = new Singleton();
		}
		return theSingleton;
	}
	
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1 == s2);
	}
}
