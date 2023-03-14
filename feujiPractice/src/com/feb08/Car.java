package com.feb08;

public class Car extends Vehical{
	
	
	@Override
	public void consuming(String fuel) {
		noOfTires=4;
		
		switch(fuel)
		{
		case "d":System.out.println("runs by desiel and had "+noOfTires+" of tires");
		break;
		case "p":System.out.println("runs by petroland had "+noOfTires+" of tires");
		break;
		case "e":System.out.println("runs by electricityand had "+noOfTires+" of tires");
		break;
		default:System.out.println("runs by fueland had "+noOfTires+" of tires");
	
		}
	}
	@Override
	public void starts()
	{
		driver();
		vehical="car";
		
		System.out.println("starts "+vehical+" engine by button");
	}
	

}
