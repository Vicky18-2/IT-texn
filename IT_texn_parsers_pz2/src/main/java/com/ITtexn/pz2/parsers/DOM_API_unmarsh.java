package com.ITtexn.pz2.parsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;


public class DOM_API_unmarsh {



    public static void DOM_unmarch(InputStream input, Schema schema) throws ParserConfigurationException, IOException, SAXException {

        File inputfile = new File("Ticket.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setNamespaceAware(true);
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document document = dBuilder.parse(inputfile);
        document.getDocumentElement().normalize();

        dbFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        dbFactory.setFeature(Default.FEATURE__TURN_VALIDATION_ON, true);
        dbFactory.setFeature(Default.FEATURE__TURN_SCHEMA_VALIDATION_ON, true);
        dbFactory.setSchema(schema);


        Document root = dBuilder.parse(input);
        System.out.println("Main element: " + root.getDocumentElement().getNodeName());
        NodeList nodeList = root.getElementsByTagName("tns:ticket");
        System.out.println();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("\nCurrent element:" + node.getNodeName());

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Ticket ID:" + element.getAttribute("id"));
                System.out.println("Ticket price: " + element.getElementsByTagName("tns:ticket_price").item(0).getTextContent());
                System.out.println("Session date: " + element.getElementsByTagName("tns:session_date").item(0).getTextContent());
                System.out.println("Session time: " + element.getElementsByTagName("tns:session_time").item(0).getTextContent());
                System.out.println("Film name: " + element.getElementsByTagName("tns:title").item(0).getTextContent());
                System.out.println("Film director: " + element.getElementsByTagName("tns:director").item(0).getTextContent());
                System.out.println("Film duration: " + element.getElementsByTagName("tns:film_duration").item(0).getTextContent());
                System.out.println("Film description: " + element.getElementsByTagName("tns:description").item(0).getTextContent());
                System.out.println("Film genre: " + element.getElementsByTagName("tns:genre").item(0).getTextContent());
                System.out.println("Film language: " + element.getElementsByTagName("tns:language").item(0).getTextContent());
                System.out.println("Hall type: " + element.getElementsByTagName("tns:hall_type").item(0).getTextContent());
                System.out.println("Hall column_id: " + element.getElementsByTagName("tns:column_id").item(0).getTextContent());
                System.out.println("Hall seat_id: " + element.getElementsByTagName("tns:seat_id").item(0).getTextContent());

            }

        }
    }

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File("Ticket.xsd"));
        InputStream in = new FileInputStream("Ticket.xml");
        DOM_unmarch(in, schema);

    }

}
