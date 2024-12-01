package Ats_logic.Condicionales_and_bucles;//Comprobar si un numero es mayor a otro o sin iguales.
import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) {

        //Declaracion de variables 
        int num_1,num_2;
        Scanner sc = new Scanner(System.in);

        //Entrada de datos 
        System.out.println("Favor de digitar dos numeros respectivamente ");
        num_1 = sc.nextInt();
        num_2 = sc.nextInt();

        //Condicion 
        if(num_1==num_2){
            System.out.println("los dos numeros son iguales ");
        }else if (num_1<num_2) {
            System.out.println("el numero "+ num_2+" "+"es mayor que el numero "+num_1);
        }else{
            System.out.println("el numero "+ num_1+" "+"es mayor que el numero "+num_2);
        }
        sc.close();
    }
}
