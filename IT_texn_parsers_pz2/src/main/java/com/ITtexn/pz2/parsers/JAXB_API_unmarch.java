package com.ITtexn.pz2.parsers;

import com.ITtexn.pz2.classes.Ticket;
import com.ITtexn.pz2.classes.Tickets;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JAXB_API_unmarch {

    public static void JAXB_unmarch() throws JAXBException, SAXException {


        JAXBContext jaxbContext = JAXBContext.newInstance(Tickets.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File("Ticket.xsd"));
        jaxbUnmarshaller.setSchema(schema);


        Tickets tickets = (Tickets) jaxbUnmarshaller.unmarshal(new File("TicketJavaJAXB.xml"));
        System.out.println(tickets.getTicket());

    }

    public static void main(String[] args) throws JAXBException, FileNotFoundException, SAXException {
        JAXB_unmarch();
    }


}
