package com.feb14;

public class Squiring {
	static int a;
	static void sqring(int a)
	{
		System.out.println(++a);
		return ;
	}
	public static void main(String[] args) {
		a=10;
		System.out.println(a);
		sqring(a);
		System.out.println(a);
		
	}
}
