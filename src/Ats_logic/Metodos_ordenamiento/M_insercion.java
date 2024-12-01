package Ats_logic.Metodos_ordenamiento;

import java.util.Scanner;

class M_insercion {
    public static void main(String[] args) {
        // Creacion del objeto Scanner
        Scanner sc = new Scanner(System.in);
        // creacion de variables
        int c_datos,v_aux = 0;

        // Solicitar la cantidad de elementos del arreglo
        System.out.println("Digita la cantidad de elementos del arreglo :");
        c_datos = sc.nextInt();
        // creacion del arreglo y for para solicitar los datos del arreglo
        int[] array = new int[c_datos];
        for (int i = 0; i < c_datos; i++) {
            // Solicita los datos del arreglo
            System.out.println("Digita el elemento : " + (i + 1));
            array[i] = sc.nextInt();
        }
        /*--------------------LOGICA PARA EL CAMBBIO DE POSICION-------------- */
        //POSICION    0,1,2,3.
        //AREGLO DADO 3,2,4,1.
        // el ciclo empieza desde el elemento numero 1 para comparar con los datos
        for (int i = 1; i < c_datos; i++) {

            int llave  = array[i];

            int posicion = 0;
            //FOR PARA VERIFICAR SI ES MENOR Y LA POSICION 
            for (int j = i; j > 0; j--) {
                
                if (llave  < array[j - 1]) {
                    posicion++;
                }
            }
            v_aux = array[i];
            //FOR PARA RECORRER EL ARREGLO 
            if (posicion > 0) {
                for (int l = i; l > i - posicion; l--) {
                    array[l] = array[l-1];
                }
                array[i-posicion] = v_aux;                
            } 
        }

        // Impresion del resultado
        System.out.println("---------------------");
        for (int k = 0; k < c_datos; k++) {
            System.out.println(array[k]);
        }

        sc.close();
    }

}
