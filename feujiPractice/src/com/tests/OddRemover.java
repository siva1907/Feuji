package com.tests;

public class OddRemover {
public static int[] remover(int[]ar)
{
	int noOFoddnums=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]%2!=0)
		{
			noOFoddnums++;
			ar[i]=0;
			System.out.println(ar[i]);
		}
	}
	int res[]=new int[ar.length-noOFoddnums];
	int j=0;
	for(int e:ar)
	{
		if(e!=0)
		{
			res[j]=e;
			j++;
		}
	}
	return res;
}
public static void main(String[] args) {
int[]res=	remover(new int[] {2,4,5,7,8,9,2,0});
for(int a:res)
{
	System.out.println(a);
}
}
}
