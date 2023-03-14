package com.tests;

public class Leader {
	public static void lead(int[]array)
	{
		for(int index=0;index<array.length;index++)
		{
			boolean flag=true;
			for(int index2=index;index2<array.length;index2++)
			{
				if(array[index]<array[index2])
				{
					flag=false;
				}
			}
			if(flag)
			{
				disp(index, array);
				
			}
			else
			{
				System.out.println("no leader found...!");
			}
		}
	}
	public static void disp(int start,int arr[])
	{
		if(start!=arr.length-1)
		{
			System.out.print("{");
			for(int i=start;i<arr.length;i++)
			{
				
				System.out.print(arr[i]+" ");
				
			}
			System.out.print("}");
		}
	}
		public static void main(String[] args) {
			lead(new int []{1,2,7,6,5});
}
}
