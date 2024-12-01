package Ats_logic.Condicionales_and_bucles;//Determinar si una letra es mayúscula o no
import java.util.Scanner;
public class Ejercicio_12 {
 public static void main(String[] args) {

    //Declaracion de variables
    String cadena;
    Scanner entrada = new Scanner(System.in);

    //Entrada de datos 
    System.out.println("favor de ingresar una cadena ");
    cadena = entrada.nextLine();

    //Condicional
    if(cadena.equals(cadena.toUpperCase())){
            System.out.println("tu cadena "+ " "+cadena+"es mayuscula  ");
        }else{
            System.out.println("tu cadena no es mayuscula");
        }
    entrada.close();
    }   
}
