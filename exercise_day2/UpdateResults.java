package com.qa.exercise_day2;

public class UpdateResults {
	double chemistryScore;
	double physicsScore;
	double biologyScore;
	double total;
	double passMark;
	
	public void displayResults() {
		System.out.println("Chemistry result: " + chemistryScore);
		System.out.println("Physics result: " + physicsScore);
		System.out.println("Biology result: " + biologyScore);
		System.out.println("Total result:" + total);
	}
	
	public void displayPercentage() {
		double percentage = total*100/450;
		double percentChem = chemistryScore*100/150;
		double percentPhys = physicsScore*100/150;
		double percentBio = biologyScore*100/150;
		int failedExams = 0;
		
		System.out.println("Percentage Result: " + percentage);
		if(percentage < passMark) {
			System.out.println("Exam failed");
		} else {
			if (percentChem < passMark || percentPhys < passMark || percentBio < passMark) {
				System.out.println("Exam Failed");
			}
		}
		
		if (percentChem < passMark) {
			System.out.println("Chemistry exam failed: " + percentChem);
			failedExams++;
		}
		if (percentPhys < passMark) {
			System.out.println("Physics exam failed: " + percentPhys);
			failedExams++;
		}
		if (percentBio < passMark) {
			System.out.println("Biology exam failed: " + percentBio);
			failedExams++;
		}
		if (failedExams > 0 ) {
			System.out.println("You have failed " + failedExams + " exams.");
		}
	}
}
