package ArrayCaracteres;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class writerAndReader {

	public static void main(String[] args) {
		
		CharArrayWriter charArrayWriter = new CharArrayWriter();
		CharArrayReader charArrayReader;
		
		int data = 0;
		try {
			charArrayWriter.write("hola amigo2");
			charArrayWriter.close();
			
			charArrayReader = new CharArrayReader(charArrayWriter.toCharArray());
			data = charArrayReader.read();
			while (data != -1) {
				//operaciones
				System.out.println((char)data);
				data = charArrayReader.read();			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
