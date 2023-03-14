package com.feb08;

public abstract class Vehical {
	 int noOfTires=7;
	 static String vehical="vec";
	 
	protected static void driver()
	{
		System.out.println("driver in...");
	}
	
	protected abstract void consuming(String fuel);
	protected void starts()
	{
		System.out.println("starts engine");
	}
	

}
