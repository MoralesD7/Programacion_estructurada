package Ats_logic.Condicionales_and_bucles;//Ejercicio 7: Pedir números hasta que se introduzca uno negativo, y calcular la media.

import javax.swing.JOptionPane;

public class Ejercicio_27 {
    public static void main(String[] args) {

        //Declaracion de variables 
        int numero , siterativa = 0,i=0;

        //solicitar el numero 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Favor de insertar un numero para la suma: "+"\n"+"para salir de la bucle digita uno negativo"));

        //ciclo
        while(numero >0){

            //iniciar el contador que sera el numero de datos que inserto
            i++;

            //Suma iterativa 
            siterativa = siterativa +numero;

            //Solicitar otro numero 
            numero = Integer.parseInt(JOptionPane.showInputDialog("Favor de insertar un numero para la suma: "));
        }
        //Mostrar el resultado de la suma 
        if (i > 0) {
            double media = (double) siterativa / i;
            JOptionPane.showMessageDialog(null, "La media de los números es: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "No se introdujeron números");
        }
    }
}
