package dNumericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[])
	{
		// prompt user for x
	    float x = Input.get_float("x is: ");
	    
	    // prompt user for y
	    float y = Input.get_float("y is: ");
	    
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n");
	}
}


