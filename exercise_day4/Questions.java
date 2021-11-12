package com.qa.testdrivendevelopment;

public class Questions {

	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string, return a string where for every char in the original string,
	 * there are three chars.<br>
	 * <br>
	 * 
	 * For Example:<br>
	 * multChar("The") → "TTThhheee"<br>
	 * multChar("AAbb") → "AAAAAAbbbbbb"<br>
	 * multChar("Hi-There") → "HHHiii---TTThhheeerrreee"
	 */
	public String multiChar(String input) {
		String newInput = "";
		for (int i = 0; i <= input.length() - 1; i++) {
			String charToCopy = String.valueOf(input.charAt(i));
			newInput = newInput + charToCopy + charToCopy + charToCopy;
		}
		return newInput;
	}

	/**
	 * Return the string (backwards) that is between the first and last appearance
	 * of "bread" in the given string, or return the empty string "" if there is not
	 * 2 occurances of "bread". Ignore Case<br>
	 * <br>
	 * For Example: sandwichFilling("breadclivebread") → "evilc"<br>
	 * sandwichFilling("xxbreadfridgebreadyy") → "egdirf"<br>
	 * sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"<br>
	 * sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""<br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */

	public String sandwichFilling(String sandwich) {
		sandwich = sandwich.toLowerCase();
		return "";
	}

	/**
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large. Do not assume the ints will come to you in a reasonable order.<br>
	 * <br>
	 * For Example:<br>
	 * evenlySpaced(2, 4, 6) → true<br>
	 * evenlySpaced(4, 6, 2) → true<br>
	 * evenlySpaced(4, 6, 3) → false<br>
	 * evenlySpaced(4, 60, 9) → false
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		int counter1 = Math.abs(a - b);
		int counter2 = Math.abs(a - c);
		int counter3 = Math.abs(b - c);
		
		boolean evenSpace = (counter1 == counter2 || counter1 == counter3 || counter2 == counter3)? true : false;
		
		return evenSpace;
	}

	/**
	 * Given a string and an int n, return a string that removes n letters from
	 * the'middle' of the string. The string length will be at least n. The input
	 * string will have an odd number of letters. n will always be an odd
	 * number.<br>
	 * <br>
	 * For Example:<br>
	 * nMid("Hello", 3) → "Ho"<br>
	 * nMid("Chocolate", 3) → "Choate"<br>
	 * nMid("Chocolate", 1) → "Choclate"<br>
	 */
	public String nMid(String input, int n) {
		int inputLength = input.length();
		String startNew = input.substring(0, (inputLength - n)/2);
		String endNew = input.substring((inputLength - n)/2 + n, inputLength);
		return startNew + endNew;
	}

	/**
	 * Given a string, return the boolean True if it ends in "java" and False if
	 * does not end in "java". Ignore Case.<br>
	 * <br>
	 * For Example: <br>
	 * endsJava("ilovejava") → true <br>
	 * endsJava("iloveJaVa") → true <br>
	 * endsJava("welovejava") → true <br>
	 * endsJava("welovejavamoreeveryday") → false <br>
	 * endsJava("javaiscool") → false <br>
	 * endsJava("pythoniscool") → false <br>
	 */
	public boolean endsJava(String input) {
		input = input.toLowerCase();
		String findJava = "java";
		int javaLastIndex = input.lastIndexOf(findJava); //5
		
//		check if the index of the last "java" occurrence + the occurrence length matches the input string length:
//		if true the input end with java
		boolean endsWithJava = (javaLastIndex + findJava.length()) == input.length() ? true : false ;
    	return endsWithJava;
	}

	/**
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same, do not ignore case.<br>
	 * <br>
	 * For Example: superBlock("hooopplla") → 3 <br>
	 * superBlock("abbCCCddDDDDeeEEE") → 4 <br>
	 * superBlock("abbCCCCC")) → 5 <br>
	 * superBlock("") → 0 <br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */
	public int superBlock(String input) {
		int counter = 0;
		int maxBlockLength = 0;		//stores the highest counter value
		String prevChar = "";		//stores previous characters
		String followChar = "";		//stores following characters
		
		for (int i = 0; i <= input.length() - 1; i++) {
			followChar = String.valueOf(input.charAt(i));
			counter = followChar.equals(prevChar) ? ++counter : 0;
			maxBlockLength = (counter > maxBlockLength) ? counter : maxBlockLength;
			prevChar = followChar;
		}
		maxBlockLength = maxBlockLength != 0 ? ++maxBlockLength : maxBlockLength;
    	return maxBlockLength;
    	// I increment maxBlockLength by 1 if !=0. This is because counter actually counts how many matches between 
    	// equals characters. 3 matches requires 4 equals characters, 5 matches 6 characters, and so on.
	}

