package dNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		int x = Input.get_int("x is: ");
	    
	    // prompt user for y
	    int y = Input.get_int("y is: ");
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n");
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n");
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n");
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n");
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n");
	}
}


