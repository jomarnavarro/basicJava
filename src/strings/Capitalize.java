package strings;

import libs.Input;

public class Capitalize {

	public static void main(String[] args) {
		Input.print("Cual es tu nombre? ");
		String s = Input.get_string();
	    if (s != null)
	    {
	        for (int i = 0, n = s.length(); i < n; i++)
	        {
	            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
	            {
	                Input.print((char) (s.charAt(i) - ('a' - 'A')));
	            }
	            else
	            {
	                Input.print(s.charAt(i));
	            }
	        }
	        Input.print("\n");
	    }
	}

}
