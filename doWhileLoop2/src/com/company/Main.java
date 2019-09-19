package com.company;

public class Main {

    public static void main(String[] args) {
	int counter = 1;
	do {
	    System.out.println(counter);

	    if(counter % 7 == 0) {
	        System.out.println("multiple of 7 encountered now quitting");
	        break;
        }
	    counter++;
    } while (counter <= 10);
    }
}
