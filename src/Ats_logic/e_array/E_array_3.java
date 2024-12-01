package Ats_logic.e_array;

import java.util.Scanner;
/*
Ejercicio 4: Leer 10 numeros enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden: el primero, el último, 
el segundo, el penultimo, el tercero, etc.
 */
public class E_array_3 {
    public static void main(String [] args){
        //Declarar variables 
        Scanner entrada = new Scanner(System.in);
        
        //Pedir la cantidad de elementos del arreglo 
        int [] array_1 = new int[10];

        //for para pedir los elementos del arreglo 
        for(int i = 0 ;i<10;i++){
            System.out.println("Digita el elemento" +" "+ (i+1)+" "+ "del arreglo ");
            array_1[i] = entrada.nextInt();
        }
        System.out.println("--------------------------------------");
        for(int i = 0 , j = 9;i<5;i++){
            System.out.println(array_1[i]);
            System.out.println(array_1[j]);
            j--;
        }

        entrada.close();
    }
}
