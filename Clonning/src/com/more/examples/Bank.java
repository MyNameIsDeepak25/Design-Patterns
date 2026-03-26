package com.more.examples;

public class Bank implements Cloneable{
     int regId;
	 String name;
	 Payment thePayment;
	public Bank(int regId, String name, Payment thePayment) {
		this.regId = regId;
		this.name = name;
		this.thePayment = thePayment;
	}

	
	public Object clone() throws CloneNotSupportedException{
		
		Payment p1=new Payment(this.thePayment.typeOfPayment, this.thePayment.amount);
		Bank b1=new Bank(1211213, "RBI", p1);
		return b1;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Bank [regId=" + regId + ", name=" + name + ", thePayment=" + thePayment + "]";
	}
	
	
	 public static void main(String[] args) {
		
	}
	 
	 
	
	
}
