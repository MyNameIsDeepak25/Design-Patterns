package com.infy.usingEnum;

public class SingleCheck {
	
	public static void main(String[] args) {
		EnumInstance e1=EnumInstance.MYINSATNCE;
		EnumInstance e2=EnumInstance.MYINSATNCE;
		System.out.println(e1 == e2);
	}

}
