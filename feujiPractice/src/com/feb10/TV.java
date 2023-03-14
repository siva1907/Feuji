package com.feb10;

import java.util.Scanner;

public class TV extends Mobile implements Remote,Alexa {
	String power="yes";
	private int input;

	@Override
	public void handleTV() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter way to handle TV..!\n1.Remote\n2.Mobile\n3.Alexa");
		if(power.equals("yes"))
			 input=scanner.nextInt();
				{
			
			switch(input)
			{
			case 1:
				System.out.println("handled by remote");
				break;
			case 2:
				System.out.println("handled by remote");
				break;
			case 3:
				System.out.println("handled by remote");
				break;
			default:System.out.println("handling defaultly.....");
			
			}
		}
		
	}

}
