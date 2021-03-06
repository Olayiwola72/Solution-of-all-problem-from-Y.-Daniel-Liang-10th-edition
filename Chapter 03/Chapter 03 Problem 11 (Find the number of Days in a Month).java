


/**
 * Chapter 03 Problem 3.11 (Find the number of days in a month).
 * 
 * Write a program that prompts the user to enter the month and year 
 * and displays the number of days in the month. For
 * 
 * Example, if the user entered month 2 and year 2012, the program should display that February 2012 had 29 days. 
 * If the user entered month 3 and year 2015, the  program should display that March 2015 had 31 days.
 * 
 */

import java.util.Scanner;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a month number [1-12]: ");
		int month = input.nextInt();
		System.out.print("Enter a year [e.g. 2016]: ");
		int year = input.nextInt();
		int days = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else if (month == 2) {
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				days = 29;
			} else {
				days = 28;
			}
		}
		System.out.println("There are " + days + " days.");
	}
}