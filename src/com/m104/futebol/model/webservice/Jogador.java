
package com.m104.futebol.model.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jogador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jogador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gols" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jogosRealizados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time" type="{http://webservice.model.futebol.m104.com/}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jogador", propOrder = {
    "gols",
    "id",
    "idade",
    "jogosRealizados",
    "nome",
    "posicao",
    "time"
})
public class Jogador {

    protected int gols;
    protected long id;
    protected int idade;
    protected int jogosRealizados;
    protected String nome;
    protected String posicao;
    protected Time time;

    /**
     * Gets the value of the gols property.
     * 
     */
    public int getGols() {
        return gols;
    }

    /**
     * Sets the value of the gols property.
     * 
     */
    public void setGols(int value) {
        this.gols = value;
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
     * Gets the value of the idade property.
     * 
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Sets the value of the idade property.
     * 
     */
    public void setIdade(int value) {
        this.idade = value;
    }

    /**
     * Gets the value of the jogosRealizados property.
     * 
     */
    public int getJogosRealizados() {
        return jogosRealizados;
    }

    /**
     * Sets the value of the jogosRealizados property.
     * 
     */
    public void setJogosRealizados(int value) {
        this.jogosRealizados = value;
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
     * Gets the value of the posicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicao() {
        return posicao;
    }

    /**
     * Sets the value of the posicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicao(String value) {
        this.posicao = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

}
