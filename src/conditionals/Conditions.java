package conditionals;

import libs.Input;

public class Conditions {

	public static void main(String args[])
	{
		int i = Input.get_int();
		if (i < 0)
		{
			System.out.print("negative\n");
		}
		else if (i > 0)
		{
			System.out.print("positive\n");
		}
		else
		{
			System.out.print("zero\n");
		}
	}
}
