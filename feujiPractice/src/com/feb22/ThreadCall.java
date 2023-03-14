package com.feb22;

import java.util.concurrent.Callable;

public class ThreadCall implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		return "hi";
	}

	

}
