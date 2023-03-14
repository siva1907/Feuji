package com.tests;

public class SumOfTwoArrays {
	public static int[] sum(int[]first,int[]second)
	{
		if(first.length==second.length)
		{
			for(int i:first)
			{

				first[i]+=second[i];
			}
			return first;
		}
		else
		{
			return null;
		}
	}
		
		
		
			
		
	

	public static void main(String[] args) {
		
		System.out.println(sum(new int[] {1,2,3,8},new int[] {1,2,4,'u'}));
	}

}
