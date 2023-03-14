package com.feb22;

public class ThreadRunTest {
	public static void main(String[] args) {
		new Thread(new TreadRun(),"running").start();
		new Thread(new TreadRun(),"running 2").start();
		
	}

}
