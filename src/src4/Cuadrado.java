package repasoJava;

public class Cuadrado {
	
	private int area;
	private int perimetro;
	
	public Cuadrado(int lado) {
		this.setArea(lado);
		this.setPerimetro(lado);
	}
	public int getArea() {
		return area;
	}
	private void setArea(int lado) {
		this.area = lado * lado;
	}
	public int getPerimetro() {
		return perimetro;
	}
	private void setPerimetro(int lado) {
		this.perimetro = 4 * lado;
	}
	
	public String toString() {
		return "[ Area: " + this.getArea() + ", Perimetro: " + this.getPerimetro() + "]";
	}
	
	

}
