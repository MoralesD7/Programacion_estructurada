package Ats_logic.Condicionales_and_bucles;//leer n numeros almacenarlos en un arreglo y acontinuacion realizar la media de los numeros positivos ,la media de los negativos y el numero de 0
import java.util.Scanner;

public class Ejercicio_43 {
    public static void main(String[] args) {

        //Declaracion de variables 
        int n_elementos,c_media_positiva = 0,c_media_negativa =0, c_positivos = 0 , c_negativos = 0 ,c_ceros = 0;
        Scanner entrada = new Scanner(System.in);

        //obtener la cantidad de elementos 
        System.out.println("Digita la cantidad de elementos que tendra tu arreglo ");
        n_elementos = entrada.nextInt();
        int [] arreglo = new int[n_elementos];

        System.out.println("Digita los elementos de tu arreglo:");
        //for para obtener los elementos 
        for(int i = 0 ; i<n_elementos;i++){

            
            //llenar los elementos del arreglo
            arreglo[i] = entrada.nextInt();
            //condicional para hacer la suma iterativa y sacar la media positiva y negativa ,e iniciar los contadores 
            if(arreglo[i]>0){
                c_media_positiva += arreglo[i];
                c_positivos++;
            }else if (arreglo[i]<0){
                c_media_negativa += arreglo[i];
                c_negativos++;
            }else{
                c_ceros++;
            }

            

        }
        if(c_positivos == 0){
            System.out.println("no se ingresaron numeros positivos ");
        }else{
            System.out.println("la media positiva es :"+(double)c_media_positiva/c_positivos+" "+"y la cantidad de elementos positivos fueron "+ " "+c_positivos+"\n");
        }
        if(c_negativos == 0){
            System.out.println("no se ingresaron numeros negativos  ");
        }else{
            System.out.println("la media negativa es :"+(double)c_media_negativa/c_negativos+" "+"y la cantidad de elementos negativos fueron "+ " "+c_negativos);
        }
        if(c_ceros == 0){
            System.out.println("no se ingresaron ceros  ");
        }else{
            System.out.println("la cantidad de ceros fueron :"+" "+ c_ceros);
        }
        entrada.close();
    }
}
