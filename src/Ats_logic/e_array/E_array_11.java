package Ats_logic.e_array;

import java.util.Scanner;

//leer 10 elementos , y eliminar un numero al seleccionar una posicion del arreglo , no dejar huecos , que tengo que hacer primero voy a declar un arreglo , despues cuando pedire la posicion , y despues creare otro arreglo y sha esta bien easy piece 

public class E_array_11 {
    public static void main(String [] args){

        // Declaracion de variables
        int posicion,n_datos,posicion_real;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita la cantidad de elementos del arreglo ");
        n_datos = sc.nextInt();
        
        // Solicita los elementos del arreglo
        System.out.println("Digita los elementos del arreglo ");
        int[] array_1 = new int[n_datos];

        // for para solicitar los datos
        for (int i = 0; i < n_datos; i++) {
            System.out.println("Elemento :" + (i + 1));
            array_1[i] = sc.nextInt();
        }

        // Solicitar el dato para despues posicionarlo en la casilla indicada
        do{
        System.out.println("Digita una posicion para eliminar el numero indicado ");
        posicion = sc.nextInt();
        posicion_real= posicion-1;
        }while(posicion<1 ||posicion>n_datos);
    
        // for para eliminar el numero en la posicion indicada 
        for(int i = posicion_real;i<array_1.length-1;i++){
            array_1[i] = array_1[i+1];
        }
        // Imprimir los resultados
        System.out.println("------------------------");
        for (int i = 0; i < n_datos-1; i++) {
            System.out.println(array_1[i]);
        }
        sc.close();

    }
}