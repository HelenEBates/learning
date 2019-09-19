package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {



    public static void main(String[] args) {
        //create a scanner to get the user input
        Scanner input = new Scanner(System.in);

        //int number2; //second number
        int number1;
        out.println("Input your first number");
        number1 = input.nextInt(); // this reads the first number from user

        //System.out.println("Enter your second number");
        //number2 = input.nextInt(); //this reads the second number

        if (number1 >=  2 &&  number1 <= 5) {
            System.out.println( number1 + " is between 2 and 5 ");
        } if (number1 >= 6 &&  number1 <=20) {
            System.out.println(number1 + " is between 6 and 20");
        } if (number1 > 20) {
            System.out.println(number1 + " is greater than 20");
        }
    }
}
