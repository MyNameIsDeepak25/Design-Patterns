package com.infy.factoryPattern;

public class PaymentFactory {


   
   public static Payment getPayment(String type) {
	   if(type.isEmpty()  || type.equals(null)) {
		   throw new RuntimeException("Payment cant be empty");
	   }else {
		   type = type.trim().toUpperCase();
		   switch (type) {
		case "UPI" :
			return new UpiPayment();

        case "NETBANKING":
        	return new NetBanking();
         
		default:
			throw new IllegalArgumentException("Invalid type " + type);
		}
	   }
   }
}
