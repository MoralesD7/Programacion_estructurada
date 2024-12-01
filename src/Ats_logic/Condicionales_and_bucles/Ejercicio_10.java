package Ats_logic.Condicionales_and_bucles;

import java.util.*;
//Ejercicio 1 – Determinar si un numero es múltiplo de 10
public class Ejercicio_10 {
    public static void main(String[] args) {

        //declaracion de variables 
        int numero;
        Scanner sc = new Scanner(System.in);

        //entrada de datos 
        System.out.println("favor de digitar tu numero para determinar si es multiplo de 10 ");
        numero = sc.nextInt();

        //Condicion
        if(numero%10 ==0){
            System.out.println("el numero :"+ numero+" s"+"es multiplo de 10");
        }else{
            System.out.println("el numero no es multiplo de 10 ");
        }
        sc.close();
    }
}
