package numericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is ");
	    float x = Input.get_float();
	    
	    // prompt user for y
	    System.out.print("y is ");
	    float y = Input.get_float();
	    
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n");
	}
}


