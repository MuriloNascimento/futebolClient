
package com.m104.futebol.model.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EnviaTime", targetNamespace = "http://webservice.model.futebol.m104.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EnviaTime {


    /**
     * 
     * @return
     *     returns java.util.List<com.m104.futebol.model.webservice.Time>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "enviar", targetNamespace = "http://webservice.model.futebol.m104.com/", className = "com.m104.futebol.model.webservice.Enviar")
    @ResponseWrapper(localName = "enviarResponse", targetNamespace = "http://webservice.model.futebol.m104.com/", className = "com.m104.futebol.model.webservice.EnviarResponse")
    public List<Time> enviar();

}