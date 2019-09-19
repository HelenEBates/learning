package com.company;

public class Transactions {
    public double balance;
    public double moneyIn = 500.00d;
    public double moneyOut;

    public double startBalance;
    public double endBalance;
    public double overdraftLimit;
    public double interestRate = 0.10d;
    public double interestPaid = interestRate * endBalance;

    public char transactionCode;
    public boolean authorised;

    //public double dailyIn;
    //public double dailyOut;
    public char transCode;
    //public double endOfDay;

    public void execute() {

        switch (transactionCode) {

            case 'c':
                endBalance = startBalance + moneyIn;
                break;

            case 'd':
                endBalance = startBalance - moneyOut;
                break;

            case 'i':
                endBalance = endBalance + (endBalance * interestRate);
                break;

           /* case 'm':
                endOfDay = dailyIn * dailyOut;
                break; */

            default:
                System.out.println("Transaction code not recognised");
                endBalance = 0.0d;
                break;

        }

    }
}
