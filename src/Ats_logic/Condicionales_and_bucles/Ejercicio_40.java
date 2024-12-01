package Ats_logic.Condicionales_and_bucles;//hacer un cuadrilatero

import java.util.Scanner;

public class Ejercicio_40{
    public static void main(String[] args) {
        
        //declarar variables 
        int base , altura ;
        Scanner entrada = new Scanner(System.in);
        //pedir datos 
        System.out.println("favor de digitar la base :");
        base = entrada.nextInt();
        System.out.println("favor de digitar la altura :");
        altura = entrada.nextInt();

        for(int i =0 ; i < base;i++){
            for(int j = 0;j < altura ;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        entrada.close();



    }
}