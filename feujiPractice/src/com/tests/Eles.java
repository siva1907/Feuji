package com.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Eles {
	static boolean flag=false;
static void comm(int[]a,int[]b)
{
	LinkedHashSet ar1=new LinkedHashSet();
	LinkedHashSet ar2=new LinkedHashSet();
	for(int ele:a)
	{
		ar1.add(ele);
	}
	for(int ele:b)
	{
		ar2.add(ele);
	}
	//System.out.println(ar1.equals(ar2));
	ArrayList arr1=new ArrayList(ar1);
	ArrayList arr2=new ArrayList(ar2);

	for(int i=0;i<arr1.size();i++) {
	
		for(int j=0;j<arr2.size();j++) {
			if(arr1.get(i)==arr2.get(j)) {
				System.out.println("common element="+arr1.get(i));
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
	int[]arr1= {2,3,5,4,4,6,5,7,8,5};
	int[]arr2= {11,4,12,13,14,5,4,5};
	comm(arr1,arr2);
}
}
