package com.tests;


public class LargestOfAll {
	public static int max(int[]arr)
	{
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(max(new int[] {1,11,5,8,13,9,2}));
	}

}
