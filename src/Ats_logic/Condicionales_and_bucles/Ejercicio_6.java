package Ats_logic.Condicionales_and_bucles;/*
  Determinar el cuadrado de una suma
  Hacer un programa que calcule el cuadrado de una suma
 (a+b)2 = a2 + b2 + 2ab
 */

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        //Declaracion de variables 
        int a,b,total;
        Scanner entrada = new Scanner(System.in);

        // ingreso de datos 
        System.out.println("favor de ingresar los coeficientes respectivamente :");
        a = entrada.nextInt();
        b = entrada.nextInt();

        //determinar el binomio 
        total = (a*a)+(b*b)+(2*a*b);

        //imprimir los resultados 
        System.out.println("el resultado de la operacion es : " + total);
        entrada.close();

    }
}
