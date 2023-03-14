package com.feb16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<>();
		
		list.add("01Name");
		list.add("02Something");
		list.add("03anyvalue");
		list.add("01Name");
		list.add("02Name");
		list.add("02Name");
		list.add("01Something");
		list.add("02Something");
		list.add("03Name");
		List<String> list0=list.stream().map(e->e+"0").collect(Collectors.toList());
//		System.out.println(list0);
		for(int i=0;i<list0.size();i++)
		{
			for(int j=i+1;j<list0.size();j++)
			{
				String c=list0.get(i);
				if(list0.get(i).substring(0,list0.get(i).length()-1 ).equals(( list0.get(j)).substring(0,list0.get(j).length()-1)))
				{
					String n=list0.get(j);
					int k=Integer.parseInt(n.charAt(n.length()-1)+"");
					String n2=n.substring(0,n.length()-1)+""+(++k);
					System.out.println(n2);
					
				}
			}
		}
		
	}

}
