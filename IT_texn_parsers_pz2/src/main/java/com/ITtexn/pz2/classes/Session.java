
package com.ITtexn.pz2.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "session", namespace = "http://nure/it-texn/pz", propOrder = {
    "sessionDate",
    "sessionTime",
    "sessionDateAndTime"
})
public class Session {

    @XmlElement(name = "session_date", namespace = "http://nure/it-texn/pz")
    @XmlSchemaType(name = "date")
    protected Date sessionDate;
    @XmlElement(name = "session_time", namespace = "http://nure/it-texn/pz")
    @XmlSchemaType(name = "time")
    protected String sessionTime;
    @XmlElement(name = "session_date_and_time", namespace = "http://nure/it-texn/pz")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sessionDateAndTime;

    @Override
    public String toString() {
        return "Session{" +
                "sessionDate=" + sessionDate +
                ", sessionTime='" + sessionTime + '\'' +
                ", sessionDateAndTime=" + sessionDateAndTime +
                '}';
    }

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date value) {
        this.sessionDate = value;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String value) {
        this.sessionTime = value;
    }

    public XMLGregorianCalendar getSessionDateAndTime() {
        return sessionDateAndTime;
    }

    public void setSessionDateAndTime(XMLGregorianCalendar value) {
        this.sessionDateAndTime = value;
    }

}
