
package com.ITtexn.pz2.classes;

import com.ITtexn.pz2.classes.Ticket;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticket"
})
@XmlRootElement(name = "tickets", namespace = "http://nure/it-texn/pz")
public class Tickets {

    @XmlElement(namespace = "http://nure/it-texn/pz", required = true)
    protected List<Ticket> ticket;

    public List<Ticket> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<Ticket>();
        }
        return this.ticket;
    }

}
