package Ats_logic.Condicionales_and_bucles;//Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
import javax.swing.JOptionPane;
public class Ejercicio_18{
    public static void main(String[] args) {

        //Declaracion de variables 
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día (1-30):"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (1-12):"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

        // Verificar si la fecha es válida
        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año > 0) {
                    JOptionPane.showMessageDialog(null, "La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                } else {
                    JOptionPane.showMessageDialog(null, "El año debe ser positivo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes debe estar entre 1 y 12.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El día debe estar entre 1 y 30.");
        }
        
    }
}
