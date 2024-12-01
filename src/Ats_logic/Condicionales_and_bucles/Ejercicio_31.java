package Ats_logic.Condicionales_and_bucles;//Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares.

public class Ejercicio_31 {
    public static void main(String[] args) {
        //Declarar variable 
        int numero = 1,miterativa = 1;
        //Ciclo
        for(int i =0;i<=9;i++){
            miterativa *= numero;
            numero +=2;
            
        }
        System.out.println("\n"+"El resultado de la multiplicacion es :"+miterativa);
        

    }
}
