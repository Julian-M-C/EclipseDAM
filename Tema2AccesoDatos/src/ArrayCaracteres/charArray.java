package ArrayCaracteres;

import java.io.CharArrayReader;
import java.io.IOException;

public class charArray {

	public static void main(String[] args) {
		
		char[] chars = "hola amigo".toCharArray();
		CharArrayReader charArrayReader = new CharArrayReader(chars);
		int data = 0;
		try {
		        data = charArrayReader.read();
		       while(data != -1) {
		                //OPERACIONES
		              System.out.println((char)data);
		             data = charArrayReader.read();
		        }
		} catch (IOException e) {
		        e.printStackTrace();
		}
		charArrayReader.close();

	}

}
