package P_estructurada_leetcode;

import java.util.Scanner;

//Realizar una función, a la que se le pase como parámetro un número N, y muestre por pantalla N
//veces, el mensaje: “Módulo ejecutándose”
//tengo dos opciones o creo un metodo static o creo una instancia para invocar el metodo
public class E_2 {
    public static void N_repeticiones(int num){
        int longitud = num;
        for(int i = 0 ; i < longitud ;i++){
            System.out.println("Modulo ejectuandose");
        }

    }
    public static void main(String[] args) {
        // objeto Scanner
        Scanner sc = new Scanner(System.in);

        //creacion de variable de n cantidad
        int n_veces;
        //Solicitar la cantidad de veces que quieres que se repita
        System.out.println("Digita la cantidad de veces que quieres que se ejecute el metodo:");
        n_veces  =  sc.nextInt();
        N_repeticiones(n_veces);
        sc.close();
    }
}
