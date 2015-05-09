
package com.m104.futebol.model.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.m104.futebol.model.webservice package. 
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

    private final static QName _BuscarTodos_QNAME = new QName("http://webservice.model.futebol.m104.com/", "buscarTodos");
    private final static QName _BuscarTodosResponse_QNAME = new QName("http://webservice.model.futebol.m104.com/", "buscarTodosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.m104.futebol.model.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarTodosResponse }
     * 
     */
    public BuscarTodosResponse createBuscarTodosResponse() {
        return new BuscarTodosResponse();
    }

    /**
     * Create an instance of {@link BuscarTodos }
     * 
     */
    public BuscarTodos createBuscarTodos() {
        return new BuscarTodos();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link Jogador }
     * 
     */
    public Jogador createJogador() {
        return new Jogador();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.model.futebol.m104.com/", name = "buscarTodos")
    public JAXBElement<BuscarTodos> createBuscarTodos(BuscarTodos value) {
        return new JAXBElement<BuscarTodos>(_BuscarTodos_QNAME, BuscarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.model.futebol.m104.com/", name = "buscarTodosResponse")
    public JAXBElement<BuscarTodosResponse> createBuscarTodosResponse(BuscarTodosResponse value) {
        return new JAXBElement<BuscarTodosResponse>(_BuscarTodosResponse_QNAME, BuscarTodosResponse.class, null, value);
    }

}
