package P_estructurada_leetcode;

import java.util.Scanner;

public class E_3 {
    //2. Diseñar una función que tenga como parámetros dos números, y que calcule el máximo.
    //muy easy
    //creacion de un metodo static para poder hacer la comparacion
    //creacion del obj escaner
    static Scanner sc  = new Scanner(System.in);

    public static int  N_mayor (int Num_1, int Num_2){
        int mayor ;
        if(Num_1>Num_2){
             mayor = Num_1;
        }
        else{
             mayor = Num_2;
        }
        return  mayor ;
    }
    public static void main(String[] args) {
        int N_1,N_2 ;
        System.out.println("Digita dos numeros para verificar cual es el mayor ");
        N_1 = sc.nextInt();
        N_2 = sc.nextInt();
        int mayor = N_mayor(N_1,N_2);
        System.out.println("El numero mayor es "+ mayor);
        sc.close();
    }
}
