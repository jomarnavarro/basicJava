package fLoops;

public class PiramideNumeros {

    public static void main(String[] args) {
        int numeroRenglones = 10;

        
        for(int numRenglonActual = 1;numRenglonActual <= numeroRenglones; numRenglonActual++) {
            //imprimir renglon por renglon.

            //while para imprimir del numero 1 al numero maximo del renglon
            int numeroMaximo = numRenglonActual;
            
            for(int contador = 1;contador <= numeroMaximo; contador++) {
                System.out.print(contador);
            }
            System.out.println();
    
        }
    }
    
}
