package com.ITtexn.pz3.service.session;

import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.hall.Hall;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SessionCreation {

    private List<Session> sessionList;

    public SessionCreation(){

        sessionList = new ArrayList<>();
        Film film = new Film();
        Hall hall= new Hall();
        sessionList.add(new Session(1,"10-10-2000","01:01:01",hall,film));
    }

    public List<Session> getAllSessions(){
        return sessionList;
    }

    public Session getSession(int idSession){
        for (Session session:sessionList){
            if(session.getIdSession() == idSession) {
                return session;
            }
        }
        return null;
    }

    public void insertSession(int idSession, String sessionDate,String sessionTime, Hall hall, Film film){
        for(Session session : sessionList){
            if (session.getIdSession() == idSession){
                session.setSessionDate(sessionDate);
                session.setSessionTime(sessionTime);
                session.setFilm(film);
                session.setHall(hall);
            }
        }
    }

    public void updateSession(int idSession, String sessionDate,String sessionTime, Hall hall, Film film){
        Session session = new Session(idSession,sessionDate,sessionTime,hall,film);
        sessionList.add(session);
    }

    public void deleteSession(int idSession){
        int index = sessionList.lastIndexOf(getSession(idSession));
        sessionList.remove(index);
    }

    public int countSession(){
        return sessionList.size();
    }
}
