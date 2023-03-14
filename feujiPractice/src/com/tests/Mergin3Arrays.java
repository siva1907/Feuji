package com.tests;

public class Mergin3Arrays {
public static int[] merge(int[]first,int[]second,int[]third)

{
	
	int[]res=new int[first.length+second.length+third.length];
	int largest=Math.max(first.length, Math.max(second.length, third.length));
	int a=0,b=first.length,c=b+second.length;
	for(int i=0;i<largest;i++)
	{
		 if(a<first.length)
		 {
			 res[a]=first[i];
			 a++;
		 }
		 if(i<second.length)
		 {
			 res[b]=second[i];
			 b++;
		 }
		 if(i<third.length)
		 {
			 res[c]=third[i];
			 c++;
		 }
	}
	return res;
}
	public static void main(String[] args) {
		int []a=merge(new int[] {1,2,3,4,8,5},new int[]{2,4,8,0},new int[]{2,4,5,6,9});
		for(int e:a)
		{
			System.out.println(e);
		}

		
		
	}	
	}
