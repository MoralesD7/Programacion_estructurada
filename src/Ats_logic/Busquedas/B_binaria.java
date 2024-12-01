package Ats_logic.Busquedas;

import java.util.Scanner;

public class B_binaria {
    public static void main(String[] args) {
        // Declaracion de variables
        boolean autenticidad;
        boolean creciente;
        int dato, c_datos, posicion = -1;  // Inicializar 'posicion' en -1 para indicar que no se encontró el dato.

        // Creacion del objeto scanner
        Scanner sc = new Scanner(System.in);

        // Solicitar la cantidad de datos del arreglo
        do {
            System.out.println("Digita la cantidad de elementos del arreglo");
            c_datos = sc.nextInt();
            if (c_datos <= 0) {
                System.out.println("No se permiten datos negativos o iguales a 0");
            }
        } while (c_datos <= 0);
        int[] array = new int[c_datos];

        // Verificacion de si el arreglo es creciente y que tenga datos unicos
        do {
            // Solicitar los datos del arreglo
            for (int i = 0; i < c_datos; i++) {
                System.out.println("Solicita el dato " + (i + 1));
                array[i] = sc.nextInt();
            }

            // Validacion para verificar que los datos estan en orden creciente
            creciente = true;
            for (int i = 0; i < c_datos - 1; i++) {
                if (array[i] > array[i + 1]) {
                    creciente = false;
                    System.out.println("Digita los elementos en orden creciente ");
                    break;
                }
            }

            // Validacion para autentificar que los datos son unicos
            autenticidad = true;
            for (int i = 0; i < c_datos; i++) {
                for (int j = i; j < c_datos - 1; j++) {
                    if (array[i] == array[j + 1]) {
                        autenticidad = false;
                        System.out.println("No se pueden repetir los elementos del arreglo");
                        break;
                    }
                }
            }

        } while (!creciente || !autenticidad);

        // Solicitar el dato a encontrar 
        System.out.println("Digita el dato para encontrarlo:");
        dato = sc.nextInt();

        // Declaracion de indices 
        int j = 0, k = c_datos - 1, m;

        // Operacion para determinar la mitad del arreglo
        // Búsqueda binaria utilizando un ciclo 'for'
        for (int i = 0; j <= k; i++) {
            m = (j + k) / 2;  // Calcular la mitad
            
            if (dato == array[m]) {
                posicion = m;  // Si el dato se encuentra en la mitad
                break;
            } else if (dato < array[m]) {
                k = m - 1;  // Ajustar el límite superior
            } else {
                j = m + 1;  // Ajustar el límite inferior
            }
        }

        // Mostrar el resultado
        if (posicion != -1) {
            System.out.println("El número se encontró en la posición: " + (posicion + 1));  // Mostrar posición basada en 1
        } else {
            System.out.println("El dato no se encontró en el arreglo.");
        }
    }
}
