package Ats_logic.Condicionales_and_bucles;//pedir 10 numeros y verificar si alguno es negativo

import java.util.Scanner;

public class Ejercicio_39 {
    public static void main(String[] args) {
        //definir variables 
        int  numero ;
        boolean indicador = false;
        Scanner entrada = new Scanner(System.in);

        //for para pedir los numeros
        for(int i = 0 ; i<10; i++){
            //entrada de datos 
            System.out.println("Digite el numero "+" "+ (i+1));
            numero = entrada.nextInt();

            //condicional 
            indicador = (numero<0)? true :indicador;

        }
        System.out.println("¿se han introducido numeros negativos?"+indicador);
        entrada.close();
    }
}
