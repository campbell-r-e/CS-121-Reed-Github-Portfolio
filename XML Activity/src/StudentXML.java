// Activity 38
// Created by Campbell Reed
// This activity goes though an XML file and prints data from the file to the
// user. 
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class StudentXML {
    public static void main(String[] args) {
        try{
            File input = new File("student_record.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(input);
            System.out.println("Root Element:" + doc.getDocumentElement().getNodeName());
            NodeList RecordList = doc.getElementsByTagName("student");
            for(int i = 0; i<RecordList.getLength();i++){
                Node node = RecordList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("ID:" + element.getAttribute("id"));
                    System.out.println("First Name:" + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name:" + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("major:" + element.getElementsByTagName("major").item(0).getTextContent());
                    System.out.println("gpa:" + element.getElementsByTagName("gpa").item(0).getTextContent());
                    System.out.println();
                }

            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
