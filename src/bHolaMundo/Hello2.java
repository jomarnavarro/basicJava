package bHolaMundo;

import libs.Input;

public class Hello2 {

	public static void main(String args[])
	{
		String name = Input.get_string("Como te llamas? ");
		System.out.println("hola, "+ name );
	}
}