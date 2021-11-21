package com.qa.oop_exercises.person_ex;

public class AppFlow {

	UserActions ua = new UserActions();
	
	String answer;
	
	public void startAppFlow() {
		do {
			ua.createListPeople();
			
			ua.updateListPeople();
			
			System.out.println("Would you like to terminate the program? Type \"yes\" or \"no\"");
			answer = MyScanner.sc.next();

		} while(answer.equals("no"));
	}
}
