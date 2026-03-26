package com.infy.deepClone;

public class School implements Cloneable{
         int regId;
         String name;
         Student s;
		public School(int regId, String name, Student s) {
			this.regId = regId;
			this.name = name;
			this.s = s;
		}
		
		
		public Object clone() throws CloneNotSupportedException{
			Student s1=new Student(this.s.id, this.s.name, this.s.age);
		    School s2=new School(this.regId, this.name, s1);
		     return s2;
		}
		
		
		@Override
		public String toString() {
			return "School [regId=" + regId + ", name=" + name + ", s=" + s + "]";
		}


		public static void main(String[] args) throws CloneNotSupportedException {
			Student s=new Student(1211213, "Rajan", 14);
			School sc=new School(3324, "Divya High School", s);
			System.out.println(sc);
			School sc1=(School)sc.clone();
			s.name ="Harish";
			System.out.println(sc1);
			
		}
		
	    
}
