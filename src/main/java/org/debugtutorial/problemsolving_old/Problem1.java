package org.debugtutorial.problemsolving_old;

public class Problem1 {
	public static void printCharacters(String word)
	{
		for (int i = 0; i <= word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	} 
	
	
	public static void main(String[] args) {
		String testWord = "ABCD";
		printCharacters(testWord);
		
	}

}
