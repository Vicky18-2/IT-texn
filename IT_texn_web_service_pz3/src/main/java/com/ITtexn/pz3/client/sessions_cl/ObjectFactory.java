
package com.ITtexn.pz3.client.sessions_cl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ITtexn.pz3.client.session_cl package. 
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

    private final static QName _InsertSession_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "insertSession");
    private final static QName _CountSessionResponse_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "countSessionResponse");
    private final static QName _GetSession_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "getSession");
    private final static QName _GetAllSessions_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "getAllSessions");
    private final static QName _GetSessionResponse_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "getSessionResponse");
    private final static QName _UpdateSession_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "updateSession");
    private final static QName _GetAllSessionsResponse_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "getAllSessionsResponse");
    private final static QName _InsertSessionResponse_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "insertSessionResponse");
    private final static QName _DeleteSessionResponse_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "deleteSessionResponse");
    private final static QName _UpdateSessionResponse_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "updateSessionResponse");
    private final static QName _DeleteSession_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "deleteSession");
    private final static QName _CountSession_QNAME = new QName("http://session.service.pz3.ITtexn.com/", "countSession");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ITtexn.pz3.client.session_cl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteSession }
     * 
     */
    public DeleteSession createDeleteSession() {
        return new DeleteSession();
    }

    /**
     * Create an instance of {@link CountSession }
     * 
     */
    public CountSession createCountSession() {
        return new CountSession();
    }

    /**
     * Create an instance of {@link DeleteSessionResponse }
     * 
     */
    public DeleteSessionResponse createDeleteSessionResponse() {
        return new DeleteSessionResponse();
    }

    /**
     * Create an instance of {@link UpdateSessionResponse }
     * 
     */
    public UpdateSessionResponse createUpdateSessionResponse() {
        return new UpdateSessionResponse();
    }

    /**
     * Create an instance of {@link InsertSessionResponse }
     * 
     */
    public InsertSessionResponse createInsertSessionResponse() {
        return new InsertSessionResponse();
    }

    /**
     * Create an instance of {@link GetAllSessionsResponse }
     * 
     */
    public GetAllSessionsResponse createGetAllSessionsResponse() {
        return new GetAllSessionsResponse();
    }

    /**
     * Create an instance of {@link GetAllSessions }
     * 
     */
    public GetAllSessions createGetAllSessions() {
        return new GetAllSessions();
    }

    /**
     * Create an instance of {@link GetSessionResponse }
     * 
     */
    public GetSessionResponse createGetSessionResponse() {
        return new GetSessionResponse();
    }

    /**
     * Create an instance of {@link UpdateSession }
     * 
     */
    public UpdateSession createUpdateSession() {
        return new UpdateSession();
    }

    /**
     * Create an instance of {@link CountSessionResponse }
     * 
     */
    public CountSessionResponse createCountSessionResponse() {
        return new CountSessionResponse();
    }

    /**
     * Create an instance of {@link GetSession }
     * 
     */
    public GetSession createGetSession() {
        return new GetSession();
    }

    /**
     * Create an instance of {@link InsertSession }
     * 
     */
    public InsertSession createInsertSession() {
        return new InsertSession();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "insertSession")
    public JAXBElement<InsertSession> createInsertSession(InsertSession value) {
        return new JAXBElement<InsertSession>(_InsertSession_QNAME, InsertSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "countSessionResponse")
    public JAXBElement<CountSessionResponse> createCountSessionResponse(CountSessionResponse value) {
        return new JAXBElement<CountSessionResponse>(_CountSessionResponse_QNAME, CountSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "getSession")
    public JAXBElement<GetSession> createGetSession(GetSession value) {
        return new JAXBElement<GetSession>(_GetSession_QNAME, GetSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSessions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "getAllSessions")
    public JAXBElement<GetAllSessions> createGetAllSessions(GetAllSessions value) {
        return new JAXBElement<GetAllSessions>(_GetAllSessions_QNAME, GetAllSessions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "getSessionResponse")
    public JAXBElement<GetSessionResponse> createGetSessionResponse(GetSessionResponse value) {
        return new JAXBElement<GetSessionResponse>(_GetSessionResponse_QNAME, GetSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "updateSession")
    public JAXBElement<UpdateSession> createUpdateSession(UpdateSession value) {
        return new JAXBElement<UpdateSession>(_UpdateSession_QNAME, UpdateSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSessionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "getAllSessionsResponse")
    public JAXBElement<GetAllSessionsResponse> createGetAllSessionsResponse(GetAllSessionsResponse value) {
        return new JAXBElement<GetAllSessionsResponse>(_GetAllSessionsResponse_QNAME, GetAllSessionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "insertSessionResponse")
    public JAXBElement<InsertSessionResponse> createInsertSessionResponse(InsertSessionResponse value) {
        return new JAXBElement<InsertSessionResponse>(_InsertSessionResponse_QNAME, InsertSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "deleteSessionResponse")
    public JAXBElement<DeleteSessionResponse> createDeleteSessionResponse(DeleteSessionResponse value) {
        return new JAXBElement<DeleteSessionResponse>(_DeleteSessionResponse_QNAME, DeleteSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "updateSessionResponse")
    public JAXBElement<UpdateSessionResponse> createUpdateSessionResponse(UpdateSessionResponse value) {
        return new JAXBElement<UpdateSessionResponse>(_UpdateSessionResponse_QNAME, UpdateSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "deleteSession")
    public JAXBElement<DeleteSession> createDeleteSession(DeleteSession value) {
        return new JAXBElement<DeleteSession>(_DeleteSession_QNAME, DeleteSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.service.pz3.ITtexn.com/", name = "countSession")
    public JAXBElement<CountSession> createCountSession(CountSession value) {
        return new JAXBElement<CountSession>(_CountSession_QNAME, CountSession.class, null, value);
    }

}
