package Ats_logic.e_array;

import java.util.Scanner;

//Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.

/*que tengo que hacer 
 tengo que crear un arreglo que guarde los datos 
 tengo que crear otro arreglo ? tengo que crear otro arreglo por que el ultimo dato lo tengo que guardar en una variable para que pase a ser la primera  o es la manera de imprimir ? 
for para pedir datos 
variable para guardar el ultimo dato 
for para recorrer el arreglo una posicion adelante 
primero tengo que guardar si o si el ultimo valor en la primer posicion 

 */

public class E_array_8 {
    public static void main(String [] args){
        //Declaracion de variables 
        int n_datos,variable_aux = 0  ; 
        Scanner entrada = new Scanner(System.in);

        //Digitar numero de elememento 
        System.out.println("Digita el numero de elementos del arreglo ");
        n_datos = entrada.nextInt();

        //Creacion del array y dar la longitud deseada 
        int [] array_1 = new int[n_datos];
        int [] array_2 = new int[n_datos];
        System.out.println("Digita los elementos del arreglo ");
        
        //for para pedir los numeros del arreglo 
        for ( int i = 0 ; i<n_datos ; i++ ){
            array_1[i] = entrada.nextInt();
            if(i==n_datos -1){
                variable_aux = array_1[i];
            }
        }

        //for para meter recorrer los datos 
        for(int i = 0 , j = 0  ; i < n_datos ; i++){
            if(i == 0){
                array_2[i] = variable_aux;
            }else{
                array_2[i] = array_1[j];
                j++;
            }
        }
        System.out.println("-----------------------------------");
        for(int i = 0; i<n_datos;i++) {
            System.out.println(array_2[i]);
        }
        entrada.close();
    }
}
