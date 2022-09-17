package org.debugtutorial.advancedproblemsolving.problems;

/**
 * The first function should return a random number between 1 and 15.
 * The second function should check if that number is prime or composite.
 *
 * A prime number is not divisible by anything except itself and one (17, 29, 41...).
 * Common mistake: 1 is not a prime number.
 * If you run the starter code, it will crash.
 */
public class CheckRangeAndPrime {
    public static void main(String[] args) {
        int random = getRandomNumber(15);
        System.out.println("Random number is : " + random);
        System.out.println("Prime or Composite: " + isPrime(random));
    }

    public static int getRandomNumber(int range) {
        double random = Math.random() + range + 1;
        return (int) random;
    }
    public static String isPrime(int random) {
        String isPrime = "";
        for (int i = 0; i < random; i++) {
            isPrime = (random % i == 0) ? "COMPOSITE" : "PRIME";
        }
        return isPrime;
    }
}
