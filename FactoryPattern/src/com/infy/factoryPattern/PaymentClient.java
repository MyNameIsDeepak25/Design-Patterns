package com.infy.factoryPattern;

public class PaymentClient {
 
	public static void main(String[] args) {
		Payment p1=PaymentFactory.getPayment("UPI");
	    p1.withdraw();
	    
	    Payment p2=PaymentFactory.getPayment("NETBANKING");
	    p2.withdraw();
	    
	}
}
