package SAX; // Declaración del paquete 'SAX'

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;

public class Parser { 

    public static void main(String[] args) { 
        
        // Configuración de la fábrica de SAXParser
        SAXParserFactory factory = SAXParserFactory.newInstance(); // Se crea una fábrica de parsers SAX
        factory.setValidating(true); // Se configura para que realice validaciones de esquema
        
        SAXParser saxParser = null; // Declaración del objeto SAXParser
        
        try {
            saxParser = factory.newSAXParser(); // Se intenta crear una instancia de SAXParser
        } catch (ParserConfigurationException e) { // Captura de excepción si hay un error de configuración
            e.printStackTrace(); // Impresión de la traza de la excepción
        } catch (SAXException e) { // Captura de excepción si hay un error SAX
            e.printStackTrace(); // Impresión de la traza de la excepción
        }
        
        File file = new File("test.xml"); // Creación de un objeto File para representar el archivo XML
        
        try {
            saxParser.parse(file, new HandlerBase()); // Intento de analizar el archivo XML
        } catch (SAXException | IOException e) { // Captura de excepciones SAX e IO
            e.printStackTrace(); // Impresión de la traza de la excepción
        }
    }

}
