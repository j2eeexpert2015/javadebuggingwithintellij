package org.debugtutorial.problemsolving.problems.simple;

/**
 * The goal is to construct a right diagonal:
 *
 *         *
 *       *
 *     *
 *   *
 * *
 * However, the starter code prints the following:
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class PyramidProblem {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
