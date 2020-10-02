package mArrays;

public class OrdenamientoBasico {
    public static void main(String[] args) {
        //arreglo de numeros
        int nums[] = {0, 2, 4, 6, 8, 9, 7, 5, 3, 1};


        //arreglo de numeros para ordenar
        int ordenado[] = new int[nums.length];

        //cual es el numero mas grande del arreglo?
        int maximo = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maximo) {
                maximo = nums[i];
            }
        }

        //cada iteracion, encontrar el numero mas pequeno, y ponerlo en el arreglo ordenado.  
        //substituir el numero mas pequeno de la iteracion por el numero maximo
        for(int i = 0; i < nums.length; i++) {
            int minimo = getMinimo(nums, maximo);
            ordenado[i] = minimo;
        }
        System.out.println(ordenado);
    }

    public static int getMinimo(int[] desordenado, int maximo) {
        //recorrer todo el arreglo y buscar el numero mas chico
        int minimo = maximo;
        for(int j = 0; j < desordenado.length; j++) {
            if(desordenado[j] < minimo) {
                minimo = desordenado[j];
            }
        }

        //encontrar el numero minimo y sustituirlo por maximo
        for(int j = 0; j < desordenado.length; j++) {
            if(desordenado[j] == minimo) {
                desordenado[j] = maximo;
                break;
            }
        }
        return minimo;
    }
    
}
