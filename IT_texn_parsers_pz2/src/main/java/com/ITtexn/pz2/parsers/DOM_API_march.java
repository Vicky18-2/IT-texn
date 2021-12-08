package com.ITtexn.pz2.parsers;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;


public class DOM_API_march {

    public static String toStringXML(String[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append(' ');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(' ').toString();
            b.append(" ");
        }
    }

    public static String valueInputStream() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input the quantity of tickets you will have:");
        int quantity = in.nextInt();
        String outputXML = "";
        String[] rootBody = new String[quantity];
        for(int i=0; i<quantity; i++) {
            System.out.println("Input the ticket_id");
            int id = in.nextInt();
            System.out.println("Input the ticket_price");
            BigDecimal ticketPrice = in.nextBigDecimal();

            System.out.println("Input the session date in the following format: YYYY-MM-DD");
            String sessionDate = in.next();

            System.out.println("Input the session time in the following format: HH:MM:SS");
            String sessionTime = in.next();


            System.out.println("Input the film duration in the format: HH:MM:SS");
            String filmDuration = in.next();

            System.out.println("Input the film name");
            String title = in.next();
            System.out.println("Input the director");
            List<String> director = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                if (Objects.equals(in.hasNext(), "kk")) {
                    break;
                } else {
                    director.add(in.next());
                }
            }

            System.out.println("Input the description");
            String description = in.next();
            System.out.println("Input the genre");
            String genre = in.next();
            System.out.println("Input the language");
            String language = in.next();

            System.out.println("Input the hall type");
            String hallType = in.next();
            System.out.println("Input the column_id");
            int columnId = in.nextInt();
            System.out.println("Input the seat_id");
            String seatId = in.next();

            rootBody[i] = "<tns:ticket" + " id='" + id + "'>\n"
                    + "<tns:ticket_price>" + ticketPrice + "</tns:ticket_price>\n"
                    + "<tns:session>"
                    + "\t<tns:session_date>" + sessionDate + "</tns:session_date>\n"
                    + "\t<tns:session_time>" + sessionTime + "</tns:session_time>\n"
                    + "</tns:session>\n"
                    + "<tns:film>\n"
                    + "\t<tns:title>" + title + "</tns:title>\n"
                    + "\t<tns:director>" + director + "</tns:director>\n"
                    + "\t<tns:film_duration>" + filmDuration + "</tns:film_duration>\n"
                    + "\t<tns:description>" + description + "</tns:description>\n"
                    + "\t<tns:genre>" + genre + "</tns:genre>\n"
                    + "\t<tns:language>" + language + "</tns:language>\n"
                    + "</tns:film>\n"
                    + "<tns:hall>\n"
                    + "\t<tns:hall_type>" + hallType + "</tns:hall_type>\n"
                    + "\t<tns:column_id>" + columnId + "</tns:column_id>\n"
                    + "\t<tns:seat_id>" + seatId + "</tns:seat_id>\n"
                    + "</tns:hall>\n"
                    + "</tns:ticket>\n";

        }
            outputXML = "<tickets xmlns=\"http://nure/it-texn/pz\"\n" +
                    "         xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                    "         xsi:schemaLocation=\"http://nure/it-texn/pz Ticket.xsd\"\n" +
                    "         xmlns:tns=\"http://nure/it-texn/pz\"\n>" + toStringXML(rootBody) + "</tickets>";

        return outputXML;
    }

    public static void DOMMarch() throws SAXException, ParserConfigurationException, IOException, TransformerException {


        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File("Ticket.xsd"));

        documentBuilderFactory.setNamespaceAware(true);
        documentBuilderFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        documentBuilderFactory.setFeature(Default.FEATURE__TURN_VALIDATION_ON, true);
        documentBuilderFactory.setFeature(Default.FEATURE__TURN_SCHEMA_VALIDATION_ON, true);
        documentBuilderFactory.setSchema(schema);

        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new InputSource(new StringReader(valueInputStream())));

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transf = transformerFactory.newTransformer();

        DOMSource source = new DOMSource(document);

        File myFile = new File("TicketJavaDOM.xml");

        StreamResult console = new StreamResult(System.out);
        StreamResult file = new StreamResult(myFile);

        transf.transform(source, console);
        transf.transform(source, file);
    }

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, TransformerException {
        DOMMarch();

    }

}