package org.debugtutorial.problemsolving;
import java.util.*;

/**
 * Sample program to calculate average and
 */
public class Problem4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //find the average of a series of numbers
        int count = 0;
        double total=0;
        System.out.println("Enter a number: ");
        while(in.hasNextDouble())
        {
            total += in.nextDouble();
            System.out.println("Enter next number or Q to quit: ");
        }
        //to find the average, divide the total by the count of items
        double average = total/count;
        System.out.println("Average is: "+ average);
        //  find the celsius temp given the fahrenheit temp
        //  when the fahrenheit is 212, the celsius is 100
        int F = 212;
        double C = 5/9*(F-32);
        System.out.println("Celsius: "+C);

    }

}
