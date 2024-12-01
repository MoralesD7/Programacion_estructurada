package Ats_logic.e_array;

import java.util.Scanner;

/*
Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números enteros
desplace N posiciones en el arreglo 
(N es digitado por el usuario)
 */
public class E_array_9 {
    public static void main(String[] args) {
        // Declaracion de variables
        int n_datos, n_casillas;
        Scanner entrada = new Scanner(System.in);

        // Digitar numero de elememento
        System.out.println("Digita el numero de elementos del arreglo ");
        n_datos = entrada.nextInt();

        // Creacion del array y dar la longitud deseada
        int[] array_1 = new int[n_datos];
        int[] array_2 = new int[n_datos];

        // for para pedir los numeros del arreglo
        System.out.println("Digita los elementos del arreglo ");
        for (int i = 0; i < n_datos; i++) {
            array_1[i] = entrada.nextInt();
        }


        //pedir cantidad de veces que quiere recorrer el arreglo
        System.out.println("Digita la cantidad de veces que quieres recorrer el arreglo ");
        n_casillas = entrada.nextInt();

        //for para meter recorrer los datos 
        int  j =0 ,k = 0;

        for(int i = 0 ;i<n_datos;i++){

            if(i < n_casillas){
                array_2[n_casillas-1-i] =array_1[n_datos-1-j];
                j++;
            }else{
                array_2[n_casillas+k] = array_1[k];
                k++;
            }

        }

        System.out.println("----------------------------");
        for(int i = 0 ; i< n_datos; i++){
            System.out.println(array_2[i]);
        }

        entrada.close();
    }
}
