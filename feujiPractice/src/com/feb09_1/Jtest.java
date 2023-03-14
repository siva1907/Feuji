package com.feb09_1;

import org.junit.Test;

import junit.framework.TestCase;

public class Jtest extends TestCase {
	@Test
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
				for(int i=index;i<array.length;i++)
				{
					System.out.println(array[i]);
				}			
			}
			else
			{
				System.out.println("no leader found...!");
			}
		}
	}

}
