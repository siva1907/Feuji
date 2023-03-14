package com.tests;

import java.util.Scanner;

public class SumOfTwo {
  static int sum(int a,int b)
  {
	  return a+=b;
  }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter 2 values");
		try 
		{
			System.out.println(sum(scanner.nextInt(),scanner.nextInt()));
		} 
		catch (Exception e) 
		{
		System.out.println("enter valid values");	
		}
		scanner.close();
	}

}
