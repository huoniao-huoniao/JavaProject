package designmodel.createmodel.simpleFactory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

    public static String getChartType() {

        try {

            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("designmodel\\createmodel\\simpleFactory\\config.xml"));

            NodeList n1 = doc.getElementsByTagName("chartType");

            Node classNode = n1.item(0).getFirstChild();

            String chartType = classNode.getNodeValue();

            return chartType;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}