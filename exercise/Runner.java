package com.qa.exercise;

public class Runner {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.sum(34, 56));
		System.out.println(calc.subtraction(34, 60));
		System.out.println(calc.moltiplaction(3, 4));
		System.out.println(calc.division(5, 2));
		
		Results res = new Results();
		res.displayResults();
		res.displayPercentage();
	}

}
