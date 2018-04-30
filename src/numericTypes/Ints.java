package numericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is ");
	    int x = Input.get_int();
	    
	    // prompt user for y
	    System.out.print("y is ");
	    int y = Input.get_int();
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n");
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n");
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n");
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n");
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n");
	}
}


