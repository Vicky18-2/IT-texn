
package com.ITtexn.pz3.service;

import com.ITtexn.pz3.service.ticket.Ticket;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticket"
})
@XmlRootElement(name = "tickets", namespace = "http://nure/it-texn/pz")
public class Tickets {

    protected List<Ticket> ticket;

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }

    public List<Ticket> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<Ticket>();
        }
        return this.ticket;
    }
//    @XmlElement(namespace = "http://nure/it-texn/pz", required = true)
}
