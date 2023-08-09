package swapVariable;

public class Swap {
	
	//main function
	public static void main (String []args)
	{
		int a = 2;
		int b = 4;
		
		System.out.println("before swapping, a = " +  a  + "  b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("after swapping, a = "  +  a  +  "  b = " + b);
	} 

}
