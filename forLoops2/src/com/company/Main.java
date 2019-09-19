package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " multiplied by " + j + " = " + i * j);
        }
    }
}
