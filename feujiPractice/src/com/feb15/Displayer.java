package com.feb15;

import java.util.List;

public class Displayer {
public void disp(List<Customer> list)
{
	for(Object e:list) {
		Customer c=(Customer)e;
		System.out.println(c);
	}
}
}
