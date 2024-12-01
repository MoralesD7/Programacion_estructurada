package Ats_logic.matrices;

import java.util.Scanner;

//comprueba si una matriz es simetrica 

public class ejercicio_1 {
    public static void main(String[] args) {
        // declaracion de scanner
        try (Scanner sc = new Scanner(System.in);) {
            // Declaracion de variables
            int n_columnas, n_filas;
            boolean  desigualdad = false;
            // condicion para asegurar que es simetrica
            do {
                // Solicitar los datos
                System.out.println("Digita la cantidad de filas:");
                n_filas = sc.nextInt();
                System.out.println("Digita la cantidad de columnas:");
                n_columnas = sc.nextInt();

                if (n_filas == n_columnas) {
                    System.out.println("la matriz cumple con el primer requerimiento para ser simetrico");
                } else {
                    System.out.println("inserta tus datos denuevo  brother\nno es simetrica :´c");
                }

            } while (n_columnas != n_filas);

            // creacion del arreglo y asignacion de filas y columnas
            int[][] array = new int[n_filas][n_columnas];

            // Solicitar los datos de la matriz

            for (int i = 0; i < n_filas; i++) {
                for (int j = 0; j < n_columnas; j++) {

                    System.out.println("Digita el elemento " + "[" + i + "]" + "[" + j + "]");
                    array[i][j] = sc.nextInt();

                }
            }

            // ahora si perrillo viene la comparacion
            for (int i = 0; i < n_filas; i++) {
                for (int j = 0; j < n_columnas; j++) {
                    if (array[i][j] != array[j][i]){
                        desigualdad = true ;
                        break;
                    }
                }
                if(desigualdad){
                    break;
                }
            }

            if (!desigualdad) {
                System.out.println("tu arreglo es simetrico cumplio con la segunda caracterisitica");
            } else {
                System.out.println("tu matriz no es simetrica");
            }

        }

    }
}
