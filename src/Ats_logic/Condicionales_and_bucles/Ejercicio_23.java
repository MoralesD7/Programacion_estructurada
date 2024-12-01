package Ats_logic.Condicionales_and_bucles;//Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.

import javax.swing.JOptionPane;

public class Ejercicio_23 {
    public static void main(String[] args) {
        //Declaracion de variables 
        int numero ;

        //solicitar el dato 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para determinar si es par o impar "));

        //ciclo
        while (numero!=0) {
            //Verificar si es par 
            if(numero%2==0){
                JOptionPane.showMessageDialog(null, "el numero es par ");
            }else{  
                //si no es par es impar 
                JOptionPane.showMessageDialog(null, "el numero es impar ");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para determinar si es par o impar "));
        }
    }
}
