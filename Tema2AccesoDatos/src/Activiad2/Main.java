package Activiad2;

import java.io.FileReader;
import java.io.PushbackReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Ruta del archivo
            String ruta = "C:\\Users\\julia\\Desktop\\DAM\\Acceso a datos\\Tema 2 Flujos\\archivo.txt";

            // Crea un FileReader para leer el archivo
            FileReader fileReader = new FileReader(ruta);

            /*Instancia un objeto de tipo PushbackReader apuntando a una ruta donde tengamos localizado un fichero
			de texto. */
            // Crea un PushbackReader que utiliza el FileReader
            PushbackReader pushbackReader = new PushbackReader(fileReader);

            int caracter;

            // Lee caracteres del archivo
            while ((caracter = pushbackReader.read()) != -1) {
                System.out.print((char) caracter);

                // Simula un 'unread' poniendo el caracter de nuevo en el stream
                pushbackReader.unread(caracter);

                // Lee el caracter nuevamente
                caracter = pushbackReader.read();

                // Muestra el caracter leído después del 'unread'
                System.out.println(" Caracter despues del unread: " + (char) caracter);

                // Continúa leyendo
            }

            // Cierra el PushbackReader y el FileReader
            pushbackReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
