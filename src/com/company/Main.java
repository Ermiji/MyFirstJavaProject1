package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //This is a single line comment
        /*
        * This is multiple comment line
         */

    // Defining variables
        int num1;
        int num2;
        int total;
    // setting up application for input
        Scanner keyboard = new Scanner(System.in);
    // Prompting user for first number
        System.out.println("Enter number 1");
     // storing first number
        num1 = keyboard.nextInt();
        // Prompt user for second number
        System.out.println("Enter number 2");
        // storing first number
        num2 = keyboard.nextInt();
    // Storing second number
        total = num1 + num2;
    // print total
        System.out.println(total);
    }
}
