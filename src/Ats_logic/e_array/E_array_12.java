package Ats_logic.e_array;

import java.util.Scanner;
//Leer n cantidad de elementos en una tabla y en otra tabla ,primero colocar los numeros pares y acontinuacion los impares
public class E_array_12 {
    public static void main(String[] args) {

         // Declaracion de variables
         int n_datos,limite = 0  ;
         Scanner sc = new Scanner(System.in);
         
         //cantidad de elementos del arreglo y validacion 
         do{
            System.out.println("Digita la cantidad de elementos del arreglo ");
            n_datos = sc.nextInt();
         }while(n_datos<0);

         //Creacion de arreglos 
         int[] array_1 = new int[n_datos];
         int[] array_2 = new int[n_datos];
         
         System.out.println("Digita los elementos del arreglo ");
         // for para solicitar los datos
         for (int i = 0; i < n_datos; i++) {
             System.out.println("Elemento :" + (i + 1));
             array_1[i] = sc.nextInt();
             if(array_1[i] % 2 == 0){
                limite++;
             }
         }
        
        int j=0, k = limite;
         //La segunda seria ir contando los elementos pares a impares y ponerlos como limite y que de ahi se empiecen a poner espero funcione .(activa meme del mono :) OH noooo
         for(int i = 0  ;i < n_datos ; i++){
            if(array_1[i] % 2 ==0){
                array_2[j] =array_1[i];
                j++;
            }else{
                array_2[k] =array_1[i];
                k++;
            }
         }
         // Imprimir los resultados
         System.out.println("------------------------");
         for (int i = 0; i < n_datos; i++) {
             System.out.println(array_2[i]);
         }
         sc.close();
    }
}
