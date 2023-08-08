package conditionals;

import java.util.Scanner;

public class Conditionals1 {
	//program to get a number from a user and print whether it is positive or negative 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the number: ");
		
		int input = s.nextInt();
		
		if(input > 0) {
			System.out.println("number is positive");
		}
		else if (input < 0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is zero");
		}

	}

}
