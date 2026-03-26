package com.more.examples;

public class Payment {
      
	String typeOfPayment;
    double amount;
	public Payment(String typeOfPayment, double amount) {
		this.typeOfPayment = typeOfPayment;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [typeOfPayment=" + typeOfPayment + ", amount=" + amount + "]";
	}

	
	

  
}
