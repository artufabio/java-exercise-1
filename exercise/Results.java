package com.qa.exercise;

public class Results {
	
	double chemistryScore = 125;
	double physicsScore = 140;
	double biologyScore = 115;
	double total = chemistryScore + physicsScore + biologyScore;
	double percentage = (total*100)/450;
	
	public void displayResults() {
		System.out.println("Chemistry result: " + chemistryScore);
		System.out.println("Physics result: " + physicsScore);
		System.out.println("Biology result: " + biologyScore);
		System.out.println("Total result:" + total);
	}
	
	public void displayPercentage() {
		System.out.println("Percentage Result: " + percentage);
		
	}

}
