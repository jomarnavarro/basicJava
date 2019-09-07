package lOOP.cars;

import libs.Input;

public class Automovil {
	//Atributos
	
	String marca;
	double velocidadActual;
	double maximaVelocidad;
	String tipoDeTransmision;
	int numDePuertas;
	int numDeLlantas;
	
	Automovil() {
		marca = "Ford";
		velocidadActual = 0.0;
		maximaVelocidad = 200.0;
		tipoDeTransmision = "Manual";
		numDePuertas = 2;
		numDeLlantas = 4;
	}
	
	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
	}
	//comportamiento
	public void acelerar() {
		Input.print("run run\n");
	}
	
	public void frenar() {
		Input.print("Screeeeech!\n");
	}
	
	public void retroceder() {
		Input.print("piii piii piii piii\n");
	}
	
	public double getVelocidad() {
		return velocidadActual;
		
	}
	
	public void setVelocidad(double vel) {
		this.velocidadActual = vel;
	}
	

}
