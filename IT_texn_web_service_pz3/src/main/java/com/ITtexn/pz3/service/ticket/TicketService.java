package com.ITtexn.pz3.service.ticket;

import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.hall.Hall;
import com.ITtexn.pz3.service.session.Session;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface TicketService {

    @WebMethod
    List<Session> getAllTickets();

    @WebMethod
    Session getTicket(int idSession);

    @WebMethod
    void insertTicket(int idSession, String sessionDate, String sessionTime, Hall hall, Film film);

    @WebMethod
    void updateTicket(int idSession, String sessionDate,String sessionTime, Hall hall, Film film);

    @WebMethod
    void deleteTicket(int idSession);

    @WebMethod
    int countTicket();
}
