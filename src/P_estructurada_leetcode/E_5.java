package P_estructurada_leetcode;

import java.util.Scanner;

/*
* 5. Función a la que se le pasan dos enteros y muestra todos los números comprendidos entre ellos,
inclusive.*/
public class E_5 {

    public static void main(String[] args) {
        int  num_1 , num_2 ;
        System.out.println("Digita dos numeros :");
        num_1 = sc.nextInt();
        num_2 = sc.nextInt();
        recopilacion(num_1,num_2);

    }

    static Scanner sc = new Scanner(System.in);

    public static void recopilacion (int num_1, int num_2 ){
        //primero tenemos que id que numero es mayor para saber si ir de atras adelante o alreves
        if(num_1<num_2){
            for(int i = num_1 + 1 ; i<num_2;i++ ){
                System.out.println(i);
            }
        }else  if ( num_2<num_1){
            for(int i = num_2 +1 ; i<num_1;i++ ){
                System.out.println(i);
            }
        }else if ( num_1 == num_2){
            System.out.println("Ambos numeros son iguales no hay numeros comprendidos entre ellos ");
        }
    }
}
