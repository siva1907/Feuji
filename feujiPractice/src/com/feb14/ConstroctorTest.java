package com.feb14;

public class ConstroctorTest {
	int val1;
	String val2;
	public ConstroctorTest() {
		super();
	}

	
	protected void caller(int val1,String val2)
	{
		this.val1=val1;
		this.val2=val2;
		
		System.out.println(this.val1+"<-Int val\nString val->"+this.val2);
	}
	public static void main(String[] args) {
		ConstroctorTest test;
		test=new ConstroctorTest();
		test.caller(0,"zero");
	}

}
