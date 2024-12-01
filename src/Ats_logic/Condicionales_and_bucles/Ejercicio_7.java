package Ats_logic.Condicionales_and_bucles;/*
 A partir de las horas, calcular las semanas, días y horas equivalentes
 */

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        //Declaracion de variables 
        int horas , semanas , dias , horas_s ; 
        Scanner entrada = new Scanner(System.in);

        //solicitar los datos 
        System.out.println("favor de introducir el numero de horas:");
        horas = entrada.nextInt();


        //Conversion de horas 
        semanas = horas /168;
        dias = (horas%168) /24;
        horas_s = horas%24;

        //impresion de resultados 
        System.out.println("la cantidad de semanas ,dias y horas fue :"+semanas+"semanas"+dias +"dias "+horas_s+"horas ");
        entrada.close();
    }
}
