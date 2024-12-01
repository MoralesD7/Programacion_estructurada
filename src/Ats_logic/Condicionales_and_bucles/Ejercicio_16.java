package Ats_logic.Condicionales_and_bucles;//Ejercicio 7 – Ordenar 3 números de mayor a menor
import javax.swing.*;
public class Ejercicio_16 {
    public static void main(String[] args) {

        //Declaracion de variables 
        int a,b,c,aux_mayor,aux_mediana,aux_menor;

        //Solicitar datos 
        a = Integer.parseInt(JOptionPane.showInputDialog("favor de ingresar el primer numero "));
        b = Integer.parseInt(JOptionPane.showInputDialog("favor de ingresar el primer numero "));
        c = Integer.parseInt(JOptionPane.showInputDialog("favor de ingresar el primer numero "));

        //Condicional 
        if (a>b && a>c){
            aux_mayor = a;
            if(b > c){

                aux_mediana = b;
                aux_menor = c;
                JOptionPane.showMessageDialog(null, "el orden de los numeros acomodados de mayor a menor es :"+aux_mayor+" "+aux_mediana+" "+aux_menor);

            }else{
                //c > b entonces :
                aux_mediana =c;
                aux_menor = b;
                JOptionPane.showMessageDialog(null, "el orden de los numeros acomodados de mayor a menor es :"+aux_mayor+" "+aux_mediana+" "+aux_menor);
            }

        }else if (b>a && b>c){
            aux_mayor = b;
            if(a > c){

                aux_mediana = a;
                aux_menor = c;
                JOptionPane.showMessageDialog(null, "el orden de los numeros acomodados de mayor a menor es :"+aux_mayor+" "+aux_mediana+" "+aux_menor);

            }else{
                //c > a entonces :
                aux_mediana =c;
                aux_menor = a;
                JOptionPane.showMessageDialog(null, "el orden de los numeros acomodados de mayor a menor es :"+aux_mayor+" "+aux_mediana+" "+aux_menor);
            }
        }else if (c > a && c > b){

            aux_mayor = c;
            if(a > b){

                aux_mediana = a;
                aux_menor = b;
                JOptionPane.showMessageDialog(null, "el orden de los numeros acomodados de mayor a menor es :"+aux_mayor+" "+aux_mediana+" "+aux_menor);

            }else{
                //b > a entonces :
                aux_mediana =b;
                aux_menor = a;
                JOptionPane.showMessageDialog(null, "el orden de los numeros acomodados de mayor a menor es :"+aux_mayor+" "+aux_mediana+" "+aux_menor);
            }

        }else{
            JOptionPane.showMessageDialog(null, "favor de digitar 3 numeros distintos ");
        }


    }
}
