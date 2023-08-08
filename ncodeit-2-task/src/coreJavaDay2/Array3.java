package coreJavaDay2;

public class Array3 {
	
	public static int getSecondLargest(int[] a, int total) {
		int temp;
		for (int i = 0;i<total;i++) {
			for (int j=i+1;j<total;j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
				
			}
		}
		return a[total- 2];
	}

	public static void main(String[] args) {
		// program to find the second largest number in an array
		int a[] = {1,2,3,4,5,6,7};
		int b[] = {56,47,28,19,29,10};
		System.out.println("second largest: "+getSecondLargest(a, 7));
		System.out.println("second largest: "+getSecondLargest(b, 6));
	}	

}
