package conditionals;

import java.util.Scanner;

public class Conditionals4 {

	public static void main(String[] args) {
		
		// program to find the number of days in a month
		Scanner s = new Scanner(System.in);
		
		int numberOfDaysInMonth = 0;
		String NameOfMonth = "Unknown";
		
		System.out.println("please enter the month number: ");
		int month = s.nextInt();
		
		System.out.println("please enter the year: ");
		int year = s.nextInt();
		
		switch (month) {
			case 1 :
				NameOfMonth = "January";
				numberOfDaysInMonth = 31;
				break;
			
			case 2 :
				NameOfMonth = "February";
				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
					numberOfDaysInMonth = 29;
				}
				else {
					numberOfDaysInMonth = 28;	
				}
				break;
			
			case 3 :
				NameOfMonth = "March";
				numberOfDaysInMonth = 31;
				break;
			
			case 4 :
				NameOfMonth = "April";
				numberOfDaysInMonth = 30;
				break;
				
			case 5 :
				NameOfMonth = "May";
				numberOfDaysInMonth = 31;
				break;
				
			case 6:
				NameOfMonth = "June";
				numberOfDaysInMonth = 30;
				break;
				
			case 7 :
				NameOfMonth = "July";
				numberOfDaysInMonth = 31;
				break;
				
			case 8 :
				NameOfMonth = "August";
				numberOfDaysInMonth = 31;
				break;
				
			case 9 :
				NameOfMonth = "September";
				numberOfDaysInMonth = 30;
				break;
				
			case 10 :
				NameOfMonth = "October";
				numberOfDaysInMonth = 31;
				break;
				
			case 11 :
				NameOfMonth = "November";
				numberOfDaysInMonth = 30;
				break;
				
			case 12 :
				NameOfMonth = "December";
				numberOfDaysInMonth = 31;
				break;
		} 
		System.out.print(NameOfMonth + " " + year + " has " + numberOfDaysInMonth + " days\n");

	}

}
