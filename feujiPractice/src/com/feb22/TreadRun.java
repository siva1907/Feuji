package com.feb22;

public class TreadRun implements Runnable {

	@Override
	public void run() {
		ThreadEx tex=new ThreadEx();
		tex.print();
		tex.print2();

	}

}
