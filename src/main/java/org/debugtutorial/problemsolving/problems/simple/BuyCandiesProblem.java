package org.debugtutorial.problemsolving.problems.simple;

public class BuyCandiesProblem {
    public static void main(String[] args) {
        double candyPrice =0.10; //Candy Price is 10 cents
        double totalBudget =1.0; //Total budget is 10 USD
        int count = 0; //Start with zero candies
        while (totalBudget>=candyPrice) {
            candyPrice = candyPrice+1;
            totalBudget = totalBudget - candyPrice;
            candyPrice = candyPrice = +.10;
        }
        System.out.println("Total number of candies bought:"+count);
        System.out.println("Money left after buying all candies bought:"+totalBudget);
    }
}
