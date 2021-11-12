package com.qa.oop_exercises.person_ex;

import java.util.Scanner;

public class UserActions {

	public static Scanner sc = new Scanner(System.in);
	
	String name;
	PersonActions pa = new PersonActions();
	
	
	public void createListPeople() {
		System.out.println("Would you like to create a new person to add to your people? Type \"yes\" or \"no\"");
		String answer = sc.next().toLowerCase();
		
		// Create an ArrayList of people
		while (answer.equals("yes")) {

			pa.addPersonToList(pa.createPersonIstance());
			System.out.println(pa.howMany());
			pa.printPeople();

			System.out.println("Would you like to add another person? Type \"yes\" or \"no\"");
			answer = sc.next().toLowerCase();
		}
	}
	
	public void updateListPeople() {
		System.out.println("Would you like to make any changes to your people? Type \"yes\" or \"no\"");
		String answer = sc.next().toLowerCase();

		while (answer.equals("yes")) {
			System.out.println("What would you like to do? Type \"add\", \"delete\", \"read\" or \"update\"");
			answer = sc.next().toLowerCase();
			
			switch(answer) {
			case "add":
				pa.addPersonToList(pa.createPersonIstance());
				break;
			case "delete":
				System.out.println("Type the name of the person that you want delete from the list.");
				sc.nextLine();
				name = sc.nextLine();
				pa.removePersonFromList(pa.findPerson(name));
				break;
			case "read":
				System.out.println("Type the name of the person that you want to display.");
				sc.nextLine();
				name = sc.nextLine();
				pa.printPerson(pa.findPerson(name));
				break;
			case "update":
				System.out.println("Type the name of the person that you want to update.");
				sc.nextLine();
				name = sc.nextLine();
				pa.updatePersonFromTheList(pa.findPerson(name));
				break;
			default:
				break;
			}

			System.out.println(pa.howMany());
			pa.printPeople();

			System.out.println("Would you like to make any more changes? Type \"yes\" or \"no\"");
			answer = sc.next().toLowerCase();
		}
	}
}
