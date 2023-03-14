package com.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArrays {
	public static ArrayList<Integer>sorter(String s)
	{
		ArrayList<Integer>fr=new ArrayList<Integer>();
		String []ints=s.substring(1, s.length()-1).split(",");
		System.out.println(Arrays.toString(ints));

		for(String str:ints)
		{
			fr.add(Integer.parseInt(str));
		}
		return fr;

	}

	public static ArrayList<String> finder(String rs)
	{
		ArrayList<String>arr=new ArrayList();
		String num="";
		char[]o=rs.toCharArray();
		for(char c:o)
		{
			if(c>='0'&&c<='9')
			{
				num+=c;
			}
			if(c==',')
			{
				arr.add(num);
				num="";
			}	
		}
		arr.add(num);
		return arr;
	}


	public static void main(String[] args) {
		String[] strs= {"[43,67,100]","[2,4,6,4]"};
		String a=strs[0];
		String b=strs[1];

		ArrayList<Integer>ints=sorter(a);

		ArrayList<Integer>ints2=sorter(b);

		int size=ints.size()>=ints2.size()?ints.size():ints2.size();
		String res="";
		for(int i=0;i<size;i++)
		{
			if(i<ints.size()&&i<ints2.size())
			{
				res+=ints.get(i)+ints2.get(i)+"-";
			}
			else if(i<ints.size())
			{
				res+=ints.get(i)+"-";
			}
			else if(i<ints2.size())
			{
				res+=ints2.get(i)+"-";
			}

		}
		System.out.println(res);


	}
}
//         by using finder()///////
//ArrayList<String>first=finder(a);
//ArrayList<String>second=finder(b);
//
//ArrayList<Integer>ints=first.stream().map(s->Integer.parseInt(s))
//		.collect(Collectors.toCollection(ArrayList<Integer>::new));
//System.out.println(ints);
//
//ArrayList<Integer>ints2=
//		second.stream().map(s->Integer.parseInt(s))
//		.collect(Collectors.toCollection(ArrayList<Integer>::new));
//System.out.println(ints2);
