package com.qa.oop_exercises.person_ex;

public class CreatePerson{
	
//	Method that returns a new Person object based on what the Scanner collects from users typing
	public Person createPersonIstance() {
		try {
			Person pers = new Person();
			System.out.println("What's their name?");
			MyScanner.sc.nextLine();
			pers.setName(MyScanner.sc.nextLine());
			System.out.println("What's their age?");
			pers.setAge(MyScanner.sc.nextInt());
			System.out.println("What's their job title?");
			MyScanner.sc.nextLine();
			pers.setJobTitle(MyScanner.sc.nextLine());
			return pers;
		}catch(Exception e) {
			System.out.println("Sorry but your input is not correct... Please try again.");
		}
		MyScanner.sc.nextLine();
		return null;
	}

}
