
package com.m104.futebol.model.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="escudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="jogadores" type="{http://webservice.model.futebol.m104.com/}jogador" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time", propOrder = {
    "escudo",
    "estadio",
    "id",
    "jogadores",
    "nome",
    "tecnico",
    "titulos"
})
public class Time {

    protected String escudo;
    protected String estadio;
    protected long id;
    @XmlElement(nillable = true)
    protected List<Jogador> jogadores;
    protected String nome;
    protected String tecnico;
    protected int titulos;

    /**
     * Gets the value of the escudo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscudo() {
        return escudo;
    }

    /**
     * Sets the value of the escudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscudo(String value) {
        this.escudo = value;
    }

    /**
     * Gets the value of the estadio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * Sets the value of the estadio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadio(String value) {
        this.estadio = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the jogadores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jogadores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJogadores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jogador }
     * 
     * 
     */
    public List<Jogador> getJogadores() {
        if (jogadores == null) {
            jogadores = new ArrayList<Jogador>();
        }
        return this.jogadores;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the tecnico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTecnico() {
        return tecnico;
    }

    /**
     * Sets the value of the tecnico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTecnico(String value) {
        this.tecnico = value;
    }

    /**
     * Gets the value of the titulos property.
     * 
     */
    public int getTitulos() {
        return titulos;
    }

    /**
     * Sets the value of the titulos property.
     * 
     */
    public void setTitulos(int value) {
        this.titulos = value;
    }

}
