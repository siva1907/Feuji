package com.feb08;

public class Rider {

	public static void main(String[] args) throws Exception {

		Vehical vehical=new Bike();
		if(vehical instanceof Bike)
		{
			vehical.consuming("d");
			vehical.starts();
		}
		System.out.println(vehical.noOfTires);
		System.out.println(Vehical.vehical);//defualt 

		System.out.println("...........................");
		vehical=new Car();
		
		if(vehical instanceof Car)
		{
			vehical.consuming("p");
			vehical.starts();
			
		}
		System.out.println(vehical.noOfTires);//defualt
		System.out.println(Vehical.vehical);//defualt 

	}

}
