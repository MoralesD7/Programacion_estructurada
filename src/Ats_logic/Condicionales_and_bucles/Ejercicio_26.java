package Ats_logic.Condicionales_and_bucles;//pedir  numeros hasta que se teclee un 0 mostrar la suma de todos los numeros introducidos

import javax.swing.JOptionPane;

public class Ejercicio_26 {
    public static void main(String[] args) {

        //Declaracion de variables 
        int numero , siterativa = 0;

        //solicitar el numero 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Favor de insertar un numero para la suma: "+"\n"+"para salir de la bucle digita 0 "));

        //ciclo
        while(numero !=0){

            //Suma iterativa 
            siterativa = siterativa +numero;

            //Solicitar otro numero 
            numero = Integer.parseInt(JOptionPane.showInputDialog("Favor de insertar un numero para la suma: "));
        }
        //Mostrar el resultado de la suma 
        JOptionPane.showMessageDialog(null,"la suma de los numeros es :"+siterativa);
    }
}
