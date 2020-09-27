package fLoops;

import java.util.Random;

import libs.Input;

public class WhileRepeticionesDesconocidas {

    public static void main(String[] args) {
        // System.out.println("Indique el numero de sentadillas");
        // int numeroSentadillas = Input.get_int();

        // int contador = 0;
        // while(contador < numeroSentadillas) {
        //     System.out.println("Sentadilla numero " + (contador + 1));
        //     contador++;
        // }

        int numeroSecreto = new Random().nextInt(11);
        int numeroUsuario = Input.get_int("Indique el numero secreto entre 0 y 10: ");

            //for(; condicion ;) {
                //instrucciones
                //instrucciones
            //}
        for(;numeroUsuario != numeroSecreto;) {
            if(numeroUsuario < 0 || numeroUsuario > 10) {
                System.out.println("Error.  el numero debe ser entre 0 y 10.");
                System.out.println("Indique el numero secreto entre 0 y 10: ");
                numeroUsuario = Input.get_int();
            } else {
                System.out.println("No atinaste el numero.");
                System.out.println("Intentalo de nuevo, con un numero entre 0 y 10: ");
                numeroUsuario = Input.get_int();
            }
        }
        System.out.println("Felicitaciones. Adivinaste el numero");
    }
    
}
