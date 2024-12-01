package Ats_logic.Condicionales_and_bucles;

import javax.swing.JOptionPane;

public class Ejercicio_25 {
    public static void main(String[] args) {
        // Declarar variables
        int numero, grandom, i = 1;  // Iniciar i en 1 para contar el primer intento

        // Generar el número aleatorio
        grandom = (int) Math.floor(Math.random() * 101);

        // Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "¡Bienvenido! Trata de adivinar un número entre 0 y 100.");

        // Solicitar un número
        numero = Integer.parseInt(JOptionPane.showInputDialog("Favor de insertar un número:"));

        // Ciclo para pedir número hasta que sea el correcto o se acaben los intentos
        while (i < 10 && numero != grandom) {
            // Pistas
            if (numero < grandom) {
                JOptionPane.showMessageDialog(null, "El número es mayor, inserta un valor más grande.");
            } else {
                JOptionPane.showMessageDialog(null, "El número es menor, inserta un valor más pequeño.");
            }

            // Incrementar contador de intentos
            i++;

            // Solicitar otro número de nuevo
            numero = Integer.parseInt(JOptionPane.showInputDialog("Favor de insertar un número:"));
        }

        // Mensaje por si logra adivinar el número o no
        if (numero == grandom) {
            JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado el número " + grandom + "\nLa cantidad de veces que lo has intentado es: " + i);
        } else {
            JOptionPane.showMessageDialog(null, "No lo has conseguido en 10 intentos. ¡Mejor suerte la próxima vez!");
        }
    }
}
