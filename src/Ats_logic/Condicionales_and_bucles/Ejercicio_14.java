package Ats_logic.Condicionales_and_bucles;/*Ejercicio 5 – Salario semanal de un obrero
si trabaja 40 horas o menos se le paga $16 por hora 
si trabaja mas de 40 horas se le paga $16 por cada hora ,pero $20 mas por cada hora extra 
*/
import java.util.*;
public class Ejercicio_14 {
    public static void main(String[] args) {
        //declaracion de variables 
        int cantidad_h,salario_bonus,horas_extra;
        Scanner entrada = new Scanner(System.in);

        //entrada de datos 
        System.out.println("Digita la cantidad de horas trabajadas:");
        cantidad_h = entrada.nextInt();

        //Condicional 
        if(cantidad_h>=40){
            System.out.println("Digite la cantidad de horas extra que trabajo:");
            horas_extra = entrada.nextInt();
            salario_bonus = (cantidad_h * 16) + (horas_extra*20);
            /*en el caso de que no se tengan que digitar las horas extra
             * se le restan a las horas trabajadas 40 , y esa cantidad *20
             */
            System.out.println("el sueldo total del obrero es :"+ salario_bonus);
        }else{
            salario_bonus = cantidad_h * 16;
            System.out.println("el sueldo total del obrero es :"+ salario_bonus);
        }

        entrada.close();
        
    }
}
