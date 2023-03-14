package com.feb10;

public interface Human {
default void display() {
	System.out.println("human impl");
}
}
