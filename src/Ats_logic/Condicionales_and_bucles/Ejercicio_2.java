package Ats_logic.Condicionales_and_bucles;//Salario semanal de un empleado

import java.util.*;
//¿apartir de que se calcula el sueldo de un obrero ?
// de las horas trabajadas y de el sueldo por hora 
public class Ejercicio_2 {
    public static void main(String[] args) {
        //declaracion de variables 
        int sueldo_ph,horas,total;
        Scanner entrada = new Scanner(System.in);


        //solicitar al usuario las horas trabajadas  y el sueldo por hora 
        System.out.println("Digite cual es su sueldo por hora , y las horas que trabajo respectivamente ");
        sueldo_ph = entrada.nextInt();
        horas = entrada.nextInt();

        //determinar  la paga 
        total = sueldo_ph*horas;

        //imprimir resultado 
        System.out.println("el sueldo de la persona fue : $"+ total);
        entrada.close();
    }
}
