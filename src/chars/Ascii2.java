package chars;

import libs.Input;

public class Ascii2 {

	public static void main(String[] args) {
		for (char c = 'A'; c <= 'Z'; c++)
	    {
	        Input.print(c + " is " + (int) c + "\n" );
	    }

	}

}
