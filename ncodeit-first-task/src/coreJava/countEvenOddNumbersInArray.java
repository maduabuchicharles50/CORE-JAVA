package coreJava;

public class countEvenOddNumbersInArray {
	public static void main (String []args) {
		int array[] = {2,7,86,10,70,32,90,100,3,5};
		int n = array.length;
		int countEven = 0;
		int countOdd = 0;
		
		for (int i=0;i<n; i++) {
			if((array[i] % 2 )== 0)
				countEven += 1;
			
			else
				countOdd += 1;
		}
		System.out.println("Even numbers are : "+ countEven);
		System.out.println("Odd numbers are : "+ countOdd);
	}	
	

}
