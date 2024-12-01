package P_estructurada_leetcode;

import java.util.Scanner;

//construye una piramide dada la cantidad de bloques
//cada capa de bloques inferior debe de ser superior a la siguiente wuiii
public class E_1 {
    public static void main(String[] args) {
        //declaracion de variables wuiii
        int cantidad_bloques ,cantidad_filas = 0;

        //Solicitar los bloques
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita la cantidad de bloques que tienes :");
        cantidad_bloques = sc.nextInt();

        //como determino la cantidad de filas?
        int bloques_restados = 1;
        int bloques_restantes = cantidad_bloques;
        while (bloques_restantes > bloques_restados){
            bloques_restantes -= bloques_restados;
            cantidad_filas++;
            bloques_restados+=2;
        }

        for(int i = 0, k = 1; i< cantidad_filas;i++,k+=2){

            for (int j = 0; j < cantidad_filas - i; j++) {
                System.out.print(" ");
            }

            for(int l = 0 ; l < k ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("la cantidad de filas fueron :"+ cantidad_filas);
        System.out.println("la cantidad de bloques restantes fueron :"+bloques_restantes);
    }
}
