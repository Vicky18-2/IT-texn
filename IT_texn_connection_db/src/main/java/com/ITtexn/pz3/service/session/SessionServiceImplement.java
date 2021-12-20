package com.ITtexn.pz3.service.session;

import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.hall.Hall;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.ITtexn.pz3.service.session.SessionService")

public class SessionServiceImplement implements SessionService {

    @Inject
    protected SessionCreation sessionCreation;


    public SessionServiceImplement(){
        this.sessionCreation = new SessionCreation();
    }

    @WebMethod
    public List<Session> getAllSessions(){
        return sessionCreation.getAllSessions();
    }

    @WebMethod
    public Session getSession(int idSession){
        return sessionCreation.getSession(idSession);
    }

    @WebMethod
    public void insertSession(int idSession, String sessionDate, String sessionTime, Hall hall, Film film){
        sessionCreation.insertSession(idSession,sessionDate,sessionTime,hall,film);
    }

    @WebMethod
    public void updateSession(int idSession, String sessionDate,String sessionTime, Hall hall, Film film){
        sessionCreation.updateSession(idSession,sessionDate,sessionTime,hall,film);
    }

    @WebMethod
    public void deleteSession(int idSession){
        sessionCreation.deleteSession(idSession);
    }

    @WebMethod
    public int countSession(){
        return sessionCreation.countSession();
    }
}