	/**
	 * Given a string - return the number of times "am" appears in the String
	 * ignoring case - BUT ONLY WHEN the word "am" appears without being followed or
	 * preceded by other letters <br>
	 * <br>
	 * For Example: <br>
	 * amISearch("Am I in Amsterdam") → 1 <br>
	 * amISearch("I am in Amsterdam am I?") → 2 <br>
	 * amISearch("I have been in Amsterdam") → 0 <br>
	 * <br>
	 * HINT: String.toLowerCase
	 */
	public int amISearch(String sentence) {
		sentence = sentence.toLowerCase();
		int counter = 0;
//		
//		int ind = sentence.indexOf(sentence, "am");
//		while (sentence.indexOf(sentence, "am"))
//		
//		char [] sentenceArray = sentence.toCharArray();
//		int counter = 0;
//		System.out.println(sentenceArray.length);
//		
//		for (int i = 0; i <= sentenceArray.length - 1; i++) {
//			System.out.println(i);
//			if (String.valueOf(sentenceArray[i]).equals("a") &&
//				String.valueOf(sentenceArray[i]).equals("m") &&
//				String.valueOf(sentenceArray[i]).equals(" ") &&
//				String.valueOf(sentenceArray[i]).equals(" ")) {
//				counter++;
//			}
//		}
		
    	return counter;
	}

	/**
	 * Given a number if this number is divisible by 3 return "fizz" if this number
	 * is divisible by 5 return "buzz" if this number is divisible by both 3 and 5
	 * return "fizzbuzz" if this number is not divisible by 3 or 5 return null<br>
	 * <br>
	 * For Example: <br>
	 * fizzBuzz(3) → "fizz" <br>
	 * fizzBuzz(10) → "buzz" <br>
	 * fizzBuzz(15) → "fizzbuzz" <br>
	 * fizzBuzz(8) → null
	 */
	public String fizzBuzz(int number) {
		if (number%3 == 0) {
			if(number%5 == 0) {
				return "fizzbuzz";
			} else {
				return "fizz";
			}
		} else if (number%5 == 0) {
			return "buzz";
		} else {
			return null;
		}
	}

	/**
	 * Given a string, split the string into the individual numbers present then add
	 * each digit of each number to get a final value for each number <br>
	 * <br>
	 * String example = "55 72 86"<br>
	 * <br>
	 * "55" will = the integer 10 <br>
	 * "72" will = the integer 9 <br>
	 * "86" will = the integer 14 <br>
	 * <br>
	 * You then need to return the highest vale <br>
	 * <br>
	 * For Example: <br>
	 * largest("55 72 86") → 14 <br>
	 * largest("15 72 80 164") → 11 <br>
	 * largest("555 72 86 45 10") → 15 <br>
	 * <br>
	 * HINT: Integer.parseInt
	 */

	public int largest(String input) {
		int counter=0, bigSum = 0;
		
//		Split array input into numbers
		String splitInput[] = input.split(" ");
		
		for (int i=0; i<= splitInput.length - 1; i++) {
			
//			Split string numbers into digits and sum them
			String splitNum[] = splitInput[i].split("");
			for (int j=0; j<= splitNum.length - 1; j++) {
				counter += Integer.parseInt(splitNum[j]);
			}
			bigSum = (counter > bigSum) ? counter: bigSum;
			counter = 0;
		}
    	return bigSum;
	}

	/**
	 * Given a string, int and a char, return a boolean value if the 'nth'
	 * (represented by the int provided) char of the String supplied is the same as
	 * the char supplied. The int provided will NOT always be less than than the
	 * length of the String. Ignore case and Whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * compares("The",2,'h') → true <br>
	 * compares("AAbb",1,'b') → false <br>
	 * compares("Hi-There",10,'e') → false <br>
	 * <br>
	 * HINT: String.charAt
	 */
	public boolean compares(String word, int index, char letter) {
//		boolean bool = false;
//		if (index <= word.length()) {
//			bool = (word.charAt(index) == letter) ? true : false;
//			return bool;
//		}
//    	return bool;
		return (index <= word.length()) ? ((word.charAt(index) == letter) ? true : false) : false;
	}
}
