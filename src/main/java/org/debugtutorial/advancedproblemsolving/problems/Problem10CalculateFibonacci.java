package org.debugtutorial.advancedproblemsolving.problems;

/**
 * The following method intends to compute the n-th Fibonacci number,
 * but contains a bug for the first two numbers
 */
public class Problem10CalculateFibonacci {
    static int fib(int n) {
        int f = 0;
        int f0 = 1;
        int f1 = 1;

        while (n > 1) {
            n--;
            f = f0 +f1;
            f0 = f1;
            f1 = f;
        }
        return f;
    }
}
