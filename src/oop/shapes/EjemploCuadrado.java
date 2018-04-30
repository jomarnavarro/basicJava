package oop.shapes;

import libs.Input;

public class EjemploCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(3);
		System.out.println("c1: " + c1);
		
		//este cuadrado es demasiado grande para sacar su area.  
		Cuadrado c2 = new Cuadrado(130000000);
		System.out.println("c2: " + c2);
		Input.print(Integer.MAX_VALUE);

	}

}
