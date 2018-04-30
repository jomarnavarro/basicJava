package strings;

import libs.Input;

public class EjemplosString {

	public static void main(String[] args) {
		String s = "Selenium";
		Input.print("La palabra " + s + " tiene " + s.length() + " caracteres.\n");
		
		Input.print("El primer caracter de la palabra " + s + " es " + s.charAt(0) + "\n");
		
		Input.print("La palabra " + s + " contiene 'nium'?" + s.contains("nium") + "\n");
		
		String b = "boo:and:foo";
		Input.print(b.split(":"));
		
		String c = "   Hola    ";
		Input.print(c + "\n");
		Input.print(c.trim() + "\n");
		
		Input.print("Input your name: ");
		String nombre = Input.get_string();
		Input.print(nombre + "\n");

	}

}
