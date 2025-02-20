package Escuela;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        //Declaracion de variables
        int opcion ; // variable para seleccionar la opcion en el bucle
        int a ,b ,c ; // variables para manejo de las operaciones

        //Declaracion de el objeto Scanner
        Scanner sc = new Scanner(System.in); //objeto capaz de manejar la entrada y salida de datos

        do {
            System.out.println("Bienvenido a tu calculadora ");
            System.out.println("\nSelecciona la opción que deseas:");
            System.out.println("\n1.Suma");
            System.out.println("\n2.Resta");
            System.out.println("\n3.Multiplicacion");
            System.out.println("\n4.Division");
            System.out.println("\n5.Salida");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el primer digito a sumar:");
                    a = sc.nextInt();
                    System.out.println("Ingresa el segunda digito a sumar:");
                    b = sc.nextInt();
                    c = a + b;
                    System.out.println("El resultado de la suma fue :"+ c );
                    break;
                case 2:
                    System.out.println("Ingresa el primer digito a restar:");
                    a = sc.nextInt();
                    System.out.println("Ingresa el segunda digito a restar:");
                    b = sc.nextInt();
                    c = a - b;
                    System.out.println("El resultado de la suma fue :"+ c );
                    break;
                case 3:
                    System.out.println("Ingresa el primer digito a multiplicar:");
                    a = sc.nextInt();
                    System.out.println("Ingresa el segunda digito a multiplicar:");
                    b = sc.nextInt();
                    c = a * b;
                    System.out.println("El resultado de la suma fue :"+ c );
                    break;
                case 4:
                    System.out.println("Ingresa el dividendo:");
                    a = sc.nextInt();
                    System.out.println("Ingresa el divisor: ");
                    b = sc.nextInt();
                    c = a / b;
                    System.out.println("El resultado de la division fue :"+ c );
                    break;
            }
        }while (opcion>=1 && opcion<=4);
        System.out.println("Has salido del programa ");
    }
}
