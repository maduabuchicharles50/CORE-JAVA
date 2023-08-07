package coreJava;

import java.util.Arrays;

public class reverseArrayOfInteger {

	public static void main(String[] args) {
		int[] array1 = {567,87,21,90,43,23,676,89,231};
		System.out.println("Original array: "+Arrays.toString(array1));
		for (int i = 0; i < array1.length / 2; i++ ) {
			int temp = array1[i];
			array1[i] = array1[array1.length - i - 1];
			temp = array1[array1.length - i - 1];
			
		}
		System.out.println("Reverse array: " +Arrays.toString(array1));
		
	}
}
