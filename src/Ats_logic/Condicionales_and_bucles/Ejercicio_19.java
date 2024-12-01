package Ats_logic.Condicionales_and_bucles;//Calculadora aritmetica

import javax.swing.JOptionPane;

public class Ejercicio_19 {
    public static void main(String[] args) {
    //Declaracion de variables 
    String condicion;
    int num_1,num_2,total;

    //Entrada de datos 
    condicion = JOptionPane.showInputDialog("Favor de seleccionar la opcion que desea"+"\n"+"S o s (Suma)"+"\n"+"R o r (Resta)"+"\n"+"M o m (Multiplicacion)"+"\n"+"D o d(Division)");
    switch (condicion) {
        //Suma 
        case "S":
        case "s":
                //ingreso de datos 
                num_1 = Integer.parseInt(JOptionPane.showInputDialog("favor de digitar el primer numero:"));
                num_2 = Integer.parseInt(JOptionPane.showInputDialog("favor de digitar el primer numero:"));
                //operacion
                total = num_1 + num_2;
                JOptionPane.showMessageDialog(null,"el resultado de la operacion es :"+ total);

            break;
        //Resta 
        case "R":
        case "r":
                //ingreso de datos 
                num_1 = Integer.parseInt(JOptionPane.showInputDialog("favor de digitar el primer numero:"));
                num_2 = Integer.parseInt(JOptionPane.showInputDialog("favor de digitar el primer numero:"));
                //operacion
                total = num_1 - num_2;
                JOptionPane.showMessageDialog(null,"el resultado de la operacion es :"+ total);

            break;
        //Multiplicacion
        case "M":
        case "m":
            //ingreso de datos 
            num_1 = Integer.parseInt(JOptionPane.showInputDialog("favor de digitar el primer numero:"));
            num_2 = Integer.parseInt(JOptionPane.showInputDialog("favor de digitar el primer numero:"));
            //operacion
            total = num_1 * num_2;
            JOptionPane.showMessageDialog(null,"el resultado de la operacion es :"+ total);

        break;
        //Division
        case "D":
        case "d":
                //ingreso de datos 
                num_1 = Integer.parseInt(JOptionPane.showInputDialog("favor de digitar el primer numero:"));
                num_2 = Integer.parseInt(JOptionPane.showInputDialog("favor de digitar el primer numero:"));
                //operacion
                total = num_1/ num_2;
                JOptionPane.showMessageDialog(null,"el resultado de la operacion es :"+ total);

            break;

        default:
            JOptionPane.showMessageDialog(null,"Favor de ingresar alguna de las opciones :b");
            break;
        

        }     
    }
}
