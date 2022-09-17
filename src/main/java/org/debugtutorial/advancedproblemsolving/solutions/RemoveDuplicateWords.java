package org.debugtutorial.advancedproblemsolving.solutions;

import java.util.Scanner;
/**
 * Java Program To Remove Duplicate Words In A String Using For Loop
 */
public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// Declare all variables
		String sentence, result = "";
		String allWords[];
		
		Scanner sc = new Scanner(System.in);
		// Accept any sentence from User 
		System.out.print("Enter your sentence: "); 
		sentence = sc.nextLine().toLowerCase();  //convert to lower case
		
		// Split the given sentence to get each word as String array
		allWords = sentence.split(" ");
		// Use for loop to remove duplicate words
		for(int i=0; i<allWords.length; i++) {
			for(int j=i+1; j<allWords.length; j++) {
				if(allWords[i].equals(allWords[j])) {
					allWords[j] = "remove";
				}
			}
		}
		// Convert to String
		for(String word: allWords) {
			if(word != "remove") {
				result = result + word + " ";
			}
		}
		// Display given String after removing duplicates
		System.out.println("\nSentence after removing duplicate words: " + result);

	}

}
