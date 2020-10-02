package mArrays;

public class NumeroMaximoArrays {

    public static void main(String[] args) {
        //arreglo de numeros
        int nums[] = {0, 2, 4, 6, 8, 9, 7, 5, 3, 1};

        //cual es el numero mas grande del arreglo
        int maximo = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maximo) {
                maximo = nums[i];
            }
        }

        //crea otro programa que encuentre el minimo
        

    }
    
}
