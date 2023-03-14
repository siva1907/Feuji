package com.tests;

import java.util.Arrays;

public class SumLeadsZero {
	public static boolean summingElementsForZero(int[]arr)
	{
		int sum=0;

		for(int index=0;index< arr.length;index++)
		{
			sum+=arr[index];

		}
		if(sum==0)
		{
			System.out.println(Arrays.toString(arr));
			return true;
		}
		else
		{
			System.out.println("dummy");
			return false;
		}
	}
	
	public static void zeroFinder(int[] array)
	{
		int length=array.length;
		for(int firstIndex=0;firstIndex<array.length;firstIndex++)
		{
			System.out.println(firstIndex+"first");
			for(int second=firstIndex;second<length;second++)
			{
				System.out.println(second+"second");
				
			}
			length--;
		}
		
	}
	public static void main(String[] args) {
		zeroFinder(new int[] {-1,1,2,-2,8,-8,6});
	}
	
	
}
