package dNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
	    int x = Input.get_int("x is: "); //esta linea hace x cosa
	    
	    // prompt user for y
	    int y = Input.get_int("y is: ");
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n");   
	}
}