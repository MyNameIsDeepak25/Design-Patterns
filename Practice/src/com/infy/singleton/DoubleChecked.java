package com.infy.singleton;

public class DoubleChecked {

	private static volatile DoubleChecked theDoubleChecked;
	
	private DoubleChecked() {
		System.out.println("Getting instance ");
	}
	
	public static DoubleChecked getInstance() {
		if(theDoubleChecked == null) {
			synchronized (DoubleChecked.class) {
				if(theDoubleChecked == null) {
					theDoubleChecked = new DoubleChecked();
				}
				
			}
		}
		return theDoubleChecked;
	}
	
	public static void main(String[] args) {
		DoubleChecked d1=DoubleChecked.getInstance();
		DoubleChecked d2=DoubleChecked.getInstance();
		
		System.out.println(d1 == d2);
	}
}
