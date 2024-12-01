package Ats_logic.Condicionales_and_bucles;//Leer un numero e indicar si es positivo o negativo ,el proceso se repetira hasta que se introduzca un 0
import javax.swing.JOptionPane;

public class Ejercicio_22 {
    public static void main(String[] args) {

        //Declaracion de variables 
        double numero;    

        //Solicitar el numero 
        numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero para que se muestre si es positivo o negativo"));

        //Ciclo
        while(numero!=0){

            if(numero >0){
                //Verificar si es positivo  
            JOptionPane.showMessageDialog(null, "el numero es positivo ");
            }else{
                //Verificar si es negativo 
                JOptionPane.showMessageDialog(null, "el numero es negativo ");
            }
            numero =  Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero "));
            
        }
        
    }
}
