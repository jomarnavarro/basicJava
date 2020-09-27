package cVariables;

import libs.Input;

/**
 * AsignacionVariables
 */
public class AsignacionVariables {

    static String nombre;
    static int edad;
    static double salarioLibre;

    public static void main(String[] args) {
        String direccion;
        double salario;

        direccion = "Cerro Redondo 314, Col. Geometria";
        salario = 22381.54;
        salarioLibre = descontarImpuestos(salario);
        System.out.print("Como te llamas? ");
        nombre = Input.get_string();
        String iniciales = sacarIniciales(nombre);

        //imprimir los datos del usuario


    }

    public static double descontarImpuestos(double salarioBruto) {
        return salarioBruto * .7;
        
    }

    public static String sacarIniciales(String nombre) {
        String iniciales = "";
        for(String nom: nombre.split(" ")) {
            if(nom.length() != 0)
                iniciales += nom.charAt(0);
        }
            
        return iniciales;
    }
}