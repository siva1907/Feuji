package com.feb09_1;

import java.util.Scanner;

public class Audi extends FourWheeler {
	Scanner scan=new Scanner(System.in);
	public double priceViewer(String color)
	{
		
		System.out.println("enter choosing color\n 1.red\n2.blue\ndefault is black..");
		int switcher=scan.nextInt();
		switch(switcher)
		{
		case 1:return 2500000;
		case 2:return 3500000;
		default:return fWprice;
		}
	}
	
}
class Benz extends FourWheeler{
	Scanner scan=new Scanner(System.in);
	public double priceViewer(String color)
	{
		
		System.out.println("enter choosing color\n 1.red\n2.blue\ndefault is black..");
		int switcher=scan.nextInt();
		switch(switcher)
		{
		case 1:return 2500000;
		case 2:return 3500000;
		default:return fWprice;
		}
	}
}
class swift extends FourWheeler{
	Scanner scan=new Scanner(System.in);
	public double priceViewer(String color)
	{
		
		System.out.println("enter choosing color\n 1.red\n2.blue\ndefault is black..");
		int switcher=scan.nextInt();
		switch(switcher)
		{
		case 1:return 2500000;
		case 2:return 3500000;
		default:return fWprice;
		}
	}
}

