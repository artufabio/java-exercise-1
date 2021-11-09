package com.qa.exercise_day2;

public class Flowcharts {
	
	/*Create a method which accepts 3 parameters, 2 integers and a boolean.

	If the boolean is true, the method will return a sum of the two numbers, and it if is false it will return the multiplication of the two numbers.
	For example:

	Input (1, 2, true) -> 3
	Input (3, 3, false) -> 9
	Input (1, 1, true) -> 2
	*/
	
	public int sumOrMult(int a, int b, boolean bool) {
		if (bool) {
			return a+b;
		} else {
			return a*b;
		}
	}
	
	/*Recreate the following flowchart as a project. Ensure that your logic and outputs match that of the flowchart.*/
	
	public void checkFlow(int a) {
		if (a > 2000) {
			System.out.println("A");
			if(a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (a>100) {
				System.out.println("3");
				if (a>600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if ( a > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
	
	/*BlackJack
Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.*/
	
	
	

}
