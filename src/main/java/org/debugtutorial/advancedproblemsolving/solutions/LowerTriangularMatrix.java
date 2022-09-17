package org.debugtutorial.advancedproblemsolving.solutions;

/**
 * 
 * Java program to print Lower triangular matrix of an array
 *
 */

public class LowerTriangularMatrix {
	/*
	 * method to form lower triangular matrix
	 */
	static void lowerTriangularMatrix(int matrix[][], int row, int col) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				if (i < j) {
					System.out.print("0" + " ");
				} else
					System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Driver Code
	public static void main(String args[]) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int row = 3, col = 3;

		System.out.println("Lower triangular matrix: ");
		lowerTriangularMatrix(matrix, row, col);

	}
}
