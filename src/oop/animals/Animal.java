package oop.animals;

public class Animal {
	 boolean esMascota;
	 int edad;
	 boolean tieneAlas;
	 boolean puedeVolar;
	 String nombre;
	
	public void volar() {
		if(tieneAlas && puedeVolar)
			System.out.println("Puedo volaaaar!");
		else if(tieneAlas && !puedeVolar) 
			System.out.println("Tengo alas, pero no puedo volar!");
		else 
			System.out.println("No puedo volar!");
	}
	
	public void hablar() {
		System.out.println("Mmmmh!");
	}
	
	public void moverse() {
		System.out.println("Me muevo!");
	}
	
	public boolean isEsMascota() {
		return esMascota;
	}
	public void setEsMascota(boolean esMascota) {
		this.esMascota = esMascota;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isTieneAlas() {
		return tieneAlas;
	}
	public void setTieneAlas(boolean tieneAlas) {
		this.tieneAlas = tieneAlas;
	}
	public boolean isPuedeVolar() {
		return puedeVolar;
	}
	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
