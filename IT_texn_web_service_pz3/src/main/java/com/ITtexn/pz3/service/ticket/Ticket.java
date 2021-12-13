
package com.ITtexn.pz3.service.ticket;

import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.hall.Hall;
import com.ITtexn.pz3.service.session.Session;




public class Ticket {


    protected int ticketPrice;

    protected Session session;

    protected Film film;

    protected Hall hall;

    protected int idTicket;


    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int value) {
        this.ticketPrice = value;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session value) {
        this.session = value;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film value) {
        this.film = value;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall value) {
        this.hall = value;
    }

    public int getId() {
        return idTicket;
    }

    public void setId(int value) {
        this.idTicket = value;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketPrice=" + ticketPrice +
                ", session=" + session +
                ", film=" + film +
                ", hall=" + hall +
                ", id=" + idTicket +
                '}';
    }

    public Ticket(int ticketPrice, Session session, Film film, Hall hall, int idTicket) {
        this.ticketPrice = ticketPrice;
        this.session = session;
        this.film = film;
        this.hall = hall;
        this.idTicket = idTicket;
    }

    public Ticket(){

    }
}
