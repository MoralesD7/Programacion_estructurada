package Ats_logic.Condicionales_and_bucles;//Ejercicio 8 – Ecuación de segundo grado

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        //declaracion de variables 
        double a,b,c;
        double determinante,x_1,x_2;
        Scanner sc =  new Scanner(System.in);

        //ingresar datos 
        System.out.println("favor de ingresar los coeficientes respectivamente :");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        //verificar si es posible 
        determinante = Math.pow(b, 2)-4*a*c;
        x_1 = (-b + Math.sqrt(determinante))/2*a;
        x_2 = (-b - Math.sqrt(determinante))/2*a;

        //imprimir los resultados
        System.out.println("las raices de la ecuacion son :"+x_1+x_2);
        sc.close();



    }
}
