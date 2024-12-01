package Ats_logic.Condicionales_and_bucles;//Ejercicio 4 – Descuento del 20% si la compra supera los 300
import java.util.*;
public class Ejercicio_13 {
    public static void main(String[] args) {
        
        //Declaracion de variables 
        double compra , total ; 
        Scanner entrada = new Scanner(System.in);

        //entrada de datos 
        System.out.println("Digite el precio de la compra ");
        compra = entrada.nextInt();

        //Condicional 
        if(compra >=300){
            total = compra -(compra*0.20);
            System.out.println("Felicidades se aplico descuento el total es :"+ total);
        }else{
            System.out.println("no se aplico descuento el precio de tu compra es :"+ compra);
        }
        entrada.close();



    }
}
