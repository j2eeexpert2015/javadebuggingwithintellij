package org.debugtutorial.demo;

public class DebugAverageCalculation
{
    public static void main(String[] args)
    {
        System.out.println("Average Calculation ");
        int[] numbers = {10, 20, 30};
        double average = calculateAverage(numbers);
        System.out.println("The average is :" + average);
    }

    private static double calculateAverage(int[] input)
    {
        double result = 0;
        for (int element : input) {
            result += element;
        }
        result = result / input.length;
        return result;
    }
}
