//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.09 um 08:09:08 PM CEST 
//


package de.rc7000.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.rc7000.soap package. 
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

    private final static QName _ListDpRequest_QNAME = new QName("http://ws01.lom.ch/soap/", "listDpRequest");
    private final static QName _GetDpRequest_QNAME = new QName("http://ws01.lom.ch/soap/", "getDpRequest");
    private final static QName _SetDpRequest_QNAME = new QName("http://ws01.lom.ch/soap/", "setDpRequest");
    private final static QName _ReadDpRequest_QNAME = new QName("http://ws01.lom.ch/soap/", "readDpRequest");
    private final static QName _WriteDpRequest_QNAME = new QName("http://ws01.lom.ch/soap/", "writeDpRequest");
    private final static QName _ListDpResponse_QNAME = new QName("http://ws01.lom.ch/soap/", "listDpResponse");
    private final static QName _GetDpResponse_QNAME = new QName("http://ws01.lom.ch/soap/", "getDpResponse");
    private final static QName _SetDpResponse_QNAME = new QName("http://ws01.lom.ch/soap/", "setDpResponse");
    private final static QName _ReadDpResponse_QNAME = new QName("http://ws01.lom.ch/soap/", "readDpResponse");
    private final static QName _WriteDpResponse_QNAME = new QName("http://ws01.lom.ch/soap/", "writeDpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.rc7000.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListDpRequest }
     * 
     */
    public ListDpRequest createListDpRequest() {
        return new ListDpRequest();
    }

    /**
     * Create an instance of {@link GetDpRequest }
     * 
     */
    public GetDpRequest createGetDpRequest() {
        return new GetDpRequest();
    }

    /**
     * Create an instance of {@link SetDpRequest }
     * 
     */
    public SetDpRequest createSetDpRequest() {
        return new SetDpRequest();
    }

    /**
     * Create an instance of {@link ReadDpRequest }
     * 
     */
    public ReadDpRequest createReadDpRequest() {
        return new ReadDpRequest();
    }

    /**
     * Create an instance of {@link WriteDpRequest }
     * 
     */
    public WriteDpRequest createWriteDpRequest() {
        return new WriteDpRequest();
    }

    /**
     * Create an instance of {@link ListDpResponse }
     * 
     */
    public ListDpResponse createListDpResponse() {
        return new ListDpResponse();
    }

    /**
     * Create an instance of {@link GetDpResponse }
     * 
     */
    public GetDpResponse createGetDpResponse() {
        return new GetDpResponse();
    }

    /**
     * Create an instance of {@link SetDpResponse }
     * 
     */
    public SetDpResponse createSetDpResponse() {
        return new SetDpResponse();
    }

    /**
     * Create an instance of {@link ReadDpResponse }
     * 
     */
    public ReadDpResponse createReadDpResponse() {
        return new ReadDpResponse();
    }

    /**
     * Create an instance of {@link WriteDpResponse }
     * 
     */
    public WriteDpResponse createWriteDpResponse() {
        return new WriteDpResponse();
    }

    /**
     * Create an instance of {@link EmptyRequest }
     * 
     */
    public EmptyRequest createEmptyRequest() {
        return new EmptyRequest();
    }

    /**
     * Create an instance of {@link EmptyResponse }
     * 
     */
    public EmptyResponse createEmptyResponse() {
        return new EmptyResponse();
    }

    /**
     * Create an instance of {@link DpRef }
     * 
     */
    public DpRef createDpRef() {
        return new DpRef();
    }

    /**
     * Create an instance of {@link DpLst }
     * 
     */
    public DpLst createDpLst() {
        return new DpLst();
    }

    /**
     * Create an instance of {@link DpCfg }
     * 
     */
    public DpCfg createDpCfg() {
        return new DpCfg();
    }

    /**
     * Create an instance of {@link DP }
     * 
     */
    public DP createDP() {
        return new DP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDpRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDpRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "listDpRequest")
    public JAXBElement<ListDpRequest> createListDpRequest(ListDpRequest value) {
        return new JAXBElement<ListDpRequest>(_ListDpRequest_QNAME, ListDpRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDpRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDpRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "getDpRequest")
    public JAXBElement<GetDpRequest> createGetDpRequest(GetDpRequest value) {
        return new JAXBElement<GetDpRequest>(_GetDpRequest_QNAME, GetDpRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDpRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetDpRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "setDpRequest")
    public JAXBElement<SetDpRequest> createSetDpRequest(SetDpRequest value) {
        return new JAXBElement<SetDpRequest>(_SetDpRequest_QNAME, SetDpRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDpRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadDpRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "readDpRequest")
    public JAXBElement<ReadDpRequest> createReadDpRequest(ReadDpRequest value) {
        return new JAXBElement<ReadDpRequest>(_ReadDpRequest_QNAME, ReadDpRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteDpRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WriteDpRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "writeDpRequest")
    public JAXBElement<WriteDpRequest> createWriteDpRequest(WriteDpRequest value) {
        return new JAXBElement<WriteDpRequest>(_WriteDpRequest_QNAME, WriteDpRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListDpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "listDpResponse")
    public JAXBElement<ListDpResponse> createListDpResponse(ListDpResponse value) {
        return new JAXBElement<ListDpResponse>(_ListDpResponse_QNAME, ListDpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "getDpResponse")
    public JAXBElement<GetDpResponse> createGetDpResponse(GetDpResponse value) {
        return new JAXBElement<GetDpResponse>(_GetDpResponse_QNAME, GetDpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetDpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "setDpResponse")
    public JAXBElement<SetDpResponse> createSetDpResponse(SetDpResponse value) {
        return new JAXBElement<SetDpResponse>(_SetDpResponse_QNAME, SetDpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadDpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "readDpResponse")
    public JAXBElement<ReadDpResponse> createReadDpResponse(ReadDpResponse value) {
        return new JAXBElement<ReadDpResponse>(_ReadDpResponse_QNAME, ReadDpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteDpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WriteDpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws01.lom.ch/soap/", name = "writeDpResponse")
    public JAXBElement<WriteDpResponse> createWriteDpResponse(WriteDpResponse value) {
        return new JAXBElement<WriteDpResponse>(_WriteDpResponse_QNAME, WriteDpResponse.class, null, value);
    }

}
