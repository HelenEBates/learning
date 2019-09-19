package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        //create a scanner to get the user input
        Scanner input = new Scanner(System.in);
        int number1; //first number to compare


        out.println("Input a number");
        number1 = input.nextInt(); // this reads a number from user


        if (number1 % 2 != 0) {
            System.out.println(number1 + " is odd");
            
        } if (number1 >=  2 &&  number1 <= 5) {
            System.out.println( number1 + " is between 2 and 5 ");
        } if (number1 >= 6 &&  number1 <=20) {
            System.out.println(number1 + " is between 6 and 20");
        } if (number1 > 20) {
            System.out.println(number1 + " is greater than 20");
        }
    }

    private static boolean isOdd(int number1) {
        boolean b = number1 % 2 == 0;
        return b;
    }
}
