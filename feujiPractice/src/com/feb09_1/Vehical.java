package com.feb09_1;

public interface Vehical {
	String defualtColor="black";
	
	

}
class FourWheeler implements Vehical
{
	static final int noOfWheels=4; 
	final double  fWprice=3000000.0;
	
}
class TwoWheeler implements Vehical
{
	static final int noOfWheels=2; 
	final static double tWprice=300000.0;
	String colour;
}
