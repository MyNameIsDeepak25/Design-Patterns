package com.infy.singleton;

public class Basic {
       private static Basic theBasic;
       
       private Basic () {
    	   System.out.println("Getting Instance");
       }
       
       public static Basic getInstance() {
    	   if(theBasic == null ) {
    		   theBasic = new Basic();
    	   }
    	   return theBasic;
       }
       
       public static void main(String[] args) {
		Basic b1=Basic.getInstance();
		Basic b2=Basic.getInstance();
		
		
		System.out.println(b1 == b2);
		
	}
}
