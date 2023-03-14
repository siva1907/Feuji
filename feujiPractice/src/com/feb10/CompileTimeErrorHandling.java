package com.feb10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeErrorHandling {
	static File f=new File("abc");
	public static void main(String[] args) {
		System.out.println("exeption started");
		try {
			FileReader fr=new FileReader(f);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("catched exception :");
			e.printStackTrace();
		}
		System.out.println("ended exception");
	}
}
