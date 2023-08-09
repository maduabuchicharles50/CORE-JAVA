package coreJava;

import java.util.Scanner;

public class greatestNumber {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = scan.nextInt();
		
		System.out.println("Enter the third number: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2)
			if(num1 > num3)
				System.out.println("the greatest is: "+num1);
		
		if (num2 > num1)
			if(num2 > num3)
				System.out.println("the greatest is: "+num2);
		
		if (num3 > num1)
			if(num3 > num2)
				System.out.println("the greatest is: "+num3);
		
		
		
	}

}
