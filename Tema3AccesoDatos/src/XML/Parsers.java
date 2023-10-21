package XML; // Declaración del paquete en el que se encuentra la clase.

import java.io.File; // Importación de la clase File para manejar archivos.
import java.io.IOException; // Importación de la excepción IOException para manejar errores de entrada/salida.

import javax.xml.parsers.DocumentBuilder; // Importación de la interfaz DocumentBuilder para construir objetos Document.
import javax.xml.parsers.DocumentBuilderFactory; // Importación de la fábrica DocumentBuilderFactory para obtener instancias de DocumentBuilder.
import javax.xml.parsers.ParserConfigurationException; // Importación de la excepción ParserConfigurationException para manejar errores de configuración del parser.

import org.w3c.dom.Document; // Importación de la interfaz Document para representar documentos XML.
import org.xml.sax.SAXException; // Importación de la excepción SAXException para manejar errores en el proceso de parseo.

public class Parsers {
    public static void main(String[] args) {
        // Creación de una instancia de DocumentBuilderFactory para obtener un DocumentBuilder.
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true); // Habilita la validación del documento XML.
        factory.setIgnoringElementContentWhitespace(true); // Ignora los espacios en blanco dentro de los elementos XML.

        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder(); // Intenta obtener un DocumentBuilder a partir de la fábrica.
        } catch (ParserConfigurationException e) {
            e.printStackTrace(); // Si ocurre un error de configuración, imprime la traza de la excepción.
        }

        // Especificación de la ubicación del archivo XML a parsear.
        File file = new File("C:\\Users\\julia\\Desktop\\DAM\\Acceso a datos\\Tema 3 Trabajo con fichetos XML\\prueba.xml");
        
        try {
            Document doc = builder.parse(file); // Intenta parsear el archivo XML y obtener un objeto Document.
        } catch (SAXException e) {
            e.printStackTrace(); // Si ocurre un error de SAX (Simple API for XML), imprime la traza de la excepción.
        } catch (IOException e) {
            e.printStackTrace(); // Si ocurre un error de entrada/salida, imprime la traza de la excepción.
        }
    }
}
