package org.debugtutorial.problemsolving.simple;

/**
 * The file has TWO functions:
 * The first function should return a random number between 1 and 15.
 * The second function should check if that number is prime or composite.
 *
 * A prime number is not divisible by anything except itself and one .
 * Sample numbers are 17, 29, 41 etc.
 */
public class CheckPrimeProblem {
    public static void main(String[] args) {
        int random = random(15);
        System.out.println("Number: " + random);
        System.out.println("Prime or Composite: " + isPrime(random));
    }

    public static int random(int range) {
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
