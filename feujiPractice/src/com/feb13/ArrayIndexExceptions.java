package com.feb13;

public class ArrayIndexExceptions {
	  static int[]intvalues= {1,3,4,5,6};
	 
	public static void outBounder(int[] hh) throws ArrayIndexOutOfBoundsException{
		for(int index=0;index<=hh.length;index++)
		{
			System.out.println("ele "+hh[index]);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		
		try {
		outBounder(intvalues);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("main ended");
	}
	
}
