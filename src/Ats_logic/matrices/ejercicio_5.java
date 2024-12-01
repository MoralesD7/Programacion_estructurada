package Ats_logic.matrices;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
          // declaracion de scanner
        try (Scanner sc = new Scanner(System.in);) {
            // Declaracion de variables
            int n_columnas_1, n_filas_1;
            
            //ciclos para asegurar que se interten valores positivos en la cantidad de datos de la matriz
            do{
                 // Solicitar los datos
            System.out.println("Digita la cantidad de filas:");
            n_filas_1 = sc.nextInt();
            System.out.println("Digita la cantidad de columnas:");
            n_columnas_1 = sc.nextInt();
            if(n_filas_1<=0){
                System.out.println("Digita solo numeros positivos");
            }
            if(n_columnas_1<=0){
                System.out.println("Digita solo numeros positivos");
            }
            }while(n_filas_1 <=0 || n_columnas_1<=0);

            
            // creacion del arreglo y asignacion de filas y columnas
            int[][] array_1 = new int[n_filas_1][n_columnas_1];

            // Solicitar los datos de cada matriz
            for (int i = 0; i < n_filas_1; i++) {
                for (int j = 0; j < n_columnas_1; j++) {
                    System.out.println("Digita el elemento " + "[" + i + "]" + "[" + j + "]");
                    array_1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n_filas_1; i++) {
                int suma_iterativa = 0 ;
                for (int j = 0; j < n_columnas_1; j++) {
                    if(j<n_columnas_1){
                        suma_iterativa += array_1[i][j];    
                    }
                }
                System.out.println("La suma de la fila "+i+" "+"es: "+" "+suma_iterativa);
            }

            for (int i = 0; i < n_filas_1; i++) {
                int suma_iterativa = 0 ;
                for (int j = 0; j < n_columnas_1; j++) {
                    if(i<n_filas_1){
                        suma_iterativa += array_1[j][i];
                    }
                }
                System.out.println("La suma de la columna "+i+" "+"es: "+" "+suma_iterativa);
            }
            
        }
    }
}
