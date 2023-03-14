package com.tests;

import java.util.Scanner;

public class SwappingWithoutContainer {

	public static void swapper(int a,int b)
	{
		a=a^b;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two swapping nums");
		Integer a=scan.nextInt(),b=scan.nextInt();
		if(a instanceof Integer && b instanceof Integer)
		{
			swapper(a, b);
		}
		else
		{
			System.out.println("enter valid nums");
		}
		
	}

}
