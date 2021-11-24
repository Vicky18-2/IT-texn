package com.ITtexn.pz2.parsers;

import com.ITtexn.pz2.classes.*;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Time;

public class JAXB_API_march {

    public static void JAXB_march() throws JAXBException, ParseException, SAXException {

        Scanner in = new Scanner(System.in);
        System.out.println("Input the quantity of tickets you will have:");
        int quantity = in.nextInt();

        Tickets tickets = new Tickets();
        Ticket ticket = new Ticket();
        Session session = new Session();
        Film film = new Film();
        Hall hall = new Hall();
        List<Ticket> ticket_list = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Input the ticket_id");
            ticket.setId(in.nextInt());
            System.out.println("Input the ticket_price");
            ticket.setTicketPrice(in.nextBigDecimal());


            System.out.println("Input the session date in the following format: YYYY-MM-DD");
            String sessionDate = in.next();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(sessionDate);
            session.setSessionDate(date);

            System.out.println("Input the session time in the following format: HH:MM:SS");
            session.setSessionTime(in.next());

            System.out.println("Input the film duration in the format: HH:MM:SS");
            film.setFilmDuration(in.next());

            System.out.println("Input the film name");
            film.setTitle(in.next());
            System.out.println("Input the director");
            List<String> director = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                if (Objects.equals(in.hasNext(), "kk")) {
                    break;
                } else {
                    director.add(in.next());
                }
            }
            film.setDirector(director);

            System.out.println("Input the description");
            film.setDescription(in.next());
            System.out.println("Input the genre");
            film.setGenre(in.next());
            System.out.println("Input the language");
            film.setLanguage(in.next());

            System.out.println("Input the hall type");
            hall.setHallType(in.next());
            System.out.println("Input the column_id");
            hall.setColumnId(in.nextInt());
            System.out.println("Input the seat_id");
            hall.setSeatId(in.next());

            ticket.setFilm(film);
            ticket.setHall(hall);
            ticket.setSession(session);
            ticket_list.add(ticket);

        }

        tickets.setTicket(ticket_list);

        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File("Ticket.xsd"));

        JAXBContext context_tickets = JAXBContext.newInstance(Tickets.class);
        Marshaller mar_tickets = context_tickets.createMarshaller();
        mar_tickets.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar_tickets.setSchema(schema);
        mar_tickets.marshal(tickets, new File("./TicketJavaJAXB.xml"));

    }

    public static void main(String[] args) throws DatatypeConfigurationException, JAXBException, IOException, ParseException, SAXException {
        JAXB_march();
    }
}
