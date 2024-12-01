package Ats_logic.Condicionales_and_bucles;/*
Ejercicio 4: Una compañia de ventas de carros usados,
paga a su personal de ventas un salario de $1000 mensuales, 
mas una comisión de $150 por cada carro vendido, 
más el 5% del valor de la venta por carro. 
Cada mes el capturista de la empresa ingresa en la computadora los 
datos pertinentes. Hacer un programa que 
calcule e imprima el salario mensual de un vendedor dado.  */

import java.util.Scanner;

public class Ejercicio_4{
    public static void main(String[] args) {
        // Declaracion de variables 
        double carros_v,comision_venta,total;
        Scanner entrada = new Scanner(System.in);

        //Solicitar valores 
        System.out.println("Favor de colocar cuantos carros vendio :");
        carros_v = entrada.nextDouble();

        //determinar sueldo de la persona 
        comision_venta = ((1000*carros_v)+(150*carros_v))*(.5);
        total = (1000*carros_v)+(150*carros_v)+(comision_venta); 

        //imprimir resultado 
        System.out.println("el sueldo del empleado es :"+ total);
        entrada.close();

    }
}