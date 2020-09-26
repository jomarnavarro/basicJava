package jStrings;

import libs.Input;
import java.util.Random;
public class Juego {

    public static void main(String[] args) {
        String[] palabras = {"Hola", "mundo", "for", "while", "int", "String"};
        int numeroSecreto = new Random().nextInt(palabras.length);
        String palabraSecreta = palabras[numeroSecreto];
        int numeroIntentos = 0;
        int numeroLetrasAcertadas = 0; 
        while(true) {
            System.out.println("Ingrese una letra");
            char letraUsuario = Input.get_char();
            numeroIntentos++;
            for(int i = 0; i < palabraSecreta.length(); i++) {
                char letraActual = palabraSecreta.charAt(i);
                
                if(letraUsuario == letraActual) {
                    System.out.println("La palabra secreta contiene la letra " + letraActual);
                    numeroLetrasAcertadas++;
                    break;
                }
                
            }
            if(numeroLetrasAcertadas == palabraSecreta.length()) {
                break;
            }
        }
    }
    
}

// Ingrese una letra
// w
// La palabra secreta contiene la letra w
// w****
// Ingrese una letra
// i
// La palabra secreta contiene la letra i
// w*i**
// Ingrese una letra
// h
// La palabra secreta contiene la letra h
// whi**