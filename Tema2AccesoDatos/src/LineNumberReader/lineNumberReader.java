package LineNumberReader;

import java.io.*;

public class lineNumberReader {

	public static void main(String[] args) {
		
		try {
		    LineNumberReader lineNumberReader =
		           new LineNumberReader(new
		FileReader("C:\\\\Users\\\\julia\\\\eclipse-workspace\\\\Tema2AccesoDatos\\\\src\\\\PushbakReader\\\\pruebas2.txt"));
		    String line = lineNumberReader.readLine();
		    while(line != null) {
		           System.out.println("Contenido de la linea numero:"+ 
		lineNumberReader.getLineNumber());
		       System.out.println(line);
		       line = lineNumberReader.readLine();
		    }
		    lineNumberReader.close();
		}   catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
