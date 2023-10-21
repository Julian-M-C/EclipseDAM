package Video1EscrituraFicheros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ficheros {

	public static void main(String[] args) {
		
		
		try {
			
			/*Definimos nuestro objeto e instanciamos el mismo. Le indicamos el fichero creado anteriormente.
			  Primer parámetro ruta del fichero, segundo parámetro el método de acceso en este cado "r"(lectura)*/
			RandomAccessFile file = new RandomAccessFile("C:\\Users\\julia\\eclipse-workspace\\Tema1_AccesoAdatos\\src\\Video1EscrituraFicheros\\salida.txt", "r");
			//Con el método seek posicionamos el puntero en el byte 8
			file.seek(8);
			//Nos devuelve la posición
			long filePointer = file.getFilePointer();
			//Leer un byte en esa posición
			int unByte = file.read();
			
			//La convertimos a caracter y mostramos por pantalla
			System.out.println((char)unByte);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
