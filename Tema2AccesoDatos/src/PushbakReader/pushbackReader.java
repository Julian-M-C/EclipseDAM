package PushbakReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class pushbackReader {

	public static void main(String[] args) {
		
		try {
	        PushbackReader pushbackReader = new PushbackReader(
	                    new
	FileReader("C:\\Users\\julia\\eclipse-workspace\\Tema2AccesoDatos\\src\\PushbakReader\\pruebas2.txt"));
	        int data = pushbackReader.read();
	        System.out.println((char)data);
	        pushbackReader.unread(data);
	        data = pushbackReader.read();
	        System.out.println((char)data);

	       pushbackReader.close();

	} catch (FileNotFoundException e) {
	       e.printStackTrace();
	} catch (IOException e) {
	        e.printStackTrace();
	}

	}

}
