package Ats_logic.e_array;

import java.util.Scanner;

//Ejercicio 5: Leer por teclado dos tablas de 12 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B,el 1º de C el 2º de A, el 2º de B, etc.
public class E_array_5 {
    public static void main(String [] args){
        //Creacion de arreglos y entrada de datos 
        String [] a_rray_1 = new String [12];
        String [] a_rray_2 = new String [12];
        Scanner sc = new Scanner(System.in);
        String [] a_rray_3 = new String [24];

        //Solicitar los elementos de cada array con un for 
        for (int i = 0 ; i<a_rray_1.length;i++){
            System.out.println("Digita el elemento "+" "+ (i+1)+" "+ "del arreglo A");
            a_rray_1[i] = sc.nextLine();
        }
        for (int i = 0 ; i<a_rray_2.length;i++){
            System.out.println("Digita el elemento "+" "+ (i+1)+" "+ "del arreglo B");
            a_rray_2[i] = sc.nextLine();
        }
        //Combinar los elementos 
        for(int i = 0 , j = 0   ;j<a_rray_3.length;i+=3){
            a_rray_3 [j] = a_rray_1[i];
            j++;
            a_rray_3[j] = a_rray_1[i+1];
            j++;
            a_rray_3[j] = a_rray_1[i+2];
            j++;
            a_rray_3 [j] = a_rray_2[i];
            j++;
            a_rray_3[j] = a_rray_2[i+1];
            j++;
            a_rray_3[j] = a_rray_2[i+2];
            j++;
            
        }
        System.out.println("-----------------------------------------------------------");
        //imprimir los elementos del tercer arreglo 
        for (String i : a_rray_3) {
            System.out.println(i);
          }
        sc.close();


    }
}
