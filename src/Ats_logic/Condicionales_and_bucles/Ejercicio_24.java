package Ats_logic.Condicionales_and_bucles;/*Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.*/

import javax.swing.JOptionPane;

public class Ejercicio_24 {
    public static void main(String[] args) {
        //Declaracion de variables 
        int numero,i=0;

        //Solicitar el numero
        numero = Integer.parseInt(JOptionPane.showInputDialog("Favor de digitar un numero:"));

        //Ciclo
        while (numero>=0) {
            i++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Favor de digitar un numero:"));
        }
        //Mostrar la cantidad de veces que se han ingresado numeros
        JOptionPane.showMessageDialog(null,"la cantidad de veces que se han insertado numeros es :"+i);
        
    }
}
