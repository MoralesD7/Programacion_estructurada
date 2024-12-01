package Ats_logic.e_array;//Ejercicio 7: Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados.

import java.util.Scanner;

public class E_array_6 {
    public static void main(String [] args){

        // Declaración de variables
        boolean creciente = false, decreciente = false;
        Scanner entrada = new Scanner(System.in);
        int[] a_rray_1 = new int[10];

        // Pedir los datos del arreglo
        for(int i = 0; i < 10; i++) {
            System.out.println("Digite elemento " + (i + 1));
            a_rray_1[i] = entrada.nextInt();
        }

        // Comparar los valores para determinar el orden
        for(int i = 0; i < 9; i++) {
            if(a_rray_1[i] < a_rray_1[i + 1]) {
                creciente = true;  // Se encontró una secuencia creciente
            } else if (a_rray_1[i] > a_rray_1[i + 1]) {
                decreciente = true;  // Se encontró una secuencia decreciente
            }
        }

        // Determinar el resultado
        if(creciente && !decreciente) {
            System.out.println("El orden del arreglo es creciente.");
        } else if(decreciente && !creciente) {
            System.out.println("El orden del arreglo es decreciente.");
        } else {
            System.out.println("El arreglo está desordenado.");
        }

        entrada.close();
    }
}
