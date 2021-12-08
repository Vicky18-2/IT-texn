
package com.ITtexn.pz3.client.film_cl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ITtexn.pz3.client package. 
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

    private final static QName _DeleteFilmResponse_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "deleteFilmResponse");
    private final static QName _InsertFilm_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "insertFilm");
    private final static QName _UpdateFilm_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "updateFilm");
    private final static QName _GetAllFilmsResponse_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "getAllFilmsResponse");
    private final static QName _DeleteFilm_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "deleteFilm");
    private final static QName _CountFilms_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "countFilms");
    private final static QName _GetFilm_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "getFilm");
    private final static QName _GetFilmResponse_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "getFilmResponse");
    private final static QName _UpdateFilmResponse_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "updateFilmResponse");
    private final static QName _CountFilmsResponse_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "countFilmsResponse");
    private final static QName _GetAllFilms_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "getAllFilms");
    private final static QName _InsertFilmResponse_QNAME = new QName("http://film.service.pz3.ITtexn.com/", "insertFilmResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ITtexn.pz3.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllFilms }
     * 
     */
    public GetAllFilms createGetAllFilms() {
        return new GetAllFilms();
    }

    /**
     * Create an instance of {@link InsertFilmResponse }
     * 
     */
    public InsertFilmResponse createInsertFilmResponse() {
        return new InsertFilmResponse();
    }

    /**
     * Create an instance of {@link CountFilmsResponse }
     * 
     */
    public CountFilmsResponse createCountFilmsResponse() {
        return new CountFilmsResponse();
    }

    /**
     * Create an instance of {@link GetFilmResponse }
     * 
     */
    public GetFilmResponse createGetFilmResponse() {
        return new GetFilmResponse();
    }

    /**
     * Create an instance of {@link UpdateFilmResponse }
     * 
     */
    public UpdateFilmResponse createUpdateFilmResponse() {
        return new UpdateFilmResponse();
    }

    /**
     * Create an instance of {@link GetFilm }
     * 
     */
    public GetFilm createGetFilm() {
        return new GetFilm();
    }

    /**
     * Create an instance of {@link CountFilms }
     * 
     */
    public CountFilms createCountFilms() {
        return new CountFilms();
    }

    /**
     * Create an instance of {@link DeleteFilm }
     * 
     */
    public DeleteFilm createDeleteFilm() {
        return new DeleteFilm();
    }

    /**
     * Create an instance of {@link GetAllFilmsResponse }
     * 
     */
    public GetAllFilmsResponse createGetAllFilmsResponse() {
        return new GetAllFilmsResponse();
    }

    /**
     * Create an instance of {@link UpdateFilm }
     * 
     */
    public UpdateFilm createUpdateFilm() {
        return new UpdateFilm();
    }

    /**
     * Create an instance of {@link DeleteFilmResponse }
     * 
     */
    public DeleteFilmResponse createDeleteFilmResponse() {
        return new DeleteFilmResponse();
    }

    /**
     * Create an instance of {@link InsertFilm }
     * 
     */
    public InsertFilm createInsertFilm() {
        return new InsertFilm();
    }

    /**
     * Create an instance of {@link Film }
     * 
     */
    public Film createFilm() {
        return new Film();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFilmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "deleteFilmResponse")
    public JAXBElement<DeleteFilmResponse> createDeleteFilmResponse(DeleteFilmResponse value) {
        return new JAXBElement<DeleteFilmResponse>(_DeleteFilmResponse_QNAME, DeleteFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFilm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "insertFilm")
    public JAXBElement<InsertFilm> createInsertFilm(InsertFilm value) {
        return new JAXBElement<InsertFilm>(_InsertFilm_QNAME, InsertFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFilm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "updateFilm")
    public JAXBElement<UpdateFilm> createUpdateFilm(UpdateFilm value) {
        return new JAXBElement<UpdateFilm>(_UpdateFilm_QNAME, UpdateFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFilmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "getAllFilmsResponse")
    public JAXBElement<GetAllFilmsResponse> createGetAllFilmsResponse(GetAllFilmsResponse value) {
        return new JAXBElement<GetAllFilmsResponse>(_GetAllFilmsResponse_QNAME, GetAllFilmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFilm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "deleteFilm")
    public JAXBElement<DeleteFilm> createDeleteFilm(DeleteFilm value) {
        return new JAXBElement<DeleteFilm>(_DeleteFilm_QNAME, DeleteFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountFilms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "countFilms")
    public JAXBElement<CountFilms> createCountFilms(CountFilms value) {
        return new JAXBElement<CountFilms>(_CountFilms_QNAME, CountFilms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "getFilm")
    public JAXBElement<GetFilm> createGetFilm(GetFilm value) {
        return new JAXBElement<GetFilm>(_GetFilm_QNAME, GetFilm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "getFilmResponse")
    public JAXBElement<GetFilmResponse> createGetFilmResponse(GetFilmResponse value) {
        return new JAXBElement<GetFilmResponse>(_GetFilmResponse_QNAME, GetFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFilmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "updateFilmResponse")
    public JAXBElement<UpdateFilmResponse> createUpdateFilmResponse(UpdateFilmResponse value) {
        return new JAXBElement<UpdateFilmResponse>(_UpdateFilmResponse_QNAME, UpdateFilmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountFilmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "countFilmsResponse")
    public JAXBElement<CountFilmsResponse> createCountFilmsResponse(CountFilmsResponse value) {
        return new JAXBElement<CountFilmsResponse>(_CountFilmsResponse_QNAME, CountFilmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFilms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "getAllFilms")
    public JAXBElement<GetAllFilms> createGetAllFilms(GetAllFilms value) {
        return new JAXBElement<GetAllFilms>(_GetAllFilms_QNAME, GetAllFilms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFilmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://film.service.pz3.ITtexn.com/", name = "insertFilmResponse")
    public JAXBElement<InsertFilmResponse> createInsertFilmResponse(InsertFilmResponse value) {
        return new JAXBElement<InsertFilmResponse>(_InsertFilmResponse_QNAME, InsertFilmResponse.class, null, value);
    }

}
