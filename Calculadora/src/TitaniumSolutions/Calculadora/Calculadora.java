package TitaniumSolutions.Calculadora;
import TitaniumSolutions.Calcular.Calcular;

import java.util.Scanner;

public class Calculadora {

    public static void main (String[] args) {

        Calcular calculo = new Calcular();
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingresar primer dato");
        int n1 = dato.nextInt();
        System.out.println("Ingresar segundo dato");
        int n2 = dato.nextInt();

        calculo.setNum1(n1);
        calculo.setNum1(n2);

        System.out.println("SUMA");
        System.out.println(calculo.suma(n1, n2));
        System.out.println("RESTA");
        System.out.println(calculo.resta(n1, n2));
        System.out.println("MULTIPLICACION");
        System.out.println(calculo.multiplicacion(n1, n2));
        System.out.println("DIVISION" );
        System.out.println(calculo.division(n1, n2));

    }



}
