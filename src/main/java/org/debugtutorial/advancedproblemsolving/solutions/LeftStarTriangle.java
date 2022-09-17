package org.debugtutorial.advancedproblemsolving.solutions;

/**
The code should print a left triangle star like the following
     *
    **
   ***
  ****
 *****
******
 */
public class LeftStarTriangle {
	public static void main(String[] args) {
		int row = 10;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
