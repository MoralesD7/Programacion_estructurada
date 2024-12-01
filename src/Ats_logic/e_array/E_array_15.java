package Ats_logic.e_array;

import javax.swing.*;
/*
Queremos desarrollar una aplicacion que nos ayude a gestionar las notas de un crentro educativo,
cada grupo esta compuesto por 5 alumnos
muestra.
se pide leer las notas del primer  ,segundo ,y tercer trimestre de un grupo , debemos mostrar al final :la nota media en cada trimestre ,
y la media del alumno que se encuentra , en la posicion N ,(n se lee por teclado)
 */

public class E_array_15 {
    public static void main(String[] args) {

        // Creacion de variables

        int media_c_arreglo_1 = 0, media_c_arreglo_2 = 0, media_c_arreglo_3 = 0, media_c_arreglo_4 = 0,media_c_arreglo_5 = 0,total_1=0,total_2=0,total_3=0,total_4=0,total_5=0, seleccion;
        // declaracion de arreglos
        int[] alumno_1 = new int[3];
        int[] alumno_2 = new int[3];
        int[] alumno_3 = new int[3];
        int[] alumno_4 = new int[3];
        int[] alumno_5 = new int[3];
        // Mensaje kawai
        JOptionPane.showMessageDialog(null, "------------Buenas tardes--------------- \n bienvenido a tu gestor de notas de alumnos  wuii ");

        JOptionPane.showMessageDialog(null,
                "De manera confidencial sabemos que cada uno de tus grupos tiene 5 alumnos\n Asi que ahora te solicitaremos las calificaciones parciales de cada alumno");

        for (int i = 0; i < 3; i++) {
            alumno_1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita la " + (i + 1) + " nota del primer alumno"));
            media_c_arreglo_1 += alumno_1[i];
            total_1 = media_c_arreglo_1/3;
        }
        for (int i = 0; i < 3; i++) {
            alumno_2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita la " + (i + 1) + " nota del segundo alumno"));
            media_c_arreglo_2 += alumno_2[i];
            total_2= media_c_arreglo_2/3;

        }
        for (int i = 0; i < 3; i++) {
            alumno_3[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita la " + (i + 1) + " nota del tercer alumno"));
            media_c_arreglo_3 += alumno_3[i];
            total_3 = media_c_arreglo_3/3;

        }
        for (int i = 0; i < 3; i++) {
            alumno_4[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita la " + (i + 1) + " nota del cuarto alumno"));
            media_c_arreglo_4 += alumno_4[i];
            total_4 = media_c_arreglo_4/3;

        }
        for (int i = 0; i < 3; i++) {
            alumno_5[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita la " + (i + 1) + " nota del quinto alumno"));
            media_c_arreglo_5 += alumno_5[i];
            total_5 = media_c_arreglo_5/3;

        }


        do{
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("Digita el alumno del que quieras saber el promedio:\nSi quieres salir inserta 0"));
            switch (seleccion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "El promedio de tu primer alumno es :" + total_1);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El promedio de tu primer alumno es :" + total_2);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El promedio de tu primer alumno es :" + total_3);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El promedio de tu primer alumno es :" + total_4);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El promedio de tu primer alumno es :" + total_5);
                    break;
    
                default:
                    if(seleccion>5){
                        JOptionPane.showMessageDialog(null, "Ese alumno no existe ,digita un rango del 1-5");
                    }else{break;}
            }
        }while(seleccion!=0);

    }
}
