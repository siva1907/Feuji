package com.feb13;

public class ChocoaleteDay 
{
	String name;
public void gotChocl(String chock) throws Customized 
{
	if(chock==null)
	{
		throw new Customized("no chock for single");
	}
		
	else
	{
		System.out.println(chock+" "+ "is intersted");
	}
		
}
public void check(ChocoaleteDay c) throws Customized
{
	c.gotChocl(null);
}
}
