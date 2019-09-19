package com.company;

import java.util.Scanner;



    public class Main {

        public static void main(String[] args) {

                System.out.println("Enter a number");
                Scanner input = new Scanner(System.in);
                int number = input.nextInt();

                if (isOdd(number)) {
                    System.out.println("Weird");
                }
                else
                    System.out.println("Not Weird");

            }

        private static boolean isOdd(int number) {
            return (number % 2 == 0);
        }
    }

