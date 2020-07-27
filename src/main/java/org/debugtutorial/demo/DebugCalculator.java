package org.debugtutorial.demo;

import org.debugtutorial.util.CalculatorUtil;

/**
 * Sample class for Calculator example
 */
public class DebugCalculator {
	
	////Master branch commit
	//Dev branch commit
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		i = i + 1;
		j = j - 1;
		
		int result1 = CalculatorUtil.add(i, j);
		System.out.println("result1:" + result1);
		int result2 = CalculatorUtil.subtract(result1, i);
		System.out.println("result2:" + result2);
		int result3 = CalculatorUtil.divide(100, 10);
		System.out.println("result3:" + result3);
		int result4 = CalculatorUtil.factorial(5);
		System.out.println("result4:" + result4);

		int result5 = CalculatorUtil.divideWithExceptionHandling(100, 0);
		System.out.println("result3:" + result3);

	}
}
