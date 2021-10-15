package kMethods;

import libs.Input;

public class Return {

	public static void main(String args[])
	{.      
		System.out.print("x is ");
		int x = Input.get_int();

                 //calling method inside print block

		System.out.print("x^2 is " + square(x) + "\n");
	}
              //function which perform actual square

	public static int square(int n)
	{
		return n * n;
	}
}



