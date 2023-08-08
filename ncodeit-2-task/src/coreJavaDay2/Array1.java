package coreJavaDay2;

public class Array1 {

	public static void main(String[] args) {
		int[] array = {65,78,6,90,34,12,65,40};
		int max = array[0];
		
		int min = array[0];
		
		for(int i =1;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("maximum value is: "+max);
		System.out.println("minimum value is: "+min);
	}
}
