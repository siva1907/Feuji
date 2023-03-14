package com.tests;

public class PairSumArray {
	 public static void sumArray(int[]arr1,int num)
	 {
	
		 for(int i=0;i<arr1.length;i++)
		 {
			 int sum=0;
			 for(int j=i;j<arr1.length;j++)
			 {
				 sum=sum+arr1[j];
				if(sum==num) 
				{
					for(int k=i;k<=j;k++)
					{
						System.out.println(arr1[k]);
					}
				}
			 }
		 }
	 }
	public static void main(String[] args) {
		
		int[] arr1= {3,4,-7,3,1,3,1,-4,-2,2};
		
		sumArray(arr1,0);
	}

}
