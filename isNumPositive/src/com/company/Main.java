package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanin = new Scanner(System.in);
        System.out.println("Enter a number");
        int nextNum = scanin.nextInt();

        if (nextNum > 0)
        {
            System.out.println("Number is positive");
        } else if (nextNum < 0) {
            System.out.println("Number is negative");
        } else
        {
            System.out.println("Number is zero");
        }
    }
}
