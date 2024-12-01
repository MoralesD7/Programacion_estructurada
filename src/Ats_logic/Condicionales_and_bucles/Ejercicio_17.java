package Ats_logic.Condicionales_and_bucles;//Ejercicio 8 – Calcular cuántas cifras tiene un numero
import javax.swing.*;
public class Ejercicio_17 {
    public static void main(String[] args) {
        //Declaracion de variables
        String  numero;

        numero = (JOptionPane.showInputDialog("favor de digitar un numero para calcular su longitud :"));

        //Determinar la longitud del numero 
        int longitud = numero.length();

        //imprimir el resultado 
        JOptionPane.showMessageDialog(null, "la longitud de el numero "+" "+numero+" "+"es:"+ " "+longitud);
        



    }
}
