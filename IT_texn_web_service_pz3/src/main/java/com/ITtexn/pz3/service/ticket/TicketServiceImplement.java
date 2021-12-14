package com.ITtexn.pz3.service.ticket;

import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.hall.Hall;
import com.ITtexn.pz3.service.session.Session;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.ITtexn.pz3.service.ticket.TicketService")

public class TicketServiceImplement implements TicketService {

    @Inject
    protected TicketCreation ticketCreation;

    public TicketServiceImplement(){
        this.ticketCreation = new TicketCreation();
    }

    @WebMethod
    public List<Ticket> getAllTickets(){
        return ticketCreation.getAllTickets();
    };

    @WebMethod
    public Ticket getTicket(int idTicket){
        return ticketCreation.getTicket(idTicket);
    };

    @WebMethod
    public void insertTicket(int ticketPrice, Session session, Film film, Hall hall, int idTicket, int idSeat, int idColumn, boolean ticketStatus  ){
        ticketCreation.insertTicket(ticketPrice,session,film,hall,idTicket,idSeat,idColumn,ticketStatus);
    };

    @WebMethod
    public void updateTicket(int ticketPrice, Session session, Film film, Hall hall, int idTicket, int idSeat, int idColumn, boolean ticketStatus  ){
        ticketCreation.updateTicket(ticketPrice,session,film,hall,idTicket, idSeat,idColumn,ticketStatus);
    };

    @WebMethod
    public void deleteTicket(int idTicket){
        ticketCreation.deleteTicket(idTicket);
    };

    @WebMethod
    public int countTicket(){
        return ticketCreation.countTicket();
    };

}
