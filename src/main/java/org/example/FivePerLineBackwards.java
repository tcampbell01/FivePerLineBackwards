///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Five Per Line Backwards
// Course:          CS 200, Summer 2024, Jim Williams
//
// Author:          Teresa Campbell
// Email:           tjcampbe@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// None
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


package org.example;

import java.util.Scanner;

/**
 * This class contains a method to input numerical values into an array
 * in reverse order and print them in groups of five per line.
 */

public class FivePerLineBackwards {

    /**
     * Main method to input numerical values into an array in reverse order and
     * print them in groups of five per line.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALUES = 20;
        int[] yearlyValues = new int[NUM_VALUES];
        int i;
        int userNum;



        // Get array values
        for (i = yearlyValues.length - 1; i >= 0; i--) {
//            System.out.println("Please enter a numerical value:");
            yearlyValues[i] = scnr.nextInt();
        }

//        System.out.println("Final array: " + Arrays.toString(yearlyValues));
        /* Type your code here. */

        for (i = 0; i < 5; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(yearlyValues[i]);
        }
        System.out.println();

        for (i = 5; i < 10; i++) {
            if (i > 5) {
                System.out.print(" ");
            }
            System.out.print(yearlyValues[i]);
        }
        System.out.println();

        for (i = 10; i < 15; i++) {
            if (i > 10) {
                System.out.print(" ");
            }
            System.out.print(yearlyValues[i]);
        }
        System.out.println();

        for (i = 15; i < 20; i++) {
            if (i > 15) {
                System.out.print(" ");
            }
            System.out.print(yearlyValues[i]);
        }

    }
}