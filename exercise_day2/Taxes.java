package com.qa.exercise_day2;

//Taxes
//Create the tax class, it contains 2 methods.
//
//Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.
//
//Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.
//
//These 2 methods should be able to work independently, so it is fine in this case if some of the code is repeated.*
//
//The salaries are taxed as below:
//
//0 - 14,999 : 0% tax
//15,000 - 19,999 : 10% tax
//20,000 - 29,999 : 15% tax
//30,000 - 44,999 : 20% tax
//45,000+ : 25% tax
//Finally combine the 2 methods so that the second method utilizes the first method to return the correct result.

public class Taxes {
	
	public static double salaryTaxed(double salary) {
		if (salary>0 && salary<15000) {
			return 0;
		} else if (salary<20000) {
			return 0.1;
		} else if (salary<30000) {
			return 0.15;
		} else if (salary<45000) {
			return 0.2;
		} else {
			return 0.25;
		}
	}
	
	public static double amountTax(double salary) {
		double tax = salaryTaxed(salary)*salary;
		System.out.println("Based on your salary you will pay the following amount of tax: " + tax);
		return tax;
	}

}
