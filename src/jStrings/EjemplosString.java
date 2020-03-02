package jStrings;

import libs.Input;

public class EjemplosString {

	public static void main(String[] args) {
		String s = "Mi herramienta favorita es Selenium";
		Input.print("La frase " + s + " tiene " + s.length() + " caracteres.\n");

		int numeroCaracteres = s.length();
		for(int i = 0; i < numeroCaracteres; i++) {
			Input.print("El caracter numero " + i +" de la frase " + s + " es " + s.charAt(i) + "\n");
		}

		
		Input.print("La frase '" + s + "' contiene 'Selenium'? " + s.contains("Selenium") + "\n");
		Input.print("La frase '" + s + "' comienza con 'Selenium'? " + s.startsWith("Selenium") + "\n");
		Input.print("La frase '" + s + "' comienza con 'Selenium'? " + s.endsWith("Selenium") + "\n");

		String b = "boo:and:foo";
		Input.print(b.split(":"));
		
		String c = "   Hola    ";
		Input.print(c + "\n");
		Input.print(c.trim() + "\n");
		
		Input.print("Input your name: ");
		String nombre = Input.get_string();
		Input.print(nombre + "\n");
		String name = "Pedro Perez";
		name.length();
		name.contains("Pedro");
		name.startsWith("Pedro");
		name.endsWith("Perez");
		name.split(" ");


	}

}
