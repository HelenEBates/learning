package com.company;


public class Main {

    public static void main(String[] args) {
        int numberOfSpaces = 15;
        int i = 50;

        String languageA = "java";
	String languageB = "python";
	String languageC = "cpp";
	//String formattedString;
      //  formattedString = String.format("My string is %.6f", languageA);
        String strLeftPad = String.format("%10s%n", languageB).replace(" ","0");
        System.out.printf(strLeftPad);
        System.out.printf("The value of i is %15d%n", i);
        System.out.printf("pad a string with zeros%n", languageA);
	System.out.printf("The language is %15s%n", languageB);

    }
}
