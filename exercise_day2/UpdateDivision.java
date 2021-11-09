package com.qa.exercise_day2;

//Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed.

public class UpdateDivision {
	
	public String division(double a, double b) {
		if (a<b) {
			double result = a/b; 
			return String.valueOf(result);
		} else {
			return "Division can't be executed.";
		}
	}
}
