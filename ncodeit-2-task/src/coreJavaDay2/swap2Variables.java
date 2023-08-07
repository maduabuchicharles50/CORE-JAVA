package coreJavaDay2;

public class swap2Variables {

	public static void main(String[] args) {
		//declaring variables and assigning values
		int a,b ,temp;
		a = 3;
		b = 9;
		System.out.println("before swapping, a = " +  a  + "  b = " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("before swapping, a = " +  a  + "  b = " + b);

	}

}
