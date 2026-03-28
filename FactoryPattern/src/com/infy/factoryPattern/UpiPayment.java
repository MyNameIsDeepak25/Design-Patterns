package com.infy.factoryPattern;

public class UpiPayment implements Payment{

	@Override
	public void withdraw() {

		System.out.println("Withdrawing through UPI ");
	}

}
