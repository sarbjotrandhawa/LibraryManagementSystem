
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for books complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="books">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookauthor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookdetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="booklocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookpublication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "books", propOrder = {
    "availability",
    "bookauthor",
    "bookdetail",
    "bookid",
    "booklocation",
    "bookpublication",
    "title"
})
public class Books {

    protected String availability;
    protected String bookauthor;
    protected String bookdetail;
    protected String bookid;
    protected String booklocation;
    protected String bookpublication;
    protected String title;

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Gets the value of the bookauthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookauthor() {
        return bookauthor;
    }

    /**
     * Sets the value of the bookauthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookauthor(String value) {
        this.bookauthor = value;
    }

    /**
     * Gets the value of the bookdetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookdetail() {
        return bookdetail;
    }

    /**
     * Sets the value of the bookdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookdetail(String value) {
        this.bookdetail = value;
    }

    /**
     * Gets the value of the bookid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookid() {
        return bookid;
    }

    /**
     * Sets the value of the bookid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookid(String value) {
        this.bookid = value;
    }

    /**
     * Gets the value of the booklocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooklocation() {
        return booklocation;
    }

    /**
     * Sets the value of the booklocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooklocation(String value) {
        this.booklocation = value;
    }

    /**
     * Gets the value of the bookpublication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookpublication() {
        return bookpublication;
    }

    /**
     * Sets the value of the bookpublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookpublication(String value) {
        this.bookpublication = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
