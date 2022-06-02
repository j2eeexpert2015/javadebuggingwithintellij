package org.debugtutorial.newproblems;

import java.util.Arrays;

/**
 * The transpose of a matrix reverses the columns and rows. In other words, each row from the original matrix becomes a column in the new matrix.
 *
 *
 *
 * Your code starts with the following matrix:
 *
 * >>: [1, 2, 3]
 *
 * >>: [4, 5, 6]
 *
 * >>: [7, 8, 9]
 *
 * The goal is to transpose it:
 *
 * >>: [1, 4, 7]
 *
 * >>: [2, 5, 8]
 *
 * >>: [3, 6, 9]
 *
 * But, your code produces:
 *
 * >>: [1, 4, 7]
 *
 * >>: [4, 5, 8]
 *
 * >>: [7, 8, 9]
 */
public class Problem9Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[j][i];
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
