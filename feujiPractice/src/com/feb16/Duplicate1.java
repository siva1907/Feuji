package com.feb16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list= new ArrayList<>();
		
		list.add("Name");
		list.add("Something");
		list.add("anyvalue");
		list.add("Name");
		list.add("Name");
		list.add("Name");
		list.add("Sai");
		
		list.add("Something");
		list.add("Something");
		list.add("Name");
		List<String> list1= new ArrayList<>();
		Collections.sort(list);
		System.out.println(list);
		int k=0;
		for(int i=0;i<list.size()-1;i++)
		{
		
			if(list.get(i).equals(list.get(i+1)))
			{
				list1.add(list.get(i+1)+""+(++k));
			}
			else {
				list1.add(list.get(i)+""+(++k));
				k=0;
			}
			
		}
		
		
		
		System.out.println(list1);
//		for(String s: list)
//		{
//			int count=0;
//			for(int i=0; i<s.length()-1;i++)
//			{
//				for(int j=i+1; j<s.length()-1;j++)
//				{
//					
//				if(list.get(i).equals(list.get(j)))
//				{
//					System.out.println(list.get(i)+""+count);
//					count++;
//				}
//					
////				}
//		if(list1.contains(s))
//		{
//			int count=1;
//			String duplicate= s+"_"+count;
//
//			// System.out.println(duplicate);
//			while(list1.contains(duplicate))
//			{
//				 count++;
//				  duplicate= s+"_"+count;
//				 
//			}
//			list1.add(duplicate);
//
//			
//		}
//		else
//		{
//			list1.add(s);
			 
//			}
//		}
}
}