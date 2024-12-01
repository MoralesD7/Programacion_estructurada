package Ats_logic.Condicionales_and_bucles;//factorial de un numero

import java.util.Scanner;
public class Ejercicio_32 {
    public static void main(String[] args) {

        //declaracion de variables
        int numero,factorial = 1; 
        Scanner entrada = new Scanner(System.in);

        //indica el numero 
        System.out.println("Digita el numero para determinar su factorial ");
        numero = entrada.nextInt();

        //logica del factorial 
        for(int i = numero ;i>=1 ;i--){
            factorial *=i;
        }
        System.out.println("el factorial del numero "+ " "+ numero +"es:"+ " "+ factorial);
        entrada.close();
    }
}
