package Ats_logic.Condicionales_and_bucles;//tabla de multiplicar
import java.util.Scanner;
public class Ejercicio_37 {
    public static void main(String[] args) {
        //entrada de datos 
        int numero ,acumulador = 0  ;
        Scanner entrada = new Scanner(System.in);
        
        //entrada de datos 
        System.out.println("digita un numero para mostrarte su tabla de multplicar ");
        numero = entrada.nextInt();

        //mensajito uwu
        System.out.println("la tabla de multplicar del numero "+ numero +" "+ "es :");
        //Ciclo
        for(int i = 0 ;i<=10;i++){
            acumulador = numero *i;
            System.out.println(numero +" "+"x"+" "+i +" "+"="+acumulador);
        }
        entrada.close();

    }
}
