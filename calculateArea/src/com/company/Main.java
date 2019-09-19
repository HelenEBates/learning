package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height");
        double d1 = scan.nextDouble();

        System.out.println("Enter the breadth");
        double d2 = scan.nextDouble();

        double area = (d1 * d2);
        System.out.println("The area of the parallelogram is " + area);
    }
}
