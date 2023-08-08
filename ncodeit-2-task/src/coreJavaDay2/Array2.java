package coreJavaDay2;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// program to reverse an array of integer values
		
		int[] array = {675,89,32,90,753,123,84,56};
		System.out.println("original array: "+Arrays.toString(array));
		
		for(int i= 0; i< array.length/2; i++) {
			int temp = array[i];
			
			array[i] = array[array.length -i -1];
			array[array.length -i -1] = temp;
			
		}
		System.out.println("reversed array: "+Arrays.toString(array));
	}	
		

}
