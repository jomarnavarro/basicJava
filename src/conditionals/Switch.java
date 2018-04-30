package conditionals;

import libs.Input;

public class Switch {

public static void main(String args[])
{
	char c = Input.get_char();
	switch (c)
	{
	case 'Y':
	case 'y':
		System.out.print("yes\n");
		break;
	case 'N':
	case 'n':
		System.out.print("no\n");
		break;
	default:
		System.out.print("error\n");
		break;
	}
}
}




