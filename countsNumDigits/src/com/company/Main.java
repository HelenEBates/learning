package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = scanNum.nextInt();

        System.out.println("Enter second number");
        int y = scanNum.nextInt();

        System.out.println("Enter a third number");
        int z = scanNum.nextInt();

        if (x == y && x == z )
        {
            System.out.println("Numbers are the same");
        }
        else if (x !=y || y != z)
        {
            System.out.println("Numbers are not all same or all different");
        } else
        {
            System.out.println("All numbers are different");
        }
    }
}
