
package com.ITtexn.pz2.classes;

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
