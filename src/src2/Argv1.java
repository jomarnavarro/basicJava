package src2;

import libs.Input;

public class Argv1 {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
	    {
	        Input.print(args[i] + "\n");
	    }

	}

}
