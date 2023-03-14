package com.tests;

import java.util.Arrays;


public class CommonElement {
static	boolean  flag=false;
	public static void common(int[]arr1,int[]arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<arr1.length;i++) {
			int count=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]&&count<1) {
					System.out.println("common element="+arr1[i]);
					count++;
					flag=true;
				}
			}
			
		}
		if (!flag)
		{
			System.out.println("no common element");
		}
	}
	public static void main(String[] args) {
		int[]arr1= {2,3,4,6,5,7,8,5};
		int[]arr2= {11,12,13,14,5,5};
		common(arr1,arr2);
		
		
		
	}

}

