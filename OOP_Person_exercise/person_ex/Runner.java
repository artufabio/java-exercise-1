package com.qa.oop_exercises.person_ex;

public class Runner {

	public static void main(String[] args) {
		
		DbConnection dbc = new DbConnection();
		
		AppFlow af = new AppFlow();
		
		af.startAppFlow();
		
		dbc.close();
		
		MyScanner.sc.close();
		
		System.out.println("Program terminated.. Bye Bye!!");
		
	}

}
