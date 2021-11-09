package com.qa.exercise_day2;

//Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given.
//
//		 Input(1, 2, 3) -> 6
//		 Input(3, 3, 3) -> 0
//		 Input(1, 1, 2) -> 2

public class UniqueSum {

	public static int uSum(int a, int b, int c) {
		if (a==b) {
			if(a!=c) {
				return c;
			} else {
				return 0;
			}
		} else if (a == c) {
			return b;
		} else if (b == c) {
			return a;
		} else {
			return a+b+c;
		}
	}
}
