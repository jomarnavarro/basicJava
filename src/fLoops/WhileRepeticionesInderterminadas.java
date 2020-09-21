package fLoops;

public class WhileRepeticionesInderterminadas {
    

    public static void main(String[] args) {
        int posicionLiebre = 1;
        int posicionTortuga = 5;

        while(posicionLiebre != posicionTortuga) {
            System.out.println("Posicion Liebre " + posicionLiebre);
            System.out.println("Posicion Tortuga " + posicionTortuga);

            if(posicionLiebre < posicionTortuga) {
                posicionLiebre *= 3;
            } else {
                posicionTortuga++;
            }
        }
        System.out.println("Posicion Liebre " + posicionLiebre);
        System.out.println("Posicion Tortuga " + posicionTortuga);
    }
}
