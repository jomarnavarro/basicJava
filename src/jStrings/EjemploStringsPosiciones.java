package jStrings;

public class EjemploStringsPosiciones {

    public static void main(String[] args) {
        String nombre = "Jesus Pedro Edder Arenas Marquez";
        System.out.println(nombre);

        String saludo = "Hola";
        int posicion = 0;
        int numLetras = 4;

        //como se si la pabra del saludo, tiene la letra u
        while(posicion < numLetras) {
            char letraActual = saludo.charAt(posicion);
            if(letraActual == 'l') {
                System.out.println("La palabra " + saludo + " si tiene la letra 'l'");
                break;
            }
            System.out.println(saludo.charAt(posicion));
            posicion++;
        }
    }
    
}
