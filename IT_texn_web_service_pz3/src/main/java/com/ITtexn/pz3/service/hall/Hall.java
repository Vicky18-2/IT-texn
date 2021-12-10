
package com.ITtexn.pz3.service.hall;


//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "hall", namespace = "http://nure/it-texn/pz", propOrder = {
//    "hallType",
//    "columnId",
//    "seatId"
//})
public class Hall {

//    @XmlElement(name = "hall_type", namespace = "http://nure/it-texn/pz", required = true)
    protected String hallType;
//    @XmlElement(name = "column_id", namespace = "http://nure/it-texn/pz")
    protected int columnQuantity;
//    @XmlElement(name = "seat_id", namespace = "http://nure/it-texn/pz", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlSchemaType(name = "token")
    protected int seatQuantity;

    protected int idHall;

    public int getIdHall() {
        return idHall;
    }

    public void setIdHall(int idHall) {
        this.idHall = idHall;
    }

    public String getHallType() {
        return hallType;
    }

    public void setHallType(String value) {
        this.hallType = value;
    }

    public int getColumnQuantity() {
        return columnQuantity;
    }

    public void setColumnQuantity(int value) {
        this.columnQuantity = value;
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(int value) {
        this.seatQuantity = value;
    }

    public Hall(){

    }

    public Hall(int idHall, String hallType, int columnQuantity, int seatQuantity) {
        this.hallType = hallType;
        this.columnQuantity = columnQuantity;
        this.seatQuantity = seatQuantity;
        this.idHall = idHall;
    }
}
