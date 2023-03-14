package com.feb09_1;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class User {
	@Test
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int wheeler,chooser=0;
		String color=null;
		System.out.println("enter value for 4/2...");
		wheeler=scanner.nextInt();
		
		switch(wheeler)
		{
		case 2:
			System.out.println("select brand\n1.RoyalEnfield\n2.vespa");
			chooser=scanner.nextInt();

			switch(chooser)
			{
			case 1:System.out.println(new RoylEnf().priceViewer(color));;
			break;
			case 2:System.out.println(new Vespa().priceViewer(color));
			break;
			default:
				System.out.println("no such brand avilable");

			}
			break;
		case 4:
			System.out.println("select brand\n1.audi\n2.swift\n3.benz");
			chooser=scanner.nextInt();
			switch(chooser)
			{
			case 1:System.out.println(new Audi().priceViewer(color));;
			break;
			case 2:System.out.println(new swift().priceViewer(color));
			break;
			case 3:System.out.println(new Benz().priceViewer(color));
			break;
			default:
				System.out.println("no such brand avilable");

			}
			break;
		default:
			System.out.println("no aviable for such wheeler");


		}



	}

}
