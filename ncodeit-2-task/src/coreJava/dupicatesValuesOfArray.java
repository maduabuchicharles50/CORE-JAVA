package coreJava;

public class dupicatesValuesOfArray {

	public static void main(String[] args) {
		int[] array1 = {8,8,6,5,4,3,2,7,7};
		for (int i = 0; i< array1.length - 1; i++) {
			
			for(int j = i+1; j < array1.length; j++) {
				
				if((array1[i] == array1[j]) && (i != j)) {
					System.out.println("Duplicate Element : "+ array1[j]);
				}
					
			}
			
		}
		
		
	}	

}
