package DataInputStream;

import java.io.*;

public class dataInputStream {

	public static void main(String[] args) {
		
		try {
		    DataInputStream dataInputStream = new DataInputStream(
		         new
		FileInputStream("C:\\\\\\\\Users\\\\\\\\julia\\\\\\\\eclipse-workspace\\\\\\\\Tema2AccesoDatos\\\\\\\\src\\\\\\\\PushbakReader\\\\\\\\ficheroBinario.data"));
		    int    aByte   = dataInputStream.read();
		    int    anInt   = dataInputStream.readInt();
		    float  aFloat  = dataInputStream.readFloat();
		    double aDouble = dataInputStream.readDouble();
		    System.out.println("Byte: " + aByte);
		    System.out.println("Int: " + anInt);
		    System.out.println("Float: " + aFloat);
		    System.out.println("Double: " + aDouble);
		    dataInputStream.close();
		}   catch (FileNotFoundException e) {
		      e.printStackTrace();
		} catch (IOException e) {
		     e.printStackTrace();
		}

	}

}
