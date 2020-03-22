
package com.demo.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo.client package. 
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

    private final static QName _AddApplication_QNAME = new QName("http://soap.demo.com/", "addApplication");
    private final static QName _AddApplicationResponse_QNAME = new QName("http://soap.demo.com/", "addApplicationResponse");
    private final static QName _Application_QNAME = new QName("http://soap.demo.com/", "application");
    private final static QName _DeleteApplication_QNAME = new QName("http://soap.demo.com/", "deleteApplication");
    private final static QName _DeleteApplicationResponse_QNAME = new QName("http://soap.demo.com/", "deleteApplicationResponse");
    private final static QName _GetAll_QNAME = new QName("http://soap.demo.com/", "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://soap.demo.com/", "getAllResponse");
    private final static QName _GetApplication_QNAME = new QName("http://soap.demo.com/", "getApplication");
    private final static QName _GetApplicationResponse_QNAME = new QName("http://soap.demo.com/", "getApplicationResponse");
    private final static QName _UpdateApplication_QNAME = new QName("http://soap.demo.com/", "updateApplication");
    private final static QName _UpdateApplicationResponse_QNAME = new QName("http://soap.demo.com/", "updateApplicationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddApplication }
     * 
     */
    public AddApplication createAddApplication() {
        return new AddApplication();
    }

    /**
     * Create an instance of {@link AddApplicationResponse }
     * 
     */
    public AddApplicationResponse createAddApplicationResponse() {
        return new AddApplicationResponse();
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link DeleteApplication }
     * 
     */
    public DeleteApplication createDeleteApplication() {
        return new DeleteApplication();
    }

    /**
     * Create an instance of {@link DeleteApplicationResponse }
     * 
     */
    public DeleteApplicationResponse createDeleteApplicationResponse() {
        return new DeleteApplicationResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetApplication }
     * 
     */
    public GetApplication createGetApplication() {
        return new GetApplication();
    }

    /**
     * Create an instance of {@link GetApplicationResponse }
     * 
     */
    public GetApplicationResponse createGetApplicationResponse() {
        return new GetApplicationResponse();
    }

    /**
     * Create an instance of {@link UpdateApplication }
     * 
     */
    public UpdateApplication createUpdateApplication() {
        return new UpdateApplication();
    }

    /**
     * Create an instance of {@link UpdateApplicationResponse }
     * 
     */
    public UpdateApplicationResponse createUpdateApplicationResponse() {
        return new UpdateApplicationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddApplication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddApplication }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "addApplication")
    public JAXBElement<AddApplication> createAddApplication(AddApplication value) {
        return new JAXBElement<AddApplication>(_AddApplication_QNAME, AddApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddApplicationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddApplicationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "addApplicationResponse")
    public JAXBElement<AddApplicationResponse> createAddApplicationResponse(AddApplicationResponse value) {
        return new JAXBElement<AddApplicationResponse>(_AddApplicationResponse_QNAME, AddApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Application }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "application")
    public JAXBElement<Application> createApplication(Application value) {
        return new JAXBElement<Application>(_Application_QNAME, Application.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteApplication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteApplication }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "deleteApplication")
    public JAXBElement<DeleteApplication> createDeleteApplication(DeleteApplication value) {
        return new JAXBElement<DeleteApplication>(_DeleteApplication_QNAME, DeleteApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteApplicationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteApplicationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "deleteApplicationResponse")
    public JAXBElement<DeleteApplicationResponse> createDeleteApplicationResponse(DeleteApplicationResponse value) {
        return new JAXBElement<DeleteApplicationResponse>(_DeleteApplicationResponse_QNAME, DeleteApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetApplication }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "getApplication")
    public JAXBElement<GetApplication> createGetApplication(GetApplication value) {
        return new JAXBElement<GetApplication>(_GetApplication_QNAME, GetApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetApplicationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "getApplicationResponse")
    public JAXBElement<GetApplicationResponse> createGetApplicationResponse(GetApplicationResponse value) {
        return new JAXBElement<GetApplicationResponse>(_GetApplicationResponse_QNAME, GetApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateApplication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateApplication }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "updateApplication")
    public JAXBElement<UpdateApplication> createUpdateApplication(UpdateApplication value) {
        return new JAXBElement<UpdateApplication>(_UpdateApplication_QNAME, UpdateApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateApplicationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateApplicationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.demo.com/", name = "updateApplicationResponse")
    public JAXBElement<UpdateApplicationResponse> createUpdateApplicationResponse(UpdateApplicationResponse value) {
        return new JAXBElement<UpdateApplicationResponse>(_UpdateApplicationResponse_QNAME, UpdateApplicationResponse.class, null, value);
    }

}
