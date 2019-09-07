package iConditionals;

import libs.Input;

public class Positive {

	public static void main(String args[])
	{
		int i = get_positive_int();
		System.out.print(i + " is a positive integer\n");
	}

	public static int get_positive_int()
	{
	    int n;
	    do
	    {
	    	System.out.print("n is ");
	        n = Input.get_int();
	    }
	    while (n < 1);
	    return n;
	}
}


