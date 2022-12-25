package org.debugtutorial.problemsolving.simple;

/**
 * The file has TWO functions:
 * The first function should return a random number between 1 and 15.
 * The second function should check if that number is prime or composite.
 *
 * A prime number is not divisible by anything except itself and one .
 * Sample numbers are 19, 29, 41 etc.
 */
public class CheckPrimeProblem {
    public static void main(String[] args) {
        int randomNumber = getRandomNumber(15);
        System.out.println("Input Number: " + randomNumber);
        System.out.println("Prime or Composite: " + checkPrime(randomNumber));
    }

    public static int getRandomNumber(int range) {
        double random = Math.random() + range + 1;
        return (int) random;
    }
    public static String checkPrime(int random) {
        String isPrime = "";
        for (int i = 0; i < random; i++) {
            isPrime = (random % i == 0) ? "COMPOSITE" : "PRIME";
        }
        return isPrime;
    }
}
