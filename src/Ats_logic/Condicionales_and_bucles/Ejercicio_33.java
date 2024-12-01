package Ats_logic.Condicionales_and_bucles;//Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.

import java.util.Scanner;

public class Ejercicio_33 {
    public static void main(String[] args) {
        //Variables 
        int numero,p = 0,n = 0, cero = 0, siterativa = 0 ,riterativa = 0; 

        //Solicitar datos 
        System.out.println("Favor de introducir los numeros a sumar:");
        Scanner entrada = new Scanner(System.in);

        //Ciclo para contar la cantidad de numeros 
        for(int i=0;i<10;i++){
            numero = entrada.nextInt();
            //ciclo para determinar si es positivo y negativo e iniciar el contador
            if(numero>0){
                siterativa += numero;
                p++;
            }else if (numero<0){
                riterativa += numero;
                n++;
            }else{
                cero++;
            }
        }
        //Mostrar los resultados 
        System.out.println("la media positiva es :"+" "+siterativa/p+"\n"+"la media negativa es: "+" "+riterativa/n+"\n"+"y la cantidad de ceros que se han introducido es :"+cero);
        entrada.close();
    }
}
