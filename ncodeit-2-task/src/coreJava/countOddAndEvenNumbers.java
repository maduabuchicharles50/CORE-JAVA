package coreJava;

public class countOddAndEvenNumbers {

	public static void main(String[] args) {
		int array[] = {7,4,9,814,15,60,15,30,58};
		int n = array.length;
		int countEven = 0;
		int countOdd = 0;
		
		for (int i = 0;i < n; i++) {
		
		if((array[i] % 2) == 0 ) 
			countEven += 1;
			
			else
				countOdd += 1;
		
		}
			
		
		System.out.println("Even numbers are: "+ countEven);
		System.out.println("Odd numbers are: "+ countOdd);
		
		
	
	}

}
