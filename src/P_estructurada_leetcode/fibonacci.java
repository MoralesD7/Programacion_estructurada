package P_estructurada_leetcode;

import java.util.Scanner;

//Haremos la sucesion de fibonacci wuiiii
public class fibonacci {
    public static void main(String[] args) {
        //ejemplos de la sucesion 0,1,1,2,3,5,8
        //Objeto scanner
        Scanner sc = new Scanner(System.in);
        //variables
        int n_termino ,a = 0,b = 1 ,c = 0,i = 0;

        //solicitar  n termino
        System.out.println("Digita el n termino hasta donde quieres que llegue la sucesion de fibonacci:");
        n_termino = sc.nextInt();

        while(i<n_termino){
            c = a + b; // 1 = 0+1 ;
            a = b ; // 1 = 1 ;
            b = c ; // 1 = 1;
            i++;
            System.out.print(c+",");
        }
    }
}
