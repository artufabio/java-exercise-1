package com.qa.oop_exercises.person_ex;

import java.util.Scanner;

public class Runner {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserActions ua = new UserActions();
		
		String answer;
		
		do {
			ua.createListPeople();
			
			ua.updateListPeople();
			
			System.out.println("Would you like to terminate the program? Type \"yes\" or \"no\"");
			answer = sc.next();

		} while(answer.equals("no"));
		
		System.out.println("Program terminated.. Bye Bye!!");
		
	}

}
