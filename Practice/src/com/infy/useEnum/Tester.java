package com.infy.useEnum;

public class Tester {

	 public static void main(String[] args) {
		SingleInstance s1=SingleInstance.FRIDAY;
		SingleInstance s2=SingleInstance.FRIDAY;
	       s1.singleInstanceCheck();
	       s2.singleInstanceCheck();
		System.out.println(s1 == s2);
	}
}
