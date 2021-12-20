
package com.ITtexn.pz3.client.hall_cl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ITtexn.pz3.client.hall_cl package. 
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

    private final static QName _GetAllHallsResponse_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "getAllHallsResponse");
    private final static QName _UpdateHallResponse_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "updateHallResponse");
    private final static QName _CountHall_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "countHall");
    private final static QName _CountHallResponse_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "countHallResponse");
    private final static QName _InsertHallResponse_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "insertHallResponse");
    private final static QName _UpdateHall_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "updateHall");
    private final static QName _DeleteHall_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "deleteHall");
    private final static QName _DeleteHallResponse_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "deleteHallResponse");
    private final static QName _GetAllHalls_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "getAllHalls");
    private final static QName _InsertHall_QNAME = new QName("http://hall.service.pz3.ITtexn.com/", "insertHall");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ITtexn.pz3.client.hall_cl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertHall }
     * 
     */
    public InsertHall createInsertHall() {
        return new InsertHall();
    }

    /**
     * Create an instance of {@link DeleteHall }
     * 
     */
    public DeleteHall createDeleteHall() {
        return new DeleteHall();
    }

    /**
     * Create an instance of {@link DeleteHallResponse }
     * 
     */
    public DeleteHallResponse createDeleteHallResponse() {
        return new DeleteHallResponse();
    }

    /**
     * Create an instance of {@link GetAllHalls }
     * 
     */
    public GetAllHalls createGetAllHalls() {
        return new GetAllHalls();
    }

    /**
     * Create an instance of {@link CountHall }
     * 
     */
    public CountHall createCountHall() {
        return new CountHall();
    }

    /**
     * Create an instance of {@link CountHallResponse }
     * 
     */
    public CountHallResponse createCountHallResponse() {
        return new CountHallResponse();
    }

    /**
     * Create an instance of {@link InsertHallResponse }
     * 
     */
    public InsertHallResponse createInsertHallResponse() {
        return new InsertHallResponse();
    }

    /**
     * Create an instance of {@link UpdateHall }
     * 
     */
    public UpdateHall createUpdateHall() {
        return new UpdateHall();
    }

    /**
     * Create an instance of {@link UpdateHallResponse }
     * 
     */
    public UpdateHallResponse createUpdateHallResponse() {
        return new UpdateHallResponse();
    }

    /**
     * Create an instance of {@link GetAllHallsResponse }
     * 
     */
    public GetAllHallsResponse createGetAllHallsResponse() {
        return new GetAllHallsResponse();
    }

    /**
     * Create an instance of {@link Hall }
     * 
     */
    public Hall createHall() {
        return new Hall();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllHallsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "getAllHallsResponse")
    public JAXBElement<GetAllHallsResponse> createGetAllHallsResponse(GetAllHallsResponse value) {
        return new JAXBElement<GetAllHallsResponse>(_GetAllHallsResponse_QNAME, GetAllHallsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHallResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "updateHallResponse")
    public JAXBElement<UpdateHallResponse> createUpdateHallResponse(UpdateHallResponse value) {
        return new JAXBElement<UpdateHallResponse>(_UpdateHallResponse_QNAME, UpdateHallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountHall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "countHall")
    public JAXBElement<CountHall> createCountHall(CountHall value) {
        return new JAXBElement<CountHall>(_CountHall_QNAME, CountHall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountHallResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "countHallResponse")
    public JAXBElement<CountHallResponse> createCountHallResponse(CountHallResponse value) {
        return new JAXBElement<CountHallResponse>(_CountHallResponse_QNAME, CountHallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertHallResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "insertHallResponse")
    public JAXBElement<InsertHallResponse> createInsertHallResponse(InsertHallResponse value) {
        return new JAXBElement<InsertHallResponse>(_InsertHallResponse_QNAME, InsertHallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "updateHall")
    public JAXBElement<UpdateHall> createUpdateHall(UpdateHall value) {
        return new JAXBElement<UpdateHall>(_UpdateHall_QNAME, UpdateHall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "deleteHall")
    public JAXBElement<DeleteHall> createDeleteHall(DeleteHall value) {
        return new JAXBElement<DeleteHall>(_DeleteHall_QNAME, DeleteHall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHallResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "deleteHallResponse")
    public JAXBElement<DeleteHallResponse> createDeleteHallResponse(DeleteHallResponse value) {
        return new JAXBElement<DeleteHallResponse>(_DeleteHallResponse_QNAME, DeleteHallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllHalls }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "getAllHalls")
    public JAXBElement<GetAllHalls> createGetAllHalls(GetAllHalls value) {
        return new JAXBElement<GetAllHalls>(_GetAllHalls_QNAME, GetAllHalls.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertHall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hall.service.pz3.ITtexn.com/", name = "insertHall")
    public JAXBElement<InsertHall> createInsertHall(InsertHall value) {
        return new JAXBElement<InsertHall>(_InsertHall_QNAME, InsertHall.class, null, value);
    }

}
