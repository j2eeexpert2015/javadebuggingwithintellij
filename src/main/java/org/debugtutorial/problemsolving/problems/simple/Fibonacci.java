package org.debugtutorial.problemsolving.problems.simple;

import java.util.Arrays;
import java.util.ArrayList;

public class Fibonacci
{
    public static void main(String[] args) {
        int repeat = 8;
        String arrFibonacci = fib(repeat);
        System.out.println("Fibonacci " + arrFibonacci);
    }



    public static ArrayList<Integer> addStartingValue (ArrayList<Integer>  arrList) {
        int start = 1;
        arrList.add(start);
        return arrList;
    }
    public static ArrayList<Integer> startFibonacciSequence (ArrayList<Integer>  arrList, int i) {
        int prev = arrList.get(i-2);
        int curr = arrList.get(i-1);
        int newSeq = prev + prev;
        arrList.add(newSeq);
        return arrList;
    }


    public static String fib (int max) {
        Integer[] arr = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));

        for (int i = 0; i < max; i++) {
            int arrLen = arrList.size();
            arrList = (arrLen == 1) ? addStartingValue(arrList) : startFibonacciSequence(arrList, i);
        }

        arr = arrList.toArray(arr);
        String arrString = Arrays.toString(arr);
        return arrString;
    }

}
