package dNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		float f = Input.get_float("Dame un numero decimal: ");
		
		float f2 = Input.get_float("Dame un numero decimal: ");
		
		Input.print("f/f2 = " + (f/f2));

	}

}
