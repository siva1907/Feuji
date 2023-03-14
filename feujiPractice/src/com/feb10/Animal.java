package com.feb10;

public interface Animal {


	default void   display() {
	System.out.println("animal implementation");
}
}
