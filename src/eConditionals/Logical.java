package eConditionals;

import libs.Input;

public class Logical {

	public static void main(String args[])
	{
		char c = Input.get_char("Sabes programar en Java? ");
	    if (c == 'Y' || c == 'y')
	    {
	    	System.out.print("yes\n");
	    }
	    else if (c == 'N' || c == 'n')
	    {
	    	System.out.print("no\n");
	    }
	    else
	    {
	    	System.out.print("error\n");
	    }
	}
}



