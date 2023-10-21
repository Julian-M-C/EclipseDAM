package Video1EscrituraFicheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploOutput {

	public static void main(String[] args) {
		
		//Definimos la ruta del fichero
		String path = "C:\\Users\\julia\\eclipse-workspace\\Tema1_AccesoAdatos\\src\\Video1EscrituraFicheros\\salida.txt";
		//Prueba de frase que vamos a escribir en el fichero
		String cadena = "Esto es una prueba de escritura";
		//Vamos a pasar la frase a array de bytes
		byte[] arrayBytes = cadena.getBytes();
		
		
		
		try {
			FileOutputStream output = new FileOutputStream(path);
			
			output.write(arrayBytes);
			output.close();
			System.out.println("Fichero escrito.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
