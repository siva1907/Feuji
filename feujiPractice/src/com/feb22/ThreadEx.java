package com.feb22;

public class ThreadEx {

	public void print() {
		for(int i=0;i<5;i++) {
			synchronized (this)  {
				System.out.println("Hello"+Thread.currentThread().getName());
			}
			
		}
	}
	public synchronized void   print2() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello 2 "+Thread.currentThread().getName());
		}
	}
}
