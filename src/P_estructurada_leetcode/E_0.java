package P_estructurada_leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class E_0 {
    public static void main(String[] args) {
        // Obvio es el juego del ahorcado rey hay que pensar qué tenemos que hacer padre
        // Declaración de variables
        int opcion;
        // Declaración de objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Creación del arreglo de palabras
        String[] coleccion_palabras = {"omarcito", "olivia", "luisito", "victorcito", "valdivia"};
        // Obvio pedir los datos, eso es tan obvio que no diré obvio
        System.out.println("Buenas noches, bienvenido a tu jueguito de ahorcado, está padrísimo");
        System.out.println("\nEste será tu siguiente menú (Digita la opción que desees):");
        System.out.println("1. Ver las reglas del juego");
        System.out.println("2. Jugar ahorcado");
        System.out.println("3. Morir en la desolación y abandonar, gua gua pues ya, ni modo, a llorar a la llorería");

        do {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Que nunca jugaste ahorcado? JAJAJAJA ponganle 0, ahora sí deja te enseño.");
                    System.out.println("Adivina la palabra, es solo eso. Tendrás que ir poniendo de letra en letra. Si le atinas, ¡qué padre! Si no, llora.");
                    System.out.println("PS: son nombres de personas. Tienes 6 intentos para adivinar el nombre.");
                    break;

                case 2:
                    // Seleccionar la palabra
                    int posicion_seleccionada = (int) (Math.random() * 5); // valores entre 0-4
                    String palabra = coleccion_palabras[posicion_seleccionada]; // palabra seleccionada
                    int long_palabra = palabra.length(); // longitud de la palabra

                    // Progreso del jugador
                    char[] progreso = new char[long_palabra];
                    for (int i = 0; i < long_palabra; i++) {
                        progreso[i] = '_';
                    }

                    // ArrayList para letras ingresadas
                    ArrayList<Character> letrasIngresadas = new ArrayList<>();

                    // Instrucciones
                    System.out.println("Te daremos una pequeña pista, tampoco soy tan cruel.");
                    System.out.println("La longitud del nombre es: " + long_palabra);
                    System.out.println("Progreso: " + new String(progreso));

                    // Variables del juego
                    int vidas = 6;
                    boolean adivinar = false;
                    int aciertos = 0;

                    do {
                        System.out.println("Digita la letra que crees que contiene el nombre:");
                        char letra = sc.next().charAt(0);

                        // Verificar si ya se ingresó esa letra
                        if (letrasIngresadas.contains(letra)) {
                            System.out.println("Ya ingresaste esa letra. Intenta otra.");
                            continue;
                        }
                        letrasIngresadas.add(letra);

                        // Verificar si la letra está en la palabra
                        int C_letras_indicadas = 0;
                        for (int i = 0; i < long_palabra; i++) {
                            if (letra == palabra.charAt(i)) {
                                if (progreso[i] == '_') { // Verifica que no se repitan aciertos
                                    progreso[i] = letra;
                                    aciertos++;
                                    C_letras_indicadas++;
                                }
                            }
                        }

                        if (C_letras_indicadas > 0) {
                            System.out.println("¡Bien! La letra aparece " + C_letras_indicadas + " vez/veces.");
                        } else {
                            System.out.println("La letra no fue encontrada. Pierdes una vida.");
                            vidas--;
                        }

                        // Mostrar progreso
                        System.out.println("Progreso: " + new String(progreso));

                        // Dibujar el ahorcado según vidas restantes
                        if (vidas == 5) {
                            System.out.println("_ _ _ ");
                            System.out.println("|   |");
                            System.out.println("|   ø ");
                            System.out.println("|");
                            System.out.println("|");
                        } else if (vidas == 4) {
                            System.out.println("_ _ _ ");
                            System.out.println("|   |");
                            System.out.println("|   ø ");
                            System.out.println("|   | ");
                            System.out.println("|");
                        } else if (vidas == 3) {
                            System.out.println("_ _ _ ");
                            System.out.println("|   |");
                            System.out.println("|   ø ");
                            System.out.println("|  /|");
                            System.out.println("|");
                        } else if (vidas == 2) {
                            System.out.println("_ _ _ ");
                            System.out.println("|   |");
                            System.out.println("|   ø ");
                            System.out.println("|  /|/ ");
                            System.out.println("|");
                        } else if (vidas == 1) {
                            System.out.println("_ _ _ ");
                            System.out.println("|   |");
                            System.out.println("|   ø ");
                            System.out.println("|  /|/ ");
                            System.out.println("|  / ");
                        } else if (vidas == 0) {
                            System.out.println("_ _ _ ");
                            System.out.println("|   |");
                            System.out.println("|   ø ");
                            System.out.println("|  /|/ ");
                            System.out.println("|  / /");
                            System.out.println("Nunca le atinaste, eres malísimo.");
                        }

                        // Verificar si ganó
                        if (aciertos == palabra.length()) {
                            adivinar = true;
                            System.out.println("¡Le atinaste, wuiiii!");
                        }

                    } while (vidas != 0 && !adivinar);

                    // Mostrar la palabra al final del juego
                    if (!adivinar) {
                        System.out.println("El nombre era: " + palabra);
                    }
                    break;

                case 3:
                    System.out.println("Saliste, ve a llorar con tu mamá :b");
                    break;

                default:
                    System.out.println("Digita alguna de las opciones, por favor amigo.");
            }
        } while (opcion != 3);
    }
}
