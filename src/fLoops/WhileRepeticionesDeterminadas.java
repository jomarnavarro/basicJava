package fLoops;

import libs.Input;

public class WhileRepeticionesDeterminadas {

    public static void main(String[] args) {
        int numero = 0;
        while(numero <= 10) {
            System.out.println(numero);
            numero+= 1;
        }

        int numeroSentadillas = 1;
        System.out.println("Cuantas sentadillas vas a hacer? ");
        int numeroTotal = Input.get_int();

        while(numeroSentadillas <= numeroTotal) {
            System.out.println("Sentadilla" + numeroSentadillas) ;
            numeroSentadillas++;
        }

        int posicionLiebre = 0;
        int posicionTortuga = 0;

        while(posicionTortuga < 30 && posicionLiebre < 30) {
            
            posicionTortuga++;
            if(posicionLiebre < 25) {
                posicionLiebre += 5;
                System.out.println("La Liebre va rapido, y la tortuga lento");
            } else {
                System.out.println("La Liebre ya se confio, y esta celebrando la victoria.");
            }
            System.out.println("Posicion Liebre " + posicionLiebre);
            System.out.println("Posicion Tortuga " + posicionTortuga);
        }
    }
    
}
