package Ats_logic.e_array;

import java.util.*;
//Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el  orden inverso  que ingresaron.

public class E_array_1 {
    public static void main(String [] args){

        //declarar variables 
        int c_elementos ;
        Scanner sc = new Scanner(System.in);

        //Entrada de elementos 
        System.out.println("Digita la cantidad de elementos del arreglo ");
        c_elementos = sc.nextInt();
        int [] array_1= new int[c_elementos] ;

        //for entrada de elementos al array 
        for(int i = 0 ; i< array_1.length;i++){
            System.out.println("Digita los  elementos del arreglo ");
            array_1 [i] = sc.nextInt();
        }

        for(int i = c_elementos-1; i>=0;i--){
            System.out.println("los elementos mostrados en el orden inverso son :  ");
            System.out.println(array_1[i]);
        }
        sc.close();

    }
}
