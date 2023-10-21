package XML; 

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPathEjemplo { 

    public static void main(String[] args) { 
        
        try {
            // Se crea un objeto File que representa la ubicación del archivo XML
            File inputFile = new File ("C:\\Users\\julia\\Desktop\\DAM\\Acceso a datos\\Tema 3 Trabajo con fichetos XML\\inputxml.txt");
            
            // Se crea una fábrica  de constructores de documentos XML
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newNSInstance();
            
            // Se crea un constructor de documentos XML
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            
            // Se intenta parsear el archivo XML
            Document doc = null;
            try {
                doc = dBuilder.parse(inputFile);
            } catch (SAXException e) {
                e.printStackTrace(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            doc.getDocumentElement().normalize(); // Se normaliza el documento
            
            // Se crea un objeto XPath para trabajar con expresiones XPath
            XPath xPath = XPathFactory.newInstance().newXPath();
            
            // Se define una expresión XPath
            String expression = "/class/student";
            
            // Se evalúa la expresión XPath en el documento XML y se obtiene una lista de nodos
            NodeList nodeList = null;
            try {
                nodeList = (NodeList) xPath.compile(expression).evaluate(
                        doc, XPathConstants.NODESET);
            } catch (XPathExpressionException e) {
                e.printStackTrace(); 
            }
            
            // Se itera sobre la lista de nodos
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nNode = nodeList.item(i);
                System.out.println("\nCurrent Element :" + nNode.getNodeName()); // Se imprime el nombre del nodo
                
                if (nNode.getNodeType()== Node.ELEMENT_NODE) {
                    Element element = (Element) nNode; // Se convierte el nodo a un elemento
                    
                    // Se imprime el atributo 'rollno' del elemento
                    System.out.println("Student roll no :" + element.getAttribute("rollno"));
                    
                    // Se imprime el contenido del elemento 'firstname'
                    System.out.println("First Name : "
                            + element
                            .getElementsByTagName("firstname")
                            .item(0)
                            .getTextContent());
                    
                    // Se imprime el contenido del elemento 'lastname'
                    System.out.println("Last Name : "
                            + element
                            .getElementsByTagName("lastname")
                            .item(0)
                            .getTextContent());
                    
                    // Se imprime el contenido del elemento 'nickname'
                    System.out.println("Nick Name : "
                            + element
                            .getElementsByTagName("nickname")
                            .item(0)
                            .getTextContent());
                    
                    // Se imprime el contenido del elemento 'marks'
                    System.out.println("Marks : "
                            + element
                            .getElementsByTagName("marks")
                            .item(0)
                            .getTextContent());
                }
            }
        } catch (ParserConfigurationException e) {
            // TODO: handle exception
        }

    }

}
