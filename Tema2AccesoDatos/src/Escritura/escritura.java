package Escritura;

import java.io.*;

public class escritura {

	public static void main(String[] args) {
		
		try {
			
		
		    DataOutputStream dataOutputStream = new DataOutputStream(
		         new
		FileOutputStream("C:\\Users\\julia\\eclipse-workspace\\Tema2AccesoDatos\\src\\PushbakReader\\ficheroBinario.data"));
		    dataOutputStream.writeInt(123);
		    dataOutputStream.writeFloat(123.45F);
		    dataOutputStream.writeLong(789);
		    dataOutputStream.writeBytes("Holaaaa!!!");
		    dataOutputStream.close();

		    
	    DataInputStream dataInputStream =
		          new DataInputStream(
		                            new
		FileInputStream("C:\\\\Users\\\\julia\\\\eclipse-workspace\\\\Tema2AccesoDatos\\\\src\\\\PushbakReader\\\\ficheroBinario.data"));
		    int   entero     = dataInputStream.readInt();
		    float numeroFloat = dataInputStream.readFloat();
		    long  numeroLong    = dataInputStream.readLong();
		    String cadena = dataInputStream.readLine();
		    dataInputStream.close();
		    System.out.println("El numero entero es: " + entero);
		    System.out.println("El objeto de tipo float es: " + numeroFloat);
		    System.out.println("El objeto long es: " + numeroLong);
		    System.out.println("El objeto byte es: " + cadena);
		} catch (IOException e) {
			 e.printStackTrace();
		}
	}
}