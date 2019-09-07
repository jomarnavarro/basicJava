package lOOP.animals;

public class Perro extends Animal{
	
	private String raza;
	
	public Perro() {
		super();
		super.esMascota = true;
		super.edad = 0;
		super.nombre = "";
		super.tieneAlas = false;
		super.puedeVolar = false;
		
	}
	
	public void hablar() {
		System.out.println("Woof, woof");
	}
	
	public void moverse() {
		System.out.println("corre, corre");
	}
	
	public void menearColita() {
		System.out.println("Meneando la colita");
	}
	

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
	
	
	

}
