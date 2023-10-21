package StreamTokenizer;

import java.io.*;

public class streamTokenizer {

	public static void main(String[] args) {

		StreamTokenizer streamTokenizer = new StreamTokenizer(
		         new StringReader("Hola mi edad es 45"));
		    try {
		         while(streamTokenizer.nextToken() != 
		StreamTokenizer.TT_EOF){ //TT_EOF: indica el final del fichero
		         if(streamTokenizer.ttype == StreamTokenizer.TT_WORD) { //TT_WORD:  indica que el token es de tipo palabra o un conjunto de letras
		             System.out.println(streamTokenizer.sval);
		         } else if(streamTokenizer.ttype ==
		StreamTokenizer.TT_NUMBER) { //TT_NUMBER: indica que el token evaluado es un número o una asociación de ellos.
		             System.out.println(streamTokenizer.nval);
		         } else if(streamTokenizer.ttype ==
		StreamTokenizer.TT_EOL) { //TT_EOL: indica el final de la línea 
		             System.out.println();

		         }
		       }
		    } catch (IOException e) {
		       e.printStackTrace();
		    }

	}

}
