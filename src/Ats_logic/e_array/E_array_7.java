package Ats_logic.e_array;

import java.util.Scanner;

//Ejercicio 8:pedir N numeros en un arreglo, el ultimo numero pedir su valor y su posicion, y colocarlo en la posicion desplazando los demas

public class E_array_7 {
    public static void main(String[] args) {
        // Declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int n_datos, posicion, dato;

        // solicitar la cantidad de datos del arreglo
        System.out.println("Digita la cantidad de elementos que tendra tu arreglo");
        n_datos = entrada.nextInt();
        int[] a_rray_1 = new int[n_datos];
        int[] a_rray_2 = new int[n_datos + 1];

        // llenar el arreglo con los datos
        for (int i = 0; i < n_datos; i++) {
            System.out.println("Digita el elemento " + " " + (i + 1));
            a_rray_1[i] = entrada.nextInt();
        }
        //pedir la posicion y el dato 
        System.out.println("Digita la posicion del elemento (0 a " + n_datos + ") y el valor del elemento ");
        posicion = entrada.nextInt();
        dato = entrada.nextInt();

        

        //for para hacer el intercambio de valores 
        for (int i = 0, j = 0; i < n_datos + 1; i++) {
            if (posicion == i) {
                a_rray_2[posicion] = dato;
            } else {
                a_rray_2[i] = a_rray_1[j++];
            }
        }


        //for para imrpimir el resultado 
        System.out.println("------------------------------------");
        for (int i = 0; i < a_rray_2.length; i++) {
            System.out.println(a_rray_2[i]);
        }
        entrada.close();
    }
}
