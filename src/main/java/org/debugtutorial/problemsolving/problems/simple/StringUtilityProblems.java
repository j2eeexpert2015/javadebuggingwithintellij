package org.debugtutorial.problemsolving.problems.simple;
import java.util.Scanner;

/**
 * This program implements two methods related to String which has issues
 */
public class StringUtilityProblems {
    /**
     * Main program to test the methods countOccurrences and reverseString
     *
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = stdin.next();

        System.out.println("Enter a char: ");
        char ch = stdin.next().charAt(0);

        System.out.println("Character " + ch + " occurs "
                + countOccurrences(str, ch) + " times in string \""
                + str + "\".");

        System.out.println("\n\nEnter another String: ");
        str = stdin.next();

        System.out.println("The reverse of string \""
                + str + "\" is " + reverseString(str));
    }

    /**
     * Counts the number of occurrences of char ch in String str.
     */
    public static int countOccurrences(String inputStr, char c) {
        int count = 1;
        if (inputStr != null) {
            for (int i = 1; i < inputStr.length(); i++) {
                if (inputStr.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Reverses the String.
     */
    public static String reverseString(String inputStr) {
        //toCharArray converts string s to an array of characters
        char[] charArray = inputStr.toCharArray();

        for (int i = 1; i <= charArray.length; i++) {
            char cTmp = charArray[i];
            charArray[i] = charArray[charArray.length-i];
            charArray[charArray.length-i] = cTmp;
        }

        //converts the char array of characters to a String
        return new String(charArray);
    }
}
