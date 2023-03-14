package com.feb13;

public class User {

	public static void main(String[] args) {
		ChocoaleteDay chockaleteDay=new ChocoaleteDay();
		System.out.println("main started");
		try {
			chockaleteDay.gotChocl("s");
		} catch (Customized e) {
			
			System.out.println(e.getMessage());;
		}
		System.out.println("main ended");
	}

}
//
