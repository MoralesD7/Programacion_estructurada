package Ats_logic.matrices;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        // declaracion de scanner
        try (Scanner sc = new Scanner(System.in);) {
            // Declaracion de variables
            int n_columnas_1, n_filas_1,v_aux ;
            
            //ciclos para asegurar que se interten valores positivos en la cantidad de datos de la matriz
            do{
                 // Solicitar los datos
            System.out.println("Digita la cantidad de filas:");
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

            
            // creacion del arreglo y asignacion de filas y columnas
            int[][] array_1 = new int[n_filas_1][n_columnas_1];

            // Solicitar los datos de cada matriz

            for (int i = 0; i < n_filas_1; i++) {
                for (int j = 0; j < n_columnas_1; j++) {
                    System.out.println("Matriz ;Digita el elemento " + "[" + i + "]" + "[" + j + "]");
                    array_1[i][j] = sc.nextInt();

                }
            }
            System.out.println("Tu matriz insertada fue esta:");
            for (int i = 0; i < n_filas_1; i++) {
                for (int j = 0; j < n_columnas_1; j++) {
                    System.out.print(array_1[i][j]);
                    if(j==n_columnas_1-1){
                        System.out.println();
                    }
                }
            }
            for (int i = 0; i < n_filas_1; i++) {
                for (int j = 0; j < n_columnas_1; j++) {
                    if(i<j){
                        v_aux = array_1[i][j];
                        array_1[i][j] = array_1[j][i];
                        array_1[j][i] = v_aux;
                    }
                }
            }
            System.out.println("tu matriz trapuesta fue la siguiente ");
            for (int i = 0; i < n_filas_1; i++) {
                for (int j = 0; j < n_columnas_1; j++) {
                    System.out.print(array_1[i][j]);
                    if(j==n_columnas_1-1){
                        System.out.println();
                    }
                }
            }
        }
    }
}
