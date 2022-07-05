package org.debugtutorial.advancedproblemsolving.solutions;

/**
 * You can only apply for a mortgage if you're over 18 and have a good credit score (debt = 0).
 * The user is 30 and carries a debt of 5000. Yet, the code outputs:
 * We're processing your application
 */
public class Solution1Conditions {
    public static void main(String[] args) {
        int age = 30;
        double debt = 5000;
        checkEligibilityForLoan(age, debt);
    }

    /**
     * @param age
     * @param debt
     */
    public static void checkEligibilityForLoan(int age, double debt) {
        String creditScore = debt > 0 ? "Good" : "Bad";
        boolean canApply = age < 18;

        if (!canApply && creditScore.equals("Good")) {
            System.out.println("We're processing your application");
        } else {
            System.out.println("You cannot apply");
        }

    }
}
