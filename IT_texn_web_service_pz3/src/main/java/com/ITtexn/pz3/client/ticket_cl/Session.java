
package com.ITtexn.pz3.client.ticket_cl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for session complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="session">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="film" type="{http://ticket.service.pz3.ITtexn.com/}film" minOccurs="0"/>
 *         &lt;element name="hall" type="{http://ticket.service.pz3.ITtexn.com/}hall" minOccurs="0"/>
 *         &lt;element name="idSession" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sessionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "session", propOrder = {
    "film",
    "hall",
    "idSession",
    "sessionDate",
    "sessionTime"
})
public class Session {

    protected Film film;
    protected Hall hall;
    protected int idSession;
    protected String sessionDate;
    protected String sessionTime;

    public Session(Film film, Hall hall, int idSession, String sessionDate, String sessionTime) {
        this.film = film;
        this.hall = hall;
        this.idSession = idSession;
        this.sessionDate = sessionDate;
        this.sessionTime = sessionTime;
    }

    public Session(){

    }

    @Override
    public String toString() {
        return "Session{" +
                "film=" + film +
                ", hall=" + hall +
                ", idSession=" + idSession +
                ", sessionDate='" + sessionDate + '\'' +
                ", sessionTime='" + sessionTime + '\'' +
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
     * Gets the value of the idSession property.
     * 
     */
    public int getIdSession() {
        return idSession;
    }

    /**
     * Sets the value of the idSession property.
     * 
     */
    public void setIdSession(int value) {
        this.idSession = value;
    }

    /**
     * Gets the value of the sessionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionDate() {
        return sessionDate;
    }

    /**
     * Sets the value of the sessionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionDate(String value) {
        this.sessionDate = value;
    }

    /**
     * Gets the value of the sessionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionTime() {
        return sessionTime;
    }

    /**
     * Sets the value of the sessionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionTime(String value) {
        this.sessionTime = value;
    }

}
