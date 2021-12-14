
package com.ITtexn.pz3.client.ticket_cl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ITtexn.pz3.client.ticket_cl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CountTicketResponse_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "countTicketResponse");
    private final static QName _GetAllTicketsResponse_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "getAllTicketsResponse");
    private final static QName _DeleteTicket_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "deleteTicket");
    private final static QName _GetAllTickets_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "getAllTickets");
    private final static QName _InsertTicket_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "insertTicket");
    private final static QName _DeleteTicketResponse_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "deleteTicketResponse");
    private final static QName _GetTicket_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "getTicket");
    private final static QName _UpdateTicket_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "updateTicket");
    private final static QName _CountTicket_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "countTicket");
    private final static QName _GetTicketResponse_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "getTicketResponse");
    private final static QName _InsertTicketResponse_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "insertTicketResponse");
    private final static QName _UpdateTicketResponse_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "updateTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ITtexn.pz3.client.ticket_cl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertTicket }
     * 
     */
    public InsertTicket createInsertTicket() {
        return new InsertTicket();
    }

    /**
     * Create an instance of {@link DeleteTicket }
     * 
     */
    public DeleteTicket createDeleteTicket() {
        return new DeleteTicket();
    }

    /**
     * Create an instance of {@link GetAllTickets }
     * 
     */
    public GetAllTickets createGetAllTickets() {
        return new GetAllTickets();
    }

    /**
     * Create an instance of {@link GetAllTicketsResponse }
     * 
     */
    public GetAllTicketsResponse createGetAllTicketsResponse() {
        return new GetAllTicketsResponse();
    }

    /**
     * Create an instance of {@link CountTicketResponse }
     * 
     */
    public CountTicketResponse createCountTicketResponse() {
        return new CountTicketResponse();
    }

    /**
     * Create an instance of {@link GetTicketResponse }
     * 
     */
    public GetTicketResponse createGetTicketResponse() {
        return new GetTicketResponse();
    }

    /**
     * Create an instance of {@link InsertTicketResponse }
     * 
     */
    public InsertTicketResponse createInsertTicketResponse() {
        return new InsertTicketResponse();
    }

    /**
     * Create an instance of {@link UpdateTicketResponse }
     * 
     */
    public UpdateTicketResponse createUpdateTicketResponse() {
        return new UpdateTicketResponse();
    }

    /**
     * Create an instance of {@link CountTicket }
     * 
     */
    public CountTicket createCountTicket() {
        return new CountTicket();
    }

    /**
     * Create an instance of {@link DeleteTicketResponse }
     * 
     */
    public DeleteTicketResponse createDeleteTicketResponse() {
        return new DeleteTicketResponse();
    }

    /**
     * Create an instance of {@link GetTicket }
     * 
     */
    public GetTicket createGetTicket() {
        return new GetTicket();
    }

    /**
     * Create an instance of {@link UpdateTicket }
     * 
     */
    public UpdateTicket createUpdateTicket() {
        return new UpdateTicket();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link Hall }
     * 
     */
    public Hall createHall() {
        return new Hall();
    }

    /**
     * Create an instance of {@link Film }
     * 
     */
    public Film createFilm() {
        return new Film();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "countTicketResponse")
    public JAXBElement<CountTicketResponse> createCountTicketResponse(CountTicketResponse value) {
        return new JAXBElement<CountTicketResponse>(_CountTicketResponse_QNAME, CountTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTicketsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "getAllTicketsResponse")
    public JAXBElement<GetAllTicketsResponse> createGetAllTicketsResponse(GetAllTicketsResponse value) {
        return new JAXBElement<GetAllTicketsResponse>(_GetAllTicketsResponse_QNAME, GetAllTicketsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "deleteTicket")
    public JAXBElement<DeleteTicket> createDeleteTicket(DeleteTicket value) {
        return new JAXBElement<DeleteTicket>(_DeleteTicket_QNAME, DeleteTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTickets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "getAllTickets")
    public JAXBElement<GetAllTickets> createGetAllTickets(GetAllTickets value) {
        return new JAXBElement<GetAllTickets>(_GetAllTickets_QNAME, GetAllTickets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "insertTicket")
    public JAXBElement<InsertTicket> createInsertTicket(InsertTicket value) {
        return new JAXBElement<InsertTicket>(_InsertTicket_QNAME, InsertTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "deleteTicketResponse")
    public JAXBElement<DeleteTicketResponse> createDeleteTicketResponse(DeleteTicketResponse value) {
        return new JAXBElement<DeleteTicketResponse>(_DeleteTicketResponse_QNAME, DeleteTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "getTicket")
    public JAXBElement<GetTicket> createGetTicket(GetTicket value) {
        return new JAXBElement<GetTicket>(_GetTicket_QNAME, GetTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "updateTicket")
    public JAXBElement<UpdateTicket> createUpdateTicket(UpdateTicket value) {
        return new JAXBElement<UpdateTicket>(_UpdateTicket_QNAME, UpdateTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "countTicket")
    public JAXBElement<CountTicket> createCountTicket(CountTicket value) {
        return new JAXBElement<CountTicket>(_CountTicket_QNAME, CountTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "getTicketResponse")
    public JAXBElement<GetTicketResponse> createGetTicketResponse(GetTicketResponse value) {
        return new JAXBElement<GetTicketResponse>(_GetTicketResponse_QNAME, GetTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "insertTicketResponse")
    public JAXBElement<InsertTicketResponse> createInsertTicketResponse(InsertTicketResponse value) {
        return new JAXBElement<InsertTicketResponse>(_InsertTicketResponse_QNAME, InsertTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ticket.service.pz3.ITtexn.com/", name = "updateTicketResponse")
    public JAXBElement<UpdateTicketResponse> createUpdateTicketResponse(UpdateTicketResponse value) {
        return new JAXBElement<UpdateTicketResponse>(_UpdateTicketResponse_QNAME, UpdateTicketResponse.class, null, value);
    }

}
