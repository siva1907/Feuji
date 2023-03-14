package com.feb08;

//Author is Sai
public class Bike extends Vehical {
	@Override
	public void consuming(String fuel) {
		noOfTires=2;
		
		switch(fuel)
		{
		case "d":System.out.println("runs by desiel and had "+noOfTires+" of tires");
		break;
		case "p":System.out.println("runs by petroland had "+noOfTires+" of tires");
		break;
		case "e":System.out.println("runs by electricityand had "+noOfTires+" of tires");
		//removed break here
		default:System.out.println("runs by fueland had "+noOfTires+" of tires");
		}
	}
	@Override
	public void starts()
	{
		driver();
		vehical="bike";
		
		System.out.println("starts "+vehical+" engine by kick/self start");
	}
	

}
