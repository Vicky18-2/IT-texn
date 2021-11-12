
package com.ITtexn.pz2.classes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticket", namespace = "http://nure/it-texn/pz", propOrder = {

})
public class Ticket {

    @XmlElement(name = "ticket_price", namespace = "http://nure/it-texn/pz", required = true)
    protected BigDecimal ticketPrice;
    @XmlElement(namespace = "http://nure/it-texn/pz", required = true)
    protected Session session;
    @XmlElement(namespace = "http://nure/it-texn/pz", required = true)
    protected Film film;
    @XmlElement(namespace = "http://nure/it-texn/pz", required = true)
    protected Hall hall;
    @XmlAttribute(name = "id", required = true)
    protected int id;


    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal value) {
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
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

}
