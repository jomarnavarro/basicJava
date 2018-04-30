package numericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		float f = Input.get_float();
		
		float f2 = Input.get_float();
		
		Input.print("f/f2 = " + (f/f2));

	}

}
