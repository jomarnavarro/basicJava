package lOOP.animals;

public class EjemploAnimales {

	public static void main(String[] args) {
		
		System.out.println("animal:");
		Animal animal = new Animal();
		animal.setEdad(12);
		animal.setEsMascota(false);
		animal.setNombre("Leoncio");
		animal.setTieneAlas(false);
		animal.setPuedeVolar(false);
		animal.hablar();
		animal.volar();
		animal.moverse();
		
		System.out.println("perrito:");
		
		Animal perrito = new Perro();
		perrito.setEdad(2);
		perrito.setNombre("Firulais");
		perrito.hablar();
		perrito.volar();
		perrito.moverse();
		//si se quita el comentario a la sig. line, se causa un error puesto que menearColita es
		//comportamiento de Perro, no de Animal en general.
		//perrito.menearColita();
		
		System.out.println("perrin:");
		Perro perrin = new Perro();
		perrin.setEdad(2);
		perrin.setNombre("Firulais");
		perrin.hablar();
		perrin.volar();
		perrin.moverse();
		perrin.menearColita();
		
		System.out.println("piolin:");
		Canario piolin = new Canario();
		piolin.setEdad(12);
		piolin.setNombre("Tweety");
		piolin.hablar();
		piolin.volar();
		piolin.moverse();

	}

}
