
package com.ITtexn.pz3.client.ticket_cl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TicketServiceImplementService", targetNamespace = "http://ticket.service.pz3.ITtexn.com/", wsdlLocation = "http://localhost:7777/ticket?wsdl")
public class TicketServiceImplementService
    extends Service
{

    private final static URL TICKETSERVICEIMPLEMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException TICKETSERVICEIMPLEMENTSERVICE_EXCEPTION;
    private final static QName TICKETSERVICEIMPLEMENTSERVICE_QNAME = new QName("http://ticket.service.pz3.ITtexn.com/", "TicketServiceImplementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7777/ticket?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TICKETSERVICEIMPLEMENTSERVICE_WSDL_LOCATION = url;
        TICKETSERVICEIMPLEMENTSERVICE_EXCEPTION = e;
    }

    public TicketServiceImplementService() {
        super(__getWsdlLocation(), TICKETSERVICEIMPLEMENTSERVICE_QNAME);
    }

    public TicketServiceImplementService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TICKETSERVICEIMPLEMENTSERVICE_QNAME, features);
    }

    public TicketServiceImplementService(URL wsdlLocation) {
        super(wsdlLocation, TICKETSERVICEIMPLEMENTSERVICE_QNAME);
    }

    public TicketServiceImplementService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TICKETSERVICEIMPLEMENTSERVICE_QNAME, features);
    }

    public TicketServiceImplementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TicketServiceImplementService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TicketService
     */
    @WebEndpoint(name = "TicketServiceImplementPort")
    public TicketService getTicketServiceImplementPort() {
        return super.getPort(new QName("http://ticket.service.pz3.ITtexn.com/", "TicketServiceImplementPort"), TicketService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TicketService
     */
    @WebEndpoint(name = "TicketServiceImplementPort")
    public TicketService getTicketServiceImplementPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ticket.service.pz3.ITtexn.com/", "TicketServiceImplementPort"), TicketService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TICKETSERVICEIMPLEMENTSERVICE_EXCEPTION!= null) {
            throw TICKETSERVICEIMPLEMENTSERVICE_EXCEPTION;
        }
        return TICKETSERVICEIMPLEMENTSERVICE_WSDL_LOCATION;
    }

}
