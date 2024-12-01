package Ats_logic.matrices;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        // declaracion de scanner
        try (Scanner sc = new Scanner(System.in);) {
            // Declaracion de variables
            int n_columnas_1, n_filas_1 , n_columnas_2 , n_filas_2, suma_array_1 = 0 ,suma_array_2 = 0,suma_matrices ;
            
            //ciclos para asegurar que se interten valores positivos en la cantidad de datos de la matriz
            do{
                 // Solicitar los datos
            System.out.println("Matriz1;Digita la cantidad de filas:");
            n_filas_1 = sc.nextInt();
            System.out.println("Matriz 1;Digita la cantidad de columnas:");
            n_columnas_1 = sc.nextInt();
            if(n_filas_1<=0){
                System.out.println("Digita solo numeros positivos");
            }
            if(n_columnas_1<=0){
                System.out.println("Digita solo numeros positivos");
            }
            }while(n_filas_1 <=0 && n_columnas_1<=0);

            do{
                // Solicitar los datos
            System.out.println("Matriz 2;Digita la cantidad de filas:");
            n_filas_2 = sc.nextInt();
            System.out.println("Matriz 2;Digita la cantidad de columnas:");
            n_columnas_2 = sc.nextInt();
            if(n_filas_2<=0){
                System.out.println("Digita solo numeros positivos");
            }
            if(n_columnas_2<=0){
                System.out.println("Digita solo numeros positivos");
            }
            }while(n_filas_2 <=0 && n_columnas_2<=0);

            // creacion del arreglo y asignacion de filas y columnas
            int[][] array_1 = new int[n_filas_1][n_columnas_1];
            int[][] array_2 = new int[n_filas_2][n_columnas_2];

            // Solicitar los datos de cada matriz

            for (int i = 0; i < n_filas_1; i++) {
                for (int j = 0; j < n_columnas_1; j++) {

                    System.out.println("Matriz ;Digita el elemento " + "[" + i + "]" + "[" + j + "]");
                    array_1[i][j] = sc.nextInt();
                    suma_array_1 +=  array_1[i][j];
                }
            }
            for (int i = 0; i < n_filas_2; i++) {
                for (int j = 0; j < n_columnas_2; j++) {

                    System.out.println("Matriz ;Digita el elemento " + "[" + i + "]" + "[" + j + "]");
                    array_2[i][j] = sc.nextInt();
                    suma_array_2 += array_2[i][j]; 
                }
            }
            suma_matrices = suma_array_1 + suma_array_2;
            System.out.println("El valor de la suma de las matrices es :"+suma_matrices);

        }
    }
}
