package com.feb14;

public class TestString {
	String name="my name";
	void StringManipulator(String name)
	{
		System.out.println(name.concat(" is siva"));
		System.out.println(name.length());
		System.out.println(name.contains("siva"));
		System.out.println(name.replace("name", "naam"));
		System.out.println(name.substring(5));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(6));
		System.out.println(name.indexOf("name", 0));
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		TestString test=new TestString();
//		test.StringManipulator(test.name);
		StringBuffer sb=new StringBuffer(test.name.substring(3,6));
		System.out.println(sb);
		
		
	}

}
