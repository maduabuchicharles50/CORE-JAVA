package conditionals;

import java.util.Scanner;

public class Conditionals2 {

	public static void main(String[] args) {
		//take three numbers from the user and print the greatest number
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("please enter the first number: ");
		int num1 = s.nextInt();
		
		System.out.println("please enter the second number: ");
		int num2 = s.nextInt();
		
		System.out.println("please enter the third number: ");
		int num3 = s.nextInt();
		
		if (num1 > num2)
			if (num1 > num3)
				System.out.println("the greatest is: "+num1);
		
		if (num2 > num1)
			if (num2 > num3)
				System.out.println("the greatest is: "+num2);
		
		if (num3 > num2)
			if (num3 > num1)
				System.out.println("the greatest is: "+num3);
		
	}

}
