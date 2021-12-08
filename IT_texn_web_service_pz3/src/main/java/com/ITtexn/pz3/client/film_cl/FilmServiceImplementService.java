
package com.ITtexn.pz3.client.film_cl;

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
@WebServiceClient(name = "FilmServiceImplementService", targetNamespace = "http://film.service.pz3.ITtexn.com/", wsdlLocation = "http://localhost:7777/film?wsdl")
public class FilmServiceImplementService
    extends Service
{

    private final static URL FILMSERVICEIMPLEMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException FILMSERVICEIMPLEMENTSERVICE_EXCEPTION;
    private final static QName FILMSERVICEIMPLEMENTSERVICE_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "FilmServiceImplementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7777/film?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FILMSERVICEIMPLEMENTSERVICE_WSDL_LOCATION = url;
        FILMSERVICEIMPLEMENTSERVICE_EXCEPTION = e;
    }

    public FilmServiceImplementService() {
        super(__getWsdlLocation(), FILMSERVICEIMPLEMENTSERVICE_QNAME);
    }

    public FilmServiceImplementService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FILMSERVICEIMPLEMENTSERVICE_QNAME, features);
    }

    public FilmServiceImplementService(URL wsdlLocation) {
        super(wsdlLocation, FILMSERVICEIMPLEMENTSERVICE_QNAME);
    }

    public FilmServiceImplementService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FILMSERVICEIMPLEMENTSERVICE_QNAME, features);
    }

    public FilmServiceImplementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FilmServiceImplementService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FilmService
     */
    @WebEndpoint(name = "FilmServiceImplementPort")
    public FilmService getFilmServiceImplementPort() {
        return super.getPort(new QName("http://film.service.pz3.ITtexn.com/", "FilmServiceImplementPort"), FilmService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FilmService
     */
    @WebEndpoint(name = "FilmServiceImplementPort")
    public FilmService getFilmServiceImplementPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://film.service.pz3.ITtexn.com/", "FilmServiceImplementPort"), FilmService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FILMSERVICEIMPLEMENTSERVICE_EXCEPTION!= null) {
            throw FILMSERVICEIMPLEMENTSERVICE_EXCEPTION;
        }
        return FILMSERVICEIMPLEMENTSERVICE_WSDL_LOCATION;
    }

}
