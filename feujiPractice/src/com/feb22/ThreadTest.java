package com.feb22;

public class ThreadTest extends Thread {
	static ThreadEx thread1;
	public void run() {
		thread1.print();
		thread1.print2();
	}

	public static void main(String[] args) {
		ThreadTest ts=new ThreadTest();		
		ThreadTest ts2=new ThreadTest();		
		thread1=new ThreadEx();
		ts.start();
		ts2.start();
		
		
	}

}
