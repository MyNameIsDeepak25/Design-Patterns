package com.infy.shallowClone2;

public class Dog  implements Cloneable{
   Cat c;
   int j;
public Dog(Cat c, int j) {
	this.c = c;
	this.j = j;
}
   
   public Object clone() throws CloneNotSupportedException{
	   return super.clone();
   }
   
   
   public static void main(String[] args) throws CloneNotSupportedException {
	   Cat c=new Cat(20);
	   Dog d1=new Dog(c, 12);
	   
	   Dog d2=(Dog)d1.clone();
	   
	   System.out.println(d1.j  + " "  + d1.c.i);
	   d2.j=888;
	   d2.c.i=999;
	   
	   
	   System.out.println(d1.j + " "  + d1.c.i);
	   // d2.i = 10 (unchanged, separate copy)
       // d2.c.j = 999 (changed because Cat object is shared)
	   
}
	
	
}
