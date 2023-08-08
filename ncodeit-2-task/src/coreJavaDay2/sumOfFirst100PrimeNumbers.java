package coreJavaDay2;

public class sumOfFirst100PrimeNumbers {

	public static void main(String[] args) {
		int sum = 1;
		int count = 0;
		int num = 0;
		
		while(count < 100) {
			num++;
			if(num%2 !=0) {
				//checking for even number
				if (isPrime(num)) {
					sum += num;
					count++;
					
				}
			
			}
		}
		System.out.println("\nSum of first 100 prime numbers is: "+sum);
	}
	public static boolean isPrime(int num) {
		for (int i = 3;i*i <=num;i+=2) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	
	}

}
