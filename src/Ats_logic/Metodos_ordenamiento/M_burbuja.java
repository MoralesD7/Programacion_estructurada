package Ats_logic.Metodos_ordenamiento;

import java.util.Scanner;

/*metodo burbuja 
El método de ordenamiento burbuja consiste en comparar cada elemento de la estructura con el siguiente e intercambiándolos si corresponde. El proceso se repite hasta que la estructura esté ordenada.
 */

public class M_burbuja {
    public static void main(String[] args) {
        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int c_datos,v_aux = 0;

        // solicitar cantidad de datos del arreglo
        System.out.println("Digita la cantidad de elementos del arreglo :");
        c_datos = sc.nextInt();

        // creacion del arreglo
        int[] array = new int[c_datos];

        // for para pedir los elementos del arreglo
        for (int i = 0; i < c_datos; i++) {
            System.out.println("Digita el elemento " + i);
            array[i] = sc.nextInt();
        }
        for(int i =0 ;i<c_datos-1;i++){
            for (int j = 0; j < c_datos - 1; j++) {
                if (array[j] > array[j + 1]) {
                    v_aux = array[j+1];
                    array[j + 1] = array[j];
                    array[j] = v_aux;
                }
            }
        }
        System.out.println("-----------------------");
        // impresion del primer arreglo
        for (int i = 0; i < c_datos; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}