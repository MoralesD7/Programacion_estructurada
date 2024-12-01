package Ats_logic.Condicionales_and_bucles;//Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.

import java.util.Scanner;

public class Ejercicio_35 {
    public static void main(String[] args) {

        //Declaracion de variables 
        double edad,altura,ed_media =0, al_media = 0 ,i_175 = 0,i_18 = 0 ;

        //Ciclo para pedir los datos 
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5;i++){

            //Digitar edad  
            System.out.println("Digite la edad de la persona "+" "+(i+1) +" "+":");
            edad = sc.nextDouble();

            //Digitar la altura 
            System.out.println("Digite la altura de la persona "+" "+(i+1) +" "+":");
            altura = sc.nextDouble();

            //suma iterativa de la edad y altura media 
            ed_media += edad;
            al_media += altura;
            // Conteo de alumnos mayores de 18 años usando operador ternario
            i_18 += (edad > 18) ? 1 : 0;

            // Conteo de alumnos que miden más de 1.75 usando operador ternario
            i_175 += (altura > 1.75) ? 1 : 0;
            
        }
        System.out.println("La  edad media es "+ed_media/5+"\n"+"La  altura media es "+al_media/5+"\n"+"La  cantidad de alumnos que tiene mas de 18 años es:"+i_18+"\n"+"La  cantidad de alumnos que miden mas  1.75 son :"+i_175+"\n");

        sc.close();
    }
}
