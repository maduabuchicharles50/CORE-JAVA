package conditionals;

import java.util.Scanner;

public class Conditionals3 {

	public static void main(String[] args) {
		
		/*program that keeps a number from 
		 * the user and generates  an 
		 * integer between 1 and 7 and displays
		 *  the name of the weekday*/
		Scanner s = new Scanner(System.in);
		System.out.println("please enter number: ");
		
		int day = s.nextInt();
		System.out.println(getDayName(day));

	}
	//Get the name of the week
	
	public static String getDayName(int day) {
		String dayName= "";
		switch (day) {
		case 1 : dayName = "Monday";break;
		case 2 : dayName = "Tuesday";break;
		case 3 : dayName = "Wednesday";break;
		case 4 : dayName = "Thursday";break;
		case 5 : dayName = "Friday";break;
		case 6 : dayName = "Saturday";break;
		case 7 : dayName = "Sunday";break;
		default : dayName = "Invalid day range";
		
		}
		return dayName;
		
		
	}

}
