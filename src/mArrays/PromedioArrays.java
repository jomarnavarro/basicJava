package mArrays;

public class PromedioArrays {

    public static void main(String[] args) {
        int calificaciones[] = new int[3];
        calificaciones[0] = 72;
        calificaciones[1] = 90;
        calificaciones[3] = 100;

        int promedio = ( calificaciones[0] + calificaciones[1] + calificaciones[2]) / 3;
        System.out.println("Tu promedio es: " + promedio);
    }
    
}