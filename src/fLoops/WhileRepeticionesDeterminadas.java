package fLoops;

import libs.Input;

public class WhileRepeticionesDeterminadas {

    public static void main(String[] args) throws InterruptedException {
        int numero = 0;
        while(numero <= 10) {
            System.out.println(numero);
            numero+= 1;
        }

        int numeroSentadillas = 1;
        int numeroTotal = Input.get_int("Cuantas sentadillas vas a hacer? ");

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
                //System.out.println("La Liebre va rapido, y la tortuga lento");
            } else {
                //System.out.println("La Liebre ya se confio, y esta celebrando la victoria.");
            }
            printPosicion(posicionLiebre, 'L');
            printPosicion(posicionTortuga, 'T');
        }
    }

    public static void printPosicion(int posicion, char inicial) throws InterruptedException {
        Input.print(0);
        for(int i = 0; i < posicion - 2; i++)
            Input.print(" ");
        Input.print(inicial);
        for(int i = 0; i < 29 - posicion; i++)    
            Input.print(" ");
        Input.print(30);
        System.out.println();
        Thread.sleep(1000);
    }
    
}
