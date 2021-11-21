package com.qa.oop_exercises.person_ex;


public class UserActions {

	Queries q = new Queries();
	String name;
	int id;
	CreatePerson pa = new CreatePerson();
	
//	Method that uses a while loop to dynamically create a Person instances and add them to people database 
	public void createListPeople() {
		System.out.println("Would you like to create a new person to add to your people? Type \"yes\" or \"no\"");
		String answer = MyScanner.sc.next().toLowerCase();
		
		// Create a person instances and add them to people database
		while (answer.equals("yes")) {

			Person p = pa.createPersonIstance();
			if (p != null) {
				q.create(p);
			}
			
			q.countPeople();

			System.out.println("Would you like to add another person? Type \"yes\" or \"no\"");
			answer = MyScanner.sc.next().toLowerCase();
		}
	}
	
	
//	CRUD operations inside a while loop in order to make changes to data saved on people database
	public void updateListPeople() {
		System.out.println("Would you like to make any changes to your people? Type \"yes\" or \"no\"");
		String answer = MyScanner.sc.next().toLowerCase();

		while (answer.equals("yes")) {
			System.out.println("What would you like to do?\n Type:\n"
					+ "\"add\": add a new person to the list\n"
					+ "\"delete\": delete a person from the list\n"
					+ "\"read\": view a person details\n"
					+ "\"update\": modify a person details from the list\n"
					+ "\"reset\": reset all the list and restart a new one");
			answer = MyScanner.sc.next().toLowerCase();
			
			switch(answer) {
			case "add":
				Person p = pa.createPersonIstance();
				if (p != null) {
					q.create(p);
				}
				break;
			case "delete":
				q.readAll();
				System.out.println("Type in the ID number of the person that you want to remove from the list:");
				id = MyScanner.sc.nextInt();
				q.deleteById(id);
				break;
			case "read":
				q.readAll();
				System.out.println("Type in the ID number of the person that you want to visualize:");
				id = MyScanner.sc.nextInt();
				q.readById(id);
				break;
			case "update":
				q.readAll();
				System.out.println("Type in the ID number of the person that you want to modify:");
				id = MyScanner.sc.nextInt();
				q.updateById(id);
				break;
			case "reset":
				q.deleteAll();
				break;
			default:
				System.out.println("Sorry, incorrect command.. Try again!");
				break;
			}

			q.countPeople();

			System.out.println("Would you like to make any more changes? Type \"yes\" or \"no\"");
			answer = MyScanner.sc.next().toLowerCase();
		}
	}
}
