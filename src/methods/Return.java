package methods;

import libs.Input;

public class Return {

	public static void main(String args[])
	{
		System.out.print("x is ");
		int x = Input.get_int();
		System.out.print("x^2 is " + square(x) + "\n");
	}

	public static int square(int n)
	{
		return n * n;
	}
}



