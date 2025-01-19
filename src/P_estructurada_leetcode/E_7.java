package P_estructurada_leetcode;

import java.util.Scanner;

//sucesion de suma de fracciones
//para este deplano no tengo ni idea de que hacer JAJAJAJAJAJ
//Escribir un programa que dado un número entero positivo n, calcule la suma de la siguiente serie: 1 + 1/2 + 1/3 + 1/4 + 1/5 + … + 1/n
public class E_7 {
    public static void main(String[] args) {
        //se supone que es similar a la sucesion de finbonacci aunque  no se
        //primero tenemos que definir hasta que numero queremos llegar

        //Objeto scanner
        Scanner sc = new Scanner(System.in);

        //variables
        int n_numero ;
        //habia pensado en 6 variables para cada parte pues de las fracciones
        int a_numerador = 1 , a_denominador = 1 ,b_numerador = 1 ,b_denominador = 2  ,c_numerador = 0,c_denominador = 0 ;

        //pedir el numero
        do{
            System.out.println("Digita el numero hasta el cual quieres que llegue la suma :");
            n_numero = sc.nextInt();
        }while (n_numero<2);

        //para que se vea mas bonito vamos a hacer pues como la simulacion de la sucesion
        System.out.println("Suma de fracciones:");
        int i_simulacion = 1;
        while (i_simulacion <= n_numero) {
            if (i_simulacion == n_numero) {
                // Último término sin el símbolo "+"
                System.out.print("1/" + i_simulacion + " ");
            } else {
                // Términos con el símbolo "+"
                System.out.print("1/" + i_simulacion + " + ");
            }
            i_simulacion++;
        }
        System.out.println(); // Salto de línea final

        // numerador = (a_numerador*b_denominador) + (a_denomiador*b_numerador) ,
        // denominador = a_denominador*b_denominador
        while (b_denominador <= n_numero){
            c_numerador = (a_numerador*b_denominador) + (a_denominador*b_numerador);
            c_denominador = a_denominador*b_denominador;
            a_numerador = c_numerador;
            a_denominador = c_denominador;
            //En la fraccion b nunca cambiara el numerador solo el denominador
            b_denominador++;
        }
        System.out.println("la suma final dio como resultado :");
        System.out.println(c_numerador+"/"+c_denominador);



    }
}
