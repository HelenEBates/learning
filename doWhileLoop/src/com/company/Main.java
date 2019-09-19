package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int pinNumber = 1234;
	int tries = 0;

        Scanner enterPin = new Scanner(System.in);

        System.out.println("Enter your pin");
        int attempt = enterPin.nextInt();

        do {
            tries++;
        }

        while (attempt != pinNumber && tries < 3);

        {
            System.out.println("Incorrect pin number");
        }

    }
}
