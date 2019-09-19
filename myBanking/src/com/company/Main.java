package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    //property
    customerDetails Customer1 = new customerDetails();

    //constructor
    public Main() {
    }

    //operation
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("E d MMMM yyyy HH:mm");
        Date dateObject = new Date();
        Date dateObject1 = new Date();

        Example example = new Example("Helen");
        //example.setName("Helen");
        example.outputName();

        System.out.println("Welcome to your banking app");
        System.out.println(df.format(dateObject));

        customerDetails customerOne = new customerDetails();
        customerOne.title = "Mrs";
        customerOne.firstName = "Peppa";
        customerOne.lastName = "Pig";

        System.out.println(customerOne.title + " " + customerOne.firstName + " " + customerOne.lastName);


        Transactions[] payBills = new Transactions[1];

        payBills[0] = create(0.00d, 100.00d, 100.00d, 0.00d, 'c');
        //MathEquation[] equations = new MathEquation[4];
        //equations[0] = create(100.0d, 50.0d, 'd');

        readInaFile.read();

    }

    //operation
    public static Transactions create(double startBalance, double endBalance, double moneyIn, double moneyOut, char transactionCode) {
        Transactions payBills = new Transactions();
        payBills.startBalance = startBalance;
        payBills.endBalance = endBalance;
        payBills.moneyIn = moneyIn;
        payBills.moneyOut = moneyOut;
        payBills.transactionCode = transactionCode;

        return payBills;

           // System.out.println(payBills); how can I make it print payBills?

        }

}



