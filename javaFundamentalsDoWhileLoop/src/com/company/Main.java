package com.company;

public class Main {

    public static void main(String[] args) {
	int inVal = 20;
	do {
	    System.out.print(inVal);
	    System.out.print(" * 2 = ");
	    inVal *= 2;
	    System.out.println(inVal);
    } while (inVal < 100);
    }
}
