package Ats_logic.Condicionales_and_bucles;/* Pedir un numero N, y mostrar todos los números del 1 al N. */

import java.util.Scanner;

public class Ejercicio_28 {
    public static void main(String[] args) {
        //Declaracion de variables 
        int numero ,i = 1 ; 
        Scanner sc = new Scanner(System.in);
        //Mensaje para inciar 
        System.out.println("Digita el numero al cual quieres llegar");
        numero = sc.nextInt();

        //Ciclo
        while(i<=numero){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
