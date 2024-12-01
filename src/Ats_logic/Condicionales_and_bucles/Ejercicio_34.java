package Ats_logic.Condicionales_and_bucles;//pedir 10 sueldos mostrar su suma y cuantos son mayores de 1000

import java.util.Scanner;

public class Ejercicio_34 {
    public static void main(String[] args) {
        //Declaracion de variables 
        double  sueldo , tsueldo = 0 ,Csueldo = 0;
        Scanner sc = new Scanner(System.in);

        //Solicitar los datos  mediante el ciclo 
        for(int i =0;i<10;i++){
            System.out.println("Digite el sueldo numero: "+" "+(i+1));
            sueldo = sc.nextDouble();
            if (sueldo>1000){
                tsueldo += sueldo;
                Csueldo++;
            }else{
                tsueldo += sueldo;
            }
        }
        //Mostrar los resultados :
        System.out.println("A todos los trabajadores se les pago en total:"+" "+tsueldo+" "+"y las personas que tuvieron un sueldo mayor a $1000 fueron :"+" "+Csueldo);
        
        sc.close();
    }
}
