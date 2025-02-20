package P_estructurada_leetcode;

import java.util.Scanner;

public class E_8 {
    public static void main(String[] args) {
        //variables
        int n_cantidad ,v_aux=0;
        int [] arreglo = {1,1,2,2,3,3,5,4,4};
        boolean ver;

        System.out.println("El programa te ayudara a determinar si hay un numero que no tiene pareja");
        /*for( int i = 0 ; i < arreglo.length ; i++){
            ver=false;
            for ( int j = 0 ; j < arreglo.length ; j++){
                if(i != j ){
                    if(arreglo[i] == arreglo[j]){
                        ver = true;
                    }
                }
            }
            if (!ver) {
                v_aux = arreglo[i];
            }
        }*/
        int aux = 0;
        for( int i = 0 ; i < arreglo.length ; i++) {
            boolean pareja = false;
            for (int j = 0; j < arreglo.length; j++) {
                if(arreglo[i] == arreglo[j] && i != j ){
                    pareja = true ;
                }
                if(j == arreglo.length-1 && !pareja){
                    aux = arreglo[i];
                }
            }
        }

        System.out.println("EL numero que no se repite es " + aux);
 }
}
