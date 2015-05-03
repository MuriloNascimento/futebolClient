
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

    private final static QName _EnviarResponse_QNAME = new QName("http://webservice.model.futebol.m104.com/", "enviarResponse");
    private final static QName _Enviar_QNAME = new QName("http://webservice.model.futebol.m104.com/", "enviar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.m104.futebol.model.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Enviar }
     * 
     */
    public Enviar createEnviar() {
        return new Enviar();
    }

    /**
     * Create an instance of {@link EnviarResponse }
     * 
     */
    public EnviarResponse createEnviarResponse() {
        return new EnviarResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.model.futebol.m104.com/", name = "enviarResponse")
    public JAXBElement<EnviarResponse> createEnviarResponse(EnviarResponse value) {
        return new JAXBElement<EnviarResponse>(_EnviarResponse_QNAME, EnviarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Enviar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.model.futebol.m104.com/", name = "enviar")
    public JAXBElement<Enviar> createEnviar(Enviar value) {
        return new JAXBElement<Enviar>(_Enviar_QNAME, Enviar.class, null, value);
    }

}
