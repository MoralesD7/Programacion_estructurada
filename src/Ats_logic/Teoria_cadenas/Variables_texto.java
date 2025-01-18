package Ats_logic.Teoria_cadenas;
//Paquete para la entrada y salida de texto
import java.io.*;

public class Variables_texto {
    public static void main(String[] args) throws IOException {
        System.out.println("Digita una cadena :");

        //Importante identificar que se hace en el flujo de un Scanner
        String cadena = "";

        //obtengo la cadena
        InputStreamReader entrada = new InputStreamReader(System.in);

        //almaceno la cadena en el buffer
        BufferedReader  almacenamiento = new BufferedReader(entrada);

        try {
            cadena = almacenamiento.readLine();
        } catch (IOException e) {};
        System.out.println("Muestro la cadena :"+ cadena);
    }

}
