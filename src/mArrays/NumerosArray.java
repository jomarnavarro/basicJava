package mArrays;

public class NumerosArray {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        numeros[0] = 1;
        numeros[1] = 4;

        int nums[] = {0, 2, 4, 6, 8, 9, 7, 5, 3, 1};

        //esta el numero 4 en el arreglo?
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 4) {
                System.out.println("el numero 4 esta en la posicion " + i);
            }
        }
    }
    
}
