package org.debugtutorial.newproblems;

/**
 * The goal is to construct a diagonal:
 *
 *  >>:*
 *  >>:  *
 *  >>:    *
 *  >>:      *
 *  >>:        *
 *  >>:          *
 *  >>:            *
 *  >>:              *
 *  >>:                *
 *  >>:                  *
 * The starter code prints the following:
 *
 * >>: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */
public class Problem3PrintPyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
              System.out.print(" * ");
          }
        }
    }
}
