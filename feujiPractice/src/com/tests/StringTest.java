package com.tests;



public class StringTest {
	static StringBuilder a=new StringBuilder("ABVH");
	static StringBuilder b=new StringBuilder("VYZ");
	static StringBuilder res=new StringBuilder("");

	public static void main(String[] args) {
		System.out.println("main started");
		int i=0,j=0,k=0;
		while(a!=null||b!=null)
		{
			if(i<a.length()&&j<b.length())
			{
				char c=a.charAt(i)<b.charAt(j)?a.charAt(i):b.charAt(j);
				res.append(c);
				if(a.charAt(i)==res.charAt(k))
				{
					i++;
				}
				else {
					j++;
				}
				k++;
				a.substring(i);
				b.substring(j);
			}
			else
			{
				break;
			}
		}
		if(i==a.length())
		{
			res.append(b.substring(j));
		}
		else {
			res.append(a.substring(i));
		}
		System.out.println(res);
	}
}
