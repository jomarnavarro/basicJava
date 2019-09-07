package jStrings;

import libs.Input;

public class Capitalize1 {

	public static void main(String[] args) {
		Input.print("Cual es tu nombre? ");
		String s = Input.get_string();
	    if (s != null)
	    {
	        for (int i = 0, n = s.length(); i < n; i++)
	        {
	        	Input.print(Character.toUpperCase(s.charAt(i)));
	        }
	        Input.print("\n");
	    }

	}

}
