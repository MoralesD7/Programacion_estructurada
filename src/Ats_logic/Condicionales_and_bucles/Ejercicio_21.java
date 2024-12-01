package Ats_logic.Condicionales_and_bucles;//leer un numero y mostrar su cuadrado , repetir el proceso hasta que se introduzca un numero negativo

import javax.swing.JOptionPane;

public class Ejercicio_21 {
    public static void main(String[] args) {

        //Declaracion de variables 
        double numero , elevado;    
        numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero para que se muestre su cuadrado:"));
        //Ciclo
        while(numero>=0){
            //Elevar el numero 
            elevado = Math.pow(numero,2);
            //Mostrar el numero 
            JOptionPane.showMessageDialog(null, "el numero elevado al cuadrado es :"+elevado);
            //Pedir otro numero 
            numero =  Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para que se muestre su cuadrado:"+"\n"+"para salir del bucle coloca un negativo "));
        }
    }
}
