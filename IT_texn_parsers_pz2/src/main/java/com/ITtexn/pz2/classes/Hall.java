
package com.ITtexn.pz2.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hall", namespace = "http://nure/it-texn/pz", propOrder = {
    "hallType",
    "columnId",
    "seatId"
})
public class Hall {

    @XmlElement(name = "hall_type", namespace = "http://nure/it-texn/pz", required = true)
    protected String hallType;
    @XmlElement(name = "column_id", namespace = "http://nure/it-texn/pz")
    protected int columnId;
    @XmlElement(name = "seat_id", namespace = "http://nure/it-texn/pz", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String seatId;

    public String getHallType() {
        return hallType;
    }

    public void setHallType(String value) {
        this.hallType = value;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int value) {
        this.columnId = value;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String value) {
        this.seatId = value;
    }

}
