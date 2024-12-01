package Ats_logic.Condicionales_and_bucles;/*Ejercicio 3:
Guillermo tiene N dolares
Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.*/

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        //declaracion de variables
        int guillermo_dinero,luis_dinero,juan_dinero;
        int total; 
        Scanner entrada = new Scanner(System.in);


        //entrada de datos
        System.out.println("Digite porfavor cual es el dinero de Guillermo :"); 
        guillermo_dinero = entrada.nextInt();

        //determinar dinero de c/u
        luis_dinero = guillermo_dinero/2;
        juan_dinero = (luis_dinero + guillermo_dinero)/2;
        total = guillermo_dinero + luis_dinero + juan_dinero;
        
        //imprimir resultado : 
        System.out.println("El dinero de los 3 juntos es : "+ total);
        entrada.close();

    }
}
