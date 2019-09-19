package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an int, a double and a string");

        int number1 = scan.nextInt();
        double double1 = scan.nextDouble();
        String myString = scan.next();
        scan.close();

        System.out.println("The string entered was " + myString);
        System.out.println("The double entered was " + double1);
        System.out.println("The number entered was " + number1);

    }
}
