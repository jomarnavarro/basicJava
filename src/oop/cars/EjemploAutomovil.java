package oop.cars;

public class EjemploAutomovil {

	public static void main(String[] args) {
		Automovil a1 = new Automovil();
		a1.acelerar();
		a1.frenar();
		a1.retroceder();

		Automovil a2 = new Automovil("Chrysler", 250.0, "Automatico", 5, 4);
		a2.acelerar();
		a2.frenar();
		a2.retroceder();
	}

}
