package Ats_logic.Condicionales_and_bucles;

import java.util.*;
public class Ejercicio_42 {
    public static void main(String[] args) {
        int n_elementos;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digita la cantidad de elementos ");
        n_elementos= entrada.nextInt();
        int [] numeros = new int[n_elementos];


        for(int i=0 ;i < n_elementos;i++ ){

            System.out.println("Digita los elementos del arreglo");
            numeros[i] = entrada.nextInt();
        }

        for(int i=0 ;i < n_elementos;i++){
            System.out.println("Los elementos del arreglo son "+ numeros[i]);
        }
        entrada.close();


    }
}
