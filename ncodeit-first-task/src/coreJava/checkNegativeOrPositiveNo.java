package coreJava;

import java.util.Scanner;

public class checkNegativeOrPositiveNo {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number: ");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("the number you entered is positive");
		}
		else if (num<0) {
			System.out.println("the number you entered is negative");
		}
		else {
			System.out.println("the number is zero");
		}
	}

}
