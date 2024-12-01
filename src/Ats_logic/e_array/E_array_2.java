package Ats_logic.e_array;
import java.util.Scanner;

//Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos, la media de los negativos y conteo el número de ceros.

public class E_array_2 {
    public static void main(String [] args){

        //Declarar variables 
        int c_elementos;
        double suma_array_p = 0 ,suma_array_n = 0,incremento_p = 0 ,incremento_n = 0,incremento_0 =0 ; 
        Scanner entrada = new Scanner(System.in);
        
        //Pedir la cantidad de elementos del arreglo 
        System.out.println("Digita la cantidad de elementos del arreglo ");
        c_elementos = entrada.nextInt();
        int [] array_1 = new int[c_elementos];

        //for para introducir los valores del arreglo 
        System.out.println("digita los elementos del arreglo ");
        for(int i = 0 ; i<array_1.length;i++){
            System.out.println("Digita el elemento "+(i+1));
            array_1[i] = entrada.nextInt() ;
            if(array_1[i]>0){
                suma_array_p += array_1[i];
                incremento_p++;
            }else if (array_1[i]<0) {
                suma_array_n += array_1[i];
                incremento_n++;
            }else{
                incremento_0++;
            }
        }


        //Condicional para imprimir resultados y validacion de medias 
        if(incremento_p >0){
            System.out.println("la media de los valores positivos fue : "+suma_array_p/incremento_p);
        }else {
            System.out.println("no se ingresaron valores positivos");
        }
        if(incremento_n>0){
            System.out.println("la media de los valores negativos  fue : "+suma_array_n/incremento_n);
        }else {
            System.out.println("no se ingresaron valores negativos ");
        }
        if(incremento_0>0){
            System.out.println("la cantidad de 0 que se introdujeron fue :"+incremento_0);
        }else{
            System.out.println("no se introdujo el numero o ");}


        entrada.close();
    }
}
