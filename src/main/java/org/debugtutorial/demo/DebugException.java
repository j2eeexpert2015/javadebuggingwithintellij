package org.debugtutorial.demo;

import java.net.MalformedURLException;
import java.net.URL;

public class DebugException {

    public static void main(String[] args) {

        returnUnCaughtException();

        try {
            returnCaughtExceptionHandledInCurrentProgram();
        } catch (IllegalArgumentException e) {
            // Caught exception
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            // This will throw a MalformedURLException
            URL url1 = new URL("malformed url");
        } catch (MalformedURLException e) {
            System.out.println("Caught MalformedURLException: " + e.getMessage());
        }
    }

    /**
     * Method to throw IllegalArgumentException
     */
    private static void returnCaughtExceptionHandledInCurrentProgram() {
        throw new IllegalArgumentException("This is a caught exception.");
    }

    /**
     * Method to throw Null pointer exception
     */
    private static void returnUnCaughtException() {
        String s = null;
        s.length(); // Throws a NullPointerException, which is uncaught
    }

}
