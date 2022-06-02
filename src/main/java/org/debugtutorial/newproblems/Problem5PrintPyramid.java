package org.debugtutorial.newproblems;

/**
 * The goal is to construct a right diagonal:
 *
 * >>:         *
 * >>:       *
 * >>:     *
 * >>:   *
 * >>: *
 */
public class Problem5PrintPyramid {

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
