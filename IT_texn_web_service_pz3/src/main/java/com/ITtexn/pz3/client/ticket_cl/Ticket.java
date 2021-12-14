
package com.ITtexn.pz3.client.ticket_cl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="film" type="{http://ticket.service.pz3.ITtexn.com/}film" minOccurs="0"/>
 *         &lt;element name="hall" type="{http://ticket.service.pz3.ITtexn.com/}hall" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idColumn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idSeat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="session" type="{http://ticket.service.pz3.ITtexn.com/}session" minOccurs="0"/>
 *         &lt;element name="ticketPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticketStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticket", propOrder = {
    "film",
    "hall",
    "id",
    "idColumn",
    "idSeat",
    "session",
    "ticketPrice",
    "ticketStatus"
})
public class Ticket {

    protected Film film;
    protected Hall hall;
    protected int id;
    protected int idColumn;
    protected int idSeat;
    protected Session session;
    protected int ticketPrice;
    protected boolean ticketStatus;

    @Override
    public String toString() {
        return "Ticket{" +
                "film=" + film +
                ", hall=" + hall +
                ", id=" + id +
                ", idColumn=" + idColumn +
                ", idSeat=" + idSeat +
                ", session=" + session +
                ", ticketPrice=" + ticketPrice +
                ", ticketStatus=" + ticketStatus +
                '}';
    }

    /**
     * Gets the value of the film property.
     * 
     * @return
     *     possible object is
     *     {@link Film }
     *     
     */
    public Film getFilm() {
        return film;
    }

    /**
     * Sets the value of the film property.
     * 
     * @param value
     *     allowed object is
     *     {@link Film }
     *     
     */
    public void setFilm(Film value) {
        this.film = value;
    }

    /**
     * Gets the value of the hall property.
     * 
     * @return
     *     possible object is
     *     {@link Hall }
     *     
     */
    public Hall getHall() {
        return hall;
    }

    /**
     * Sets the value of the hall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hall }
     *     
     */
    public void setHall(Hall value) {
        this.hall = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the idColumn property.
     * 
     */
    public int getIdColumn() {
        return idColumn;
    }

    /**
     * Sets the value of the idColumn property.
     * 
     */
    public void setIdColumn(int value) {
        this.idColumn = value;
    }

    /**
     * Gets the value of the idSeat property.
     * 
     */
    public int getIdSeat() {
        return idSeat;
    }

    /**
     * Sets the value of the idSeat property.
     * 
     */
    public void setIdSeat(int value) {
        this.idSeat = value;
    }

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setSession(Session value) {
        this.session = value;
    }

    /**
     * Gets the value of the ticketPrice property.
     * 
     */
    public int getTicketPrice() {
        return ticketPrice;
    }

    /**
     * Sets the value of the ticketPrice property.
     * 
     */
    public void setTicketPrice(int value) {
        this.ticketPrice = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     */
    public boolean isTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     */
    public void setTicketStatus(boolean value) {
        this.ticketStatus = value;
    }

}
