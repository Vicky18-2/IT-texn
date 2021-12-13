package com.ITtexn.pz3.service.ticket;

import com.ITtexn.pz3.client.film_cl.Genre;
import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.hall.Hall;
import com.ITtexn.pz3.service.session.Session;

import javax.jws.WebMethod;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TicketCreation {

    private List<Ticket> ticketList;

    public TicketCreation(){
        ticketList = new ArrayList<>();
        Session session= new Session();
        ArrayList<String> dir = new ArrayList<>();
        dir.add("Director");
        Film film = new Film(5, "NEWFILMTICKET", dir, "01:11:11", "String", com.ITtexn.pz3.service.genre.Genre.fromValue("Mystery"), "Tyy");
        Hall hall= new Hall(1,"5D",1,1);
        ticketList.add(new Ticket(200,session,film,hall,1));
    }

    public List<Ticket> getAllTickets(){
        return ticketList;
    };

    public Ticket getTicket(int idTicket){
        for(Ticket ticket:ticketList){
            if(ticket.getId() == idTicket ){
                return ticket;
            }
        }
        return  null;
    };

    public void insertTicket(int ticketPrice, Session session, Film film, Hall hall, int idTicket ){
        for(Ticket ticket: ticketList){
            if(ticket.getId() == idTicket) {
                ticket.setTicketPrice(ticketPrice);
                ticket.setFilm(film);
                ticket.setHall(hall);
                ticket.setSession(session);
            }
        }
    };

    public void updateTicket(int ticketPrice, Session session, Film film, Hall hall, int idTicket ){
        Ticket ticket = new Ticket(ticketPrice,session,film,hall,idTicket);
        ticketList.add(ticket);
    };

    public void deleteTicket(int idTicket){
        int index=ticketList.lastIndexOf(getTicket(idTicket));
        ticketList.remove(index);
    };

    public int countTicket(){
        return ticketList.size();
    };

}
