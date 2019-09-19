package com.company;

public class Main {

    public static void main(String[] args) {
	double x = 3.0d;
	double dinner = 2.25d;
	double yearCost;
	int weekDays = 5;
	int schoolHolidays = 13;
	int annualWeeks = 52;

	//SquareInt.printSquare(x);
	WeeklyCost.WeeklyDinnerCost(dinner, weekDays);
	YearlyCost.YearlyDinnerCost(annualWeeks, schoolHolidays);


    }
}
