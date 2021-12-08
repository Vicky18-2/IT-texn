
package com.ITtexn.pz3.service;

import com.ITtexn.pz3.service.hall.Hall;
import com.ITtexn.pz3.service.session.Session;
import com.ITtexn.pz3.service.ticket.Ticket;
import com.ITtexn.pz3.service.film.Film;

import javax.xml.bind.annotation.XmlRegistry;



@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    public Tickets createTickets() {
        return new Tickets();
    }

    public Ticket createTicket() {
        return new Ticket();
    }

    public Session createSession() {
        return new Session();
    }

    public Hall createHall() {
        return new Hall();
    }

    public Film createFilm() {
        return new Film();
    }

}
