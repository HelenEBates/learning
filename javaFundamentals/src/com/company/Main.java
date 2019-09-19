package com.company;

public class Main {

    public static void main(String[] args) {
	int weeksOfTerm = 39;
	int schoolHols = 13;
	double dinnerMoney = 2.25;
	int dinnerAmount = (int) dinnerMoney;

	double accountBalance = 14.50;
	double moneyDue = dinnerMoney * 5;
	boolean inCredit = moneyDue < accountBalance ? true : false;


      //  System.out.println((dinnerAmount * 5) * weeksOfTerm);
        System.out.println(inCredit);


    }
}
