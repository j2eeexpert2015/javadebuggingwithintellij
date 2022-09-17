package org.debugtutorial.advancedproblemsolving.problems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * 
 * A number is called a smart number if it has an odd number of factors. Given some numbers, find whether they are smart numbers or not.
 * Debug the given function isSmartNumber to correctly check if a given number is a smart number.
 * Input Format
 * The first line of the input contains , t the number of test cases.
 * The next t lines contain one integer each.
 * 
 * Sample Input
 * 4
 * 1
 * 2
 * 7
 * 169
 * 
 * Sample Output
 * YES
 * NO
 * NO
 * YES
 */
public class SmartNumber {
    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);    
        if(num / val == 1)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        int test_cases;
        Scanner in = new Scanner(System.in);
        test_cases = in.nextInt();
        int num;
        for(int i = 0; i < test_cases; i++){
            num = in.nextInt();
            boolean ans = isSmartNumber(num);
            if(ans){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}



