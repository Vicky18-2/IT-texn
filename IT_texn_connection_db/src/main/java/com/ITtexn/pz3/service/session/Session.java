
package com.ITtexn.pz3.service.session;

import com.ITtexn.pz3.service.film.Film;
import com.ITtexn.pz3.service.hall.Hall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;



//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "session", namespace = "http://nure/it-texn/pz", propOrder = {
//    "sessionDate",
//    "sessionTime",
//    "sessionDateAndTime"
//})
public class Session {

    protected int idSession;

    protected String  sessionDate;

    protected String sessionTime;

    private Hall hall;

    private Film film;

    public Session() {

    }

    public Session(int idSession, String sessionDate, String sessionTime, Hall hall, Film film) {
        this.idSession = idSession;
        this.film = film;
        this.sessionDate = sessionDate;
        this.sessionTime = sessionTime;
        this.hall = hall;
    }

    @Override
    public String toString() {
        return "Session{" +
                "idSession=" + idSession +
                ", sessionDate=" + sessionDate +
                ", sessionTime='" + sessionTime + '\'' +
                ", hall=" + hall +
                ", film=" + film +
                '}';
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }
    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String value) {
        this.sessionDate = value;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String value) {
        this.sessionTime = value;
    }

    public Hall getHall() {
        return hall;
    }

    public Film getFilm() {
        return film;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

}
