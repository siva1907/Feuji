package com.feb14;

public class FirstClass {

	public FirstClass(int val1) {
		super();
		System.out.println("first class with one arg");
		
	}
	public static void main(String[] args) {
		FirstClass obj1=new SecondClass(6,7,8,9,0,7);
	}
}
class SecondClass extends FirstClass{

	public SecondClass(int...val2) {
		super(1);
		System.out.println("second class with two args");		
	}
	
	
	
}
