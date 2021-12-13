
package com.ITtexn.pz3.client.sessions_cl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hall">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hallType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idHall" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seatQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hall", propOrder = {
    "columnQuantity",
    "hallType",
    "idHall",
    "seatQuantity"
})
public class Hall {

    protected int columnQuantity;
    protected String hallType;
    protected int idHall;
    protected int seatQuantity;

    @Override
    public String toString() {
        return "Hall{" +
                "columnQuantity=" + columnQuantity +
                ", hallType='" + hallType + '\'' +
                ", idHall=" + idHall +
                ", seatQuantity=" + seatQuantity +
                '}';
    }

    /**
     * Gets the value of the columnQuantity property.
     * 
     */
    public int getColumnQuantity() {
        return columnQuantity;
    }

    /**
     * Sets the value of the columnQuantity property.
     * 
     */
    public void setColumnQuantity(int value) {
        this.columnQuantity = value;
    }

    /**
     * Gets the value of the hallType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHallType() {
        return hallType;
    }

    /**
     * Sets the value of the hallType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHallType(String value) {
        this.hallType = value;
    }

    /**
     * Gets the value of the idHall property.
     * 
     */
    public int getIdHall() {
        return idHall;
    }

    /**
     * Sets the value of the idHall property.
     * 
     */
    public void setIdHall(int value) {
        this.idHall = value;
    }

    /**
     * Gets the value of the seatQuantity property.
     * 
     */
    public int getSeatQuantity() {
        return seatQuantity;
    }

    /**
     * Sets the value of the seatQuantity property.
     * 
     */
    public void setSeatQuantity(int value) {
        this.seatQuantity = value;
    }

    public Hall(int idHall, String hallType, int columnQuantity, int seatQuantity) {
        this.hallType = hallType;
        this.columnQuantity = columnQuantity;
        this.seatQuantity = seatQuantity;
        this.idHall = idHall;
    }

    public Hall(){

    }

}
