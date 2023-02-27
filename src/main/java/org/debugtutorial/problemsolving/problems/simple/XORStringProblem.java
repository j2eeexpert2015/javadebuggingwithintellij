package org.debugtutorial.problemsolving.problems.simple;

import java.util.*;

/**
 * Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
 * Debug the given function strings_xor to find the XOR of the two given strings appropriately.
 * Input Format
 *
 * The input consists of two lines. The first line of the input contains the first string
 * and the second line contains the second string
 *
 * Sample Input
 * 10101
 * 00101
 *
 * Sample Output
 * 10000
 */
public class XORStringProblem {
    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res = "0";
            else
                res = "1";
        }

        return res;
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }

}

