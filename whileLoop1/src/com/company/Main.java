package com.company;

public class Main {

    public static void main(String[] args) {
	int count = 7;
	int num1 = 0;
	int num2 = 1;
	System.out.println("Fibonacci series of " + count + " numbers");

	int i = 1;
	while (i < count)
    {
        System.out.println(num1 + " ");
        int SumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = SumOfPrevTwo;
        i++;
    }
    }
}
