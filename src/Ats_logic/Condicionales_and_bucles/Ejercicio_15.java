package Ats_logic.Condicionales_and_bucles;/* Ejercicio 6 – Determinar si 2 números son pares o impares
uso de swing 
*/ 
import javax.swing.JOptionPane;
public class Ejercicio_15 {
    public static void main(String[] args) {
        //Declaracion de variables 
        int num_1, num_2; 

        //Solicitar los datos 
        num_1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer  numero :"));
        num_2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero :"));

        //Condicional 
        if( (num_1 % 2 == 0) && (num_2 %2 ==0)){
            JOptionPane.showMessageDialog(null,"Ambos numeros son pares");
        }else if ((num_1 % 2 == 0) && (num_2 %2 !=0)) {
            JOptionPane.showMessageDialog(null,"el numero "+ " "+num_1 +"es par ,el  otro es impar ");
        }else if ((num_1 % 2 != 0) && (num_2 % 2 ==0)) {
            JOptionPane.showMessageDialog(null,"el numero "+ " "+num_2 +"es par ,el  otro es impar  ");
        }else {
            JOptionPane.showMessageDialog(null,"ambos numeros son impares");
        }
        

    }
}
