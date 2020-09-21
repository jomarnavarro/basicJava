package eConditionals;

import libs.Input;

public class Conditionals1 {

    public static void main(String[] args) {
        //solo if
        double litrosLeche = 0.5;
        if(litrosLeche < 1) {
            System.out.println("Agrega dos litros de leche a la lista del super");
        }

        //if + else        
        int edad = 17;
        if(edad >= 18) {
            System.out.println("Puedes beber licor");
        } else {
            System.out.println("Toma refresco o jugo");
        }

        //if - else if - else
        System.out.println("Cuanto ganas? ");
        double salario = Input.get_double();
        if(salario < 0) {
            System.out.println("Debes ingresar una cantidad mayor que cero");
        } else if(salario < 500) {
            System.out.println("Ganas muy poco.");
        } else if(salario >= 500 && salario < 2000) {
            System.out.println("Ganas bien");
        } else {
            System.out.println("Tu salario es excelente");
        }
    }
    
}
