package mArrays;

public class CopiarArreglos {
    public static void main(String[] args) {
    
        //arreglo de numeros
        int nums[] = {0, 2, 4, 6, 8, 9, 7, 5, 3, 1};
        
        //arreglo 2
        int longitud = nums.length;
        int nums2[] = new int[longitud];

        for(int i = 0; i < longitud; i++) {
            nums2[i] = nums[i];
        }   
        
    }
    
}
