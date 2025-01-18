package P_estructurada_leetcode;
// una versión que calcule el máximo de una tabla de n elementos.
//creacion de un arreglo de N-elementos
//creacion de la funcion q retorne el valor  mayor

import java.util.Scanner;

public class E_4 {
    //objeto Scanner
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //declaracion de variables
        int [] Array ;
        int elementos ;

        System.out.println("Digita la cantidad de elementos que tiene el array :");
        elementos = sc.nextInt();
        Array = new int[elementos];
        System.out.println("Digita los elementos del array :");
        for(int i = 0 ; i<Array.length;i++){
            Array[i] = sc.nextInt();
        }
        int Numero_wuii = Ide_mayor(Array);
        System.out.println("El numero mayor es "+ Numero_wuii);
    }
    // Creación del método
    public static int Ide_mayor(int[] Array) {
        int numero_mayorcito = Array[0]; // Inicializar con el primer elemento
        //Integer.MIN_VALUE <------- tambien se puede comparar con el minimo valor de los tipos de dato int
        for (int i = 1; i < Array.length; i++) { // Comenzar desde el segundo elemento
            if (Array[i] > numero_mayorcito) {
                numero_mayorcito = Array[i]; // Actualizar si se encuentra un mayor
            }
        }
        return numero_mayorcito;
    }
}
