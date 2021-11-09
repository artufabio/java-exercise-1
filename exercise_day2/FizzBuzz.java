package com.qa.exercise_day2;

//Create a method which returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
//Return 'FizzBuzz' for numbers which are multiples of both three and five.
//Return the input number for numbers that are neither.

public class FizzBuzz {
	
	public static String fizzOrBuzz(int a) {
		if (a%3 == 0) {
			if(a%5 == 0) {
				return "FizzBuzz";
			} else {
				return "Fizz";
			}
		} else if (a%5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(a);
		}
	}

}
