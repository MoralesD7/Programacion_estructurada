package Ats_logic.Condicionales_and_bucles;//pedir un numero n , introducir n sueldos y mostrar el sueldo maximo

import java.util.Scanner;

public class Ejercicio_38 {
    public static void main(String[] args) {

        //Declaracion de variables
        int c_sueldos , sueldo_n , mayor = 0 ; 
        Scanner entrada = new Scanner(System.in);


        //entrada de cantidad de sueldos
        System.out.println("Favor de digitar la cantidad de sueldos:"); 
        c_sueldos = entrada.nextInt();

        //Ciclo for para pedir los n sueldos 
        for(int i = 1 ; i<= c_sueldos;i++){
            //pedir el sueldo 
            System.out.println("Introducir el sueldo numero  "+" "+i);
            sueldo_n = entrada.nextInt();
            
            //determinar el mayor de todos los sueldos 

           
            mayor =(sueldo_n>mayor)?mayor =sueldo_n : mayor;
        }
        System.out.println("el sueldo mayor es "+mayor);
        entrada.close();
    }       
}
