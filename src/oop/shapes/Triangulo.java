package oop.shapes;

public class Triangulo {
	
	//propiedades o campos
	int base;
	int altura;
	
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//metodos o comportamiento
	public int sacarArea() {
		int area= (this.base*this.altura)/2;
		return area;
	}
	public int sacarPerimetro() {
		int perimetro= this.base*3;
	    return perimetro;	
	}
	
	public String toString() {
		return "Base es " + this.base + " Altura es "+ this.altura;
	}

}
