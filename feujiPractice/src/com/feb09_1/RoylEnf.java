package com.feb09_1;

import java.util.Scanner;

public class RoylEnf extends TwoWheeler {
	public double priceViewer(String color)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter choosing color\n 1.red\n2.blue\ndefault is black..");
		int switcher=scan.nextInt();
		switch(switcher)
		{
		case 1:return 2500000;
		case 2:return 3500000;
		default:return tWprice;
		}
	}

}
 class Vespa extends TwoWheeler {
	public double priceViewer(String color)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter choosing color\n 1.red\n2.blue\ndefault is black..");
		int switcher=scan.nextInt();
		switch(switcher)
		{
		case 1:return 2500000;
		case 2:return 3500000;
		default:return tWprice;
		}
	}

}

