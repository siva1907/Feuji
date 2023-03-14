package com.tests;

import java.util.Scanner;

public class ArithhmeticOps {
	
	public static int adding(int first,int second)
	{
		return first+second;
	}
	public static int subracting(int one,int two)
	{
		return one-two;
	}
	public static int multiply(int one,int two)
	{
		return one*two;
	}
	public static int divides(int one,int two)
	{
		return one/two;
	}
	public static int modules(int one,int two)
	{
		return one%two;
	}

	public static void main(String[] args) {
		boolean repeat=true;
		Scanner scan=new Scanner(System.in);
		while(repeat)
		{
		System.out.println("enter choice to perform operations\n.......................................................................................................");
		System.out.println("1.adding\n2.subraction\n3.multiplication\n4.division\n5.to get Modules(reminder)\n6.exitApplication");
		Integer a=scan.nextInt();
		System.out.println("enter 1st num\nenter 2nd num");
		Integer b=scan.nextInt(),c=scan.nextInt();
		if(a instanceof Integer && b instanceof Integer && c instanceof Integer)
			
				{
					switch (a)
					{
					case 1:System.out.println("sum of ints "+b+" and "+c+" is "+adding(b,c));
					break;
					case 2:System.out.println("subraction of ints "+b+" and "+c+" is "+subracting(b,c));
					break;
					case 3:System.out.println("product of ints "+b+" and "+c+" is "+multiply(b,c));
					break;
					case 4:System.out.println("division of ints "+b+" and "+c+" gives qoutient of "+divides(b,c));
					break;
					case 5:System.out.println("sum of ints "+b+" and "+c+" is "+modules(b,c));
					break;
					case 6:System.out.println("thankyou...!");
					System.exit(0);
					repeat=false;
					break;
					default: repeat = true;
					}
				
			}
		}


	}

}
