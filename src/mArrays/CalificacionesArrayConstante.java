package mArrays;

import libs.Input;

public class CalificacionesArrayConstante {

    static int NUM_CALIFICACIONES = 5;
    public static void main(String[] args) {
        int calificaciones[] = new int[NUM_CALIFICACIONES];
        
        //repetir 5 veces
        for(int i = 0; i < NUM_CALIFICACIONES; i++) {
            calificaciones[i] = Input.get_positive_int("Calificacion " + i + ": ");
        }

        int sum = 0;
        for(int i = 0; i < NUM_CALIFICACIONES; i++) {
            sum += calificaciones[i];
        }


        int promedio = ( sum / NUM_CALIFICACIONES);
        System.out.println("Tu promedio es: " + promedio);
    }
    
}
