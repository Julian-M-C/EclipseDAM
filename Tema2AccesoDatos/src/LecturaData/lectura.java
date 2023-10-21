package LecturaData;

import java.io.*;

public class lectura {

	public static void main(String[] args) {
	
		try {
			
		
		DataInputStream dataInputStream =
		          new DataInputStream(
		                            new
		FileInputStream("C:\\\\Users\\\\julia\\\\eclipse-workspace\\\\Tema2AccesoDatos\\\\src\\\\PushbakReader\\\\ficheroBinario.data"));
		    int   entero     = dataInputStream.readInt();
		    float numeroFloat = dataInputStream.readFloat();
		    long  numeroLong    = dataInputStream.readLong();
		    dataInputStream.close();
		    System.out.println("El numero entero es: " + entero);
		    System.out.println("El objeto de tipo float es: " + numeroFloat);
		    System.out.println("El objeto long es: " + numeroLong);
		    
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
