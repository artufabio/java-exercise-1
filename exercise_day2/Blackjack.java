package com.qa.exercise_day2;

public class Blackjack {
//	BlackJack
//	Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.

	public static int blackJack(int a, int b) {
		int aVs21 = 21 - a;
		int bVs21 = 21 - b;
		
		if (aVs21 < 0) {
			if (bVs21 < 0) {
				return 0;
			} else {
				return b;
			}
		} else if (bVs21 < 0) {
			return a;
		} else if (aVs21 < bVs21) {
			return a;
		} else {
			return b;
		}		
		
	}

}
