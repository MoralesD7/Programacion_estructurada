package Ats_logic.e_array;

import java.util.Scanner;

//Leer dos series de n numeros enteros ,ambos tienen que estar ordenados de manera creciente fusionar las tablas en una tercera de manera que siga ordenada 
public class E_array_13 {
    public static void main(String[] args) {

        // Declaracion de variables
        int n_datos_1, n_datos_2;
        boolean creciente = true;
        Scanner sc = new Scanner(System.in);

        // Solicitar la cantidad de datos de ambos arreglos
        System.out.println("Cantidad de datos del 1er arreglo");
        n_datos_1 = sc.nextInt();
        System.out.println("Cantidad de datos del 2do arreglo");
        n_datos_2 = sc.nextInt();

        // Creacion de arreglos con la cantidad correspondiente
        int [] arreglo_1 = new int[n_datos_1];
        int [] arreglo_2 = new int[n_datos_2];
        int [] fusion = new int[n_datos_1+n_datos_2];

            // -----------------SEGUNDO ARREGLO-----------------------------
        do {

            // for para insertar los datos
            for (int i = 0; i < n_datos_1; i++) {
                System.out.println("Dato " + " " + (i + 1) + " " + "del 1er arreglo ");
                arreglo_1[i] = sc.nextInt();
            }

            // for para verificar si los datos estan en orden
            for (int i = 0; i < n_datos_1 - 1; i++) {
                // Condicional para verificar si es creciente o no
                if (arreglo_1[i] > arreglo_1[i + 1]) {
                    creciente = false;
                    System.out.println("Digita los elementos en orden creciente");
                    break;
                }

            }

        } while (!creciente);// se repetira si pones datos en desorden

            // -----------------SEGUNDO ARREGLO-----------------------------
        do {
            creciente = true;
            // for para insertar los datos
            for (int i = 0; i < n_datos_2; i++) {
                System.out.println("Dato " + " " + (i + 1) + " " + "del 2er arreglo ");
                arreglo_2[i] = sc.nextInt();
            }
            // for para verificar si los datos estan en orden
            for (int i = 0; i < n_datos_2 - 1; i++) {
                // Condicional para verificar si es creciente o no
                if (arreglo_2[i] > arreglo_2[i + 1]) {
                    creciente = false;
                    System.out.println("Digita los elementos en orden creciente");
                    break;
                }

            }
        } while (!creciente);
        
        //Fusionar los arreglos de manera que sigan en orden creciente creo que esta facil-no estaba tan facil :v 
        for(int k = 0 ,i=0,j=0; k < fusion.length;k++){
            if(i>=arreglo_1.length && j<arreglo_2.length){
                fusion[k] = arreglo_2[j];
                j++;
            }else if(j>=arreglo_2.length && i<arreglo_1.length){
                fusion[k] = arreglo_1[i];
                i++;
            }else if(arreglo_1[i]<arreglo_2[j]){
                fusion[k] = arreglo_1[i];
                i++;
            }else if (arreglo_1[i]>arreglo_2[j]) {
                fusion[k] = arreglo_2[j];
                j++;
            }
        }    


        //Impresion del arreglo fusionado 
        System.out.println("El tercer arreglo es :");
        for(int i = 0 ; i< fusion.length;i++){
            System.out.println("Dato "+" "+(i+1));
            System.out.println(fusion[i]);
        }

        sc.close();
    }
}
