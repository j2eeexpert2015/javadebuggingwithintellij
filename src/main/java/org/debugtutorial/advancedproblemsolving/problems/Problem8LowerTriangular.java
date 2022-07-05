package org.debugtutorial.advancedproblemsolving.problems;

import java.util.Arrays;

/**
 * A lower triangular matrix is a 2D array with zeros above the main diagonal.
 *
 *
 *
 * The goal is to convert a 2D array into a lower triangular matrix:
 *
 * >>: [1, 0, 0]
 *
 * >>: [8, 6, 0]
 *
 * >>: [2, 4, 6]
 *
 * However, your code produces:
 *
 * >>: [0, 2, 3]
 *
 * >>: [8, 0, 4]
 *
 * >>: [2, 4, 0]
 */
public class Problem8LowerTriangular {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {8, 6, 4},
            {2, 4, 6}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j >= i) {
                    matrix[i][j] = 0;
                }
            } 
        }

        System.out.println();
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
