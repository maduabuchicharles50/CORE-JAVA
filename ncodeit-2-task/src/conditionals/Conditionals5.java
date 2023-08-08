package conditionals;

import java.util.Scanner;

public class Conditionals5 {

	public static void main(String[] args) {
		/*program that takes the user input and provides
		 * a single character from the alphabet.
		 * print vowel of consonants,depending on the user
		 *  input. if the user input is not a letter (between a and z or 
		 *  A and Z),or is a string of length > 1,print
		 *  an error message
		 *  */
		Scanner s = new Scanner(System.in);
		System.out.println("please input alphabet: ");
		String input = s.next().toLowerCase();
		
		boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
		boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
		boolean vowels = input.equals("a") || input.equals("e") ||input.equals("i")|| input.equals("o") || input.equals("u");
		
		if(input.length() > 1) {
			System.out.println("Error. Not a single character.");
		}
		else if (!(uppercase || lowercase)) {
			System.out.println("Error . Not a letter . Enter uppercase or lowercase letter.");		
		}
		else if (vowels) {
			System.out.println("Input letter is vowel");
		}
		else {
			System.out.println("Input letter is Consonant");
		}
	}

}
