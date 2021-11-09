/*Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.

Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.

eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84

they would have an overall grade of 85.3% (Pass)

but in this case the student would fail because their physics grade is 54% (Fail)

Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.
 */



package com.qa.exercise_day2;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex1
		UpdateDivision div = new UpdateDivision();
		System.out.println(div.division(3, 4));
		
		System.out.println("-------------------------------");
//		ex2
		UpdateResults res = new UpdateResults();
		res.biologyScore = 10;
		res.chemistryScore = 150;
		res.physicsScore = 105;
		res.passMark = 60;
		res.total = res.biologyScore + res.chemistryScore + res.physicsScore;
		
		res.displayResults();
		res.displayPercentage();
		
		System.out.println("-------------------------------");
//		ex3
		Flowcharts sOrM = new Flowcharts();
		System.out.println(sOrM.sumOrMult(5, 6, false));
		System.out.println(sOrM.sumOrMult(3, 9, true));
		
		System.out.println("-------------------------------");
		
		Flowcharts flowA = new Flowcharts();
		flowA.checkFlow(60);
		System.out.println("--");
		flowA.checkFlow(460);
		System.out.println("--");
		flowA.checkFlow(560);
		System.out.println("--");
		flowA.checkFlow(660);
		System.out.println("--");
		flowA.checkFlow(2060);
		System.out.println("--");
		flowA.checkFlow(3060);
		System.out.println("--");
		flowA.checkFlow(5060);
		System.out.println("--");
		flowA.checkFlow(7060);
		
		System.out.println("-------------------------------");
		
		System.out.println(Blackjack.blackJack(2, 5));
		System.out.println(Blackjack.blackJack(22, 55));
		System.out.println(Blackjack.blackJack(12, 5));
		System.out.println(Blackjack.blackJack(23, 5));
		System.out.println(Blackjack.blackJack(2, 55));
		
		System.out.println("-------------------------------");
		
		System.out.println(UniqueSum.uSum(2, 1, 3));
		System.out.println(UniqueSum.uSum(2, 2, 3));
		System.out.println(UniqueSum.uSum(2, 1, 1));
		System.out.println(UniqueSum.uSum(3, 3, 3));
		
		System.out.println("-------------------------------");
		
		Taxes.amountTax(10000);
		Taxes.amountTax(18000);
		Taxes.amountTax(25000);
		Taxes.amountTax(35000);
		Taxes.amountTax(60000);
		
		System.out.println("-------------------------------");
		
		System.out.println(FizzBuzz.fizzOrBuzz(15));
		System.out.println(FizzBuzz.fizzOrBuzz(9));
		System.out.println(FizzBuzz.fizzOrBuzz(20));
		System.out.println(FizzBuzz.fizzOrBuzz(17));
		
		
		
	}

}
