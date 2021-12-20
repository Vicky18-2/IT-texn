package com.ITtexn.pz3.service.ticket;

import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.hall.Hall;
import com.ITtexn.pz3.service.session.Session;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.math.BigDecimal;
import java.util.List;

@WebService
public interface TicketService {

    @WebMethod
    List<Ticket> getAllTickets();

    @WebMethod
    Ticket getTicket(int idTicket);

    @WebMethod
    void insertTicket(int ticketPrice, Session session, Film film, Hall hall, int idTicket, int idSeat, int idColumn, boolean ticketStatus );

    @WebMethod
    void updateTicket(int ticketPrice, Session session, Film film, Hall hall, int idTicket, int idSeat, int idColumn, boolean ticketStatus  );

    @WebMethod
    void deleteTicket(int idTicket);

    @WebMethod
    int countTicket();
}
