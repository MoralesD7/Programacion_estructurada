package Ats_logic.Condicionales_and_bucles;/*
 La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final.     Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
 */
import java.util.*;
public class Ejercicio_5 {

    public static void main(String[] args) {
        
        //Declaracion de variables 
        double cal_examen_1,cal_examen_2,cal_examen_3,participacion;
        double p_examen_1,p_examen_2,p_examen_3,p_participacion;
        double total ; 

        Scanner entrada = new Scanner (System.in);

        //solicitar los datos 
        System.out.println("Ingrese la calificacion de los examenes y las participaciones respectivamente :");
        cal_examen_1 = entrada.nextDouble();
        cal_examen_2 = entrada.nextDouble();
        cal_examen_3 = entrada.nextDouble();
        participacion = entrada.nextDouble();

        //Determinar calificacion final 
        p_participacion = participacion *.1;
        p_examen_1 = cal_examen_1*(.25);
        p_examen_2 = cal_examen_2*(.25);
        p_examen_3 = cal_examen_3*(.40);
        total = p_participacion + p_examen_1 + p_examen_2 +p_examen_3;


        //imprimir los resultados 
        System.out.println("la calificacion final es : "+ total);
        entrada.close();

    }
}