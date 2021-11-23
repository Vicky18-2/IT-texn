
package com.ITtexn.pz2.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "session", namespace = "http://nure/it-texn/pz", propOrder = {
    "sessionDate",
    "sessionTime",
    "sessionDateAndTime"
})
public class Session {

    @XmlElement(name = "session_date", namespace = "http://nure/it-texn/pz")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sessionDate;
    @XmlElement(name = "session_time", namespace = "http://nure/it-texn/pz")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sessionTime;
    @XmlElement(name = "session_date_and_time", namespace = "http://nure/it-texn/pz")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sessionDateAndTime;


    public XMLGregorianCalendar getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(XMLGregorianCalendar value) {
        this.sessionDate = value;
    }

    public XMLGregorianCalendar getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(XMLGregorianCalendar value) {
        this.sessionTime = value;
    }

    public XMLGregorianCalendar getSessionDateAndTime() {
        return sessionDateAndTime;
    }

    public void setSessionDateAndTime(XMLGregorianCalendar value) {
        this.sessionDateAndTime = value;
    }

}
