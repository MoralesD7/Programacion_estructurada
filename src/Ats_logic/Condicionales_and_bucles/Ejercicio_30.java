package Ats_logic.Condicionales_and_bucles;//pedir 10 numeros y escribir la suma total
import java.util.Scanner;

public class Ejercicio_30 {
    public static void main(String[] args) {
        //Declarar variables 
        int numero ,siterativa =0; 
        Scanner sc = new Scanner(System.in);

        //Ciclo
        for(int i=1;i<=10;i++){
            //Solicitar dato
            System.out.println("Digite un numero :");
            numero = sc.nextInt();
            siterativa += numero;
        }
        System.out.println("el resultado de la suma fue :"+siterativa);
        sc.close();
    }
}
