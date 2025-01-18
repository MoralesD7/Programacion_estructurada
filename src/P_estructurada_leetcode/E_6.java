package P_estructurada_leetcode;

import java.util.Scanner;

public class E_6 {
    public static void main(String[] args) {
        // Variables
        double numero_amstrong;
        double potencia, i = 0;
        double coeficiente, residuo, suma_i = 0;
        boolean igualdad = false;
        Scanner sc = new Scanner(System.in);

        // Pedir los datos
        System.out.println("Digita el numero para verificar si es un numero de amstrong :");
        numero_amstrong = sc.nextDouble();
        // Hago una copia del número para poder modificarlo
        double copia_amstrong = numero_amstrong;

        // Calcular cuántas cifras tiene el número
        potencia = Math.floor(Math.log10(numero_amstrong) + 1);

        // Condición para obtener los valores del coeficiente y residuo, sumándolos las veces necesarias
        while (i < potencia) {
            // Obtener el residuo, que es un dígito del número de Amstrong
            residuo = copia_amstrong % 10;
            // Obtener el coeficiente para modificar la copia
            coeficiente = Math.floor(copia_amstrong / 10);
            // Modificar la copia
            copia_amstrong = coeficiente;

            // Sumar el dígito obtenido elevado a la potencia
            suma_i += Math.pow(residuo, potencia);

            // Iterar
            i++;
        }

        // Comparar si la suma obtenida es igual al número original
        igualdad = numero_amstrong == suma_i;
        if (igualdad) {
            System.out.println("El numero introducido es un numero de amstrong");
        } else {
            System.out.println("El numero introducido no es un numero de amstrong");
        }
    }
}
