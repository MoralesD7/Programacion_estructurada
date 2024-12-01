package Ats_logic.Condicionales_and_bucles;//Condicionales

public class Ejercicio_9 {
    public static void main(String[] args) {
        int condicion =5;
        //Condicional if 
        if(condicion<0){
            System.out.println("es menor a 0 ");
        }else {
            System.out.println("es mayor a 0");
        }
        switch (condicion) {
            case 1:
                    System.out.println("presionaste el numero 1 wuii");
                break;
        
            default:
                    System.out.println("presionaste otro numero ");
                break;
        }
        /*
        La condición a evaluar (condición booleana)
        El valor si la condición es verdadera (valor verdadero)
        El valor si la condición es falsa (valor falso)
         */
        int edad = 20;

        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println(mensaje);
    }
}
