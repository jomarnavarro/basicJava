package dojo;

import libs.Input;

public class MarioDojo {

	public static void main(String[] args) {
//		pedir  altura y almacenar el valor
		System.out.print("Altura: ");
		int altura = Input.get_int();
//		asegurarr que el valor es positivo mayor que  1
		if(altura > 1) {
			dibujarPiramide(altura);
		} else {
			System.exit(-1);;
		}

//
//


	}

	public static void dibujarPiramide(int altura) {
		for(int renglon = 1; renglon <= altura; renglon++) {
			dibujarEspacios(renglon, altura);
			dibujarGatos(renglon, altura);
	
		
		
		//comoo determinar cuantos gatos hay
			//numero de gatos es =renglon+ 1 
			}
		
	}

	private static void dibujarEspacios(int renglon, int altura) {
		int numEspacios = altura - renglon;
		for (int i=0 ; i < numEspacios ; i++)
			System.out.print(" ");
		
	}

	private static void dibujarGatos(int renglon, int altura) {
		for (int i=0 ; i<renglon+ 1 ; i++)
			System.out.print("#");
		
		System.out.println();
		
	}
	
}
