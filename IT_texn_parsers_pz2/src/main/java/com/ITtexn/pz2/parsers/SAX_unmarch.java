package com.ITtexn.pz2.parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;


public class SAX_unmarch extends DefaultHandler {

    boolean foundId = false;
    boolean foundTicketPrice = false;
    boolean foundSessionDate = false;
    boolean foundSessionTime = false;
    boolean foundFilmTitle = false;
    boolean foundFilmDuration = false;
    boolean foundFilmDirector = false;
    boolean foundFilmDescription = false;
    boolean foundFilmGenre = false;
    boolean foundFilmLanguage = false;
    boolean foundHallType = false;
    boolean foundHallColumnId = false;
    boolean foundHallSeatId = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        System.out.println("---------------------------");
        System.out.println("Start Element :" + qName);

        if (qName.equals("id")) {
            foundId = true;
        }

        if (qName.equals("ticket_price")) {
            foundTicketPrice = true;
        }

        if (qName.equals("session_date")) {
            foundSessionDate = true;
        }

        if (qName.equals("session_time")) {
            foundSessionTime = true;
        }

        if (qName.equals("title")) {
            foundFilmTitle = true;
        }

        if (qName.equals("director")) {
            foundFilmDuration = true;
        }

        if (qName.equals("film_duration")) {
            foundFilmDirector = true;
        }

        if (qName.equals("description")) {
            foundFilmDescription = true;
        }

        if (qName.equals("genre")) {
            foundFilmGenre = true;
        }

        if (qName.equals("language")) {
            foundFilmLanguage = true;
        }

        if (qName.equals("hall_type")) {
            foundHallType = true;
        }

        if (qName.equals("column_id")) {
            foundHallColumnId = true;
        }

//        if (qName.equals("session_date")) {
//            foundHallSeatId = true;
//        }

        if (qName.equalsIgnoreCase("seat_id")) {
            foundHallSeatId = true;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        System.out.println("End Element :" + qName);
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        System.out.println("characters :");

        if (foundId) {
            System.out.println("Ticket id : " + new String(ch, start, length));
            foundId = false;
        }

        if (foundTicketPrice) {
            System.out.println("ticket price : " + new String(ch, start, length));
            foundTicketPrice = false;
        }

        if (foundSessionDate) {
            System.out.println("Session date : " + new String(ch, start, length));
            foundSessionDate = false;
        }

        if (foundSessionTime) {
            System.out.println("Session time : " + new String(ch, start, length));
            foundSessionTime = false;
        }

        if (foundFilmTitle) {
            System.out.println("Film title : " + new String(ch, start, length));
            foundFilmTitle = false;
        }

        if (foundFilmDuration) {
            System.out.println("Film duration : " + new String(ch, start, length));
            foundFilmDuration = false;
        }

        if (foundFilmDirector) {
            System.out.println("Film director : " + new String(ch, start, length));
            foundFilmDirector = false;
        }

        if (foundFilmDescription) {
            System.out.println("Film Description : " + new String(ch, start, length));
            foundFilmDescription = false;
        }

        if (foundFilmGenre) {
            System.out.println("Film genre : " + new String(ch, start, length));
            foundFilmGenre = false;
        }

        if (foundFilmLanguage) {
            System.out.println("Film Language : " + new String(ch, start, length));
            foundFilmLanguage = false;
        }

        if (foundHallType) {
            System.out.println("Hall Type : " + new String(ch, start, length));
            foundHallType = false;
        }

        if (foundHallColumnId) {
            System.out.println("Hall column id : " + new String(ch, start, length));
            foundHallColumnId = false;
        }

        if (foundHallSeatId) {
            System.out.println("Hall seat id: " + new String(ch, start, length));
            foundHallSeatId = false;
        }

    }

    public static void SAX_demarch() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser saxParser = spf.newSAXParser();

        DefaultHandler handler = new SAX_unmarch();

        File XMLfile = new File("TicketJavaJAXB.xml");
        saxParser.parse(XMLfile,handler);
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        SAX_demarch();
    }
}


