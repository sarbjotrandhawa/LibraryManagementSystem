/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ravi
 */
@Entity
@Table(name = "BOOKS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Books.findAll", query = "SELECT b FROM Books b"),
    @NamedQuery(name = "Books.findByBookid", query = "SELECT b FROM Books b WHERE b.bookid = :bookid"),
    @NamedQuery(name = "Books.findByTitle", query = "SELECT b FROM Books b WHERE b.title = :title"),
    @NamedQuery(name = "Books.findByBookauthor", query = "SELECT b FROM Books b WHERE b.bookauthor = :bookauthor"),
    @NamedQuery(name = "Books.findByBookpublication", query = "SELECT b FROM Books b WHERE b.bookpublication = :bookpublication"),
    @NamedQuery(name = "Books.findByBookdetail", query = "SELECT b FROM Books b WHERE b.bookdetail = :bookdetail"),
    @NamedQuery(name = "Books.findByBooklocation", query = "SELECT b FROM Books b WHERE b.booklocation = :booklocation"),
    @NamedQuery(name = "Books.findByAvailability", query = "SELECT b FROM Books b WHERE b.availability = :availability")})
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false)
    private String bookid;
    @Size(max = 255)
    @Column(name = "TITLE")
    private String title;
    @Size(max = 255)
    @Column(name = "BOOKAUTHOR")
    private String bookauthor;
    @Size(max = 255)
    @Column(name = "BOOKPUBLICATION")
    private String bookpublication;
    @Size(max = 255)
    @Column(name = "BOOKDETAIL")
    private String bookdetail;
    @Size(max = 255)
    @Column(name = "BOOKLOCATION")
    private String booklocation;
    @Size(max = 255)
    @Column(name = "AVAILABILITY")
    private String availability;

    public Books() {
    }

    public Books(String bookid) {
        this.bookid = bookid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookpublication() {
        return bookpublication;
    }

    public void setBookpublication(String bookpublication) {
        this.bookpublication = bookpublication;
    }

    public String getBookdetail() {
        return bookdetail;
    }

    public void setBookdetail(String bookdetail) {
        this.bookdetail = bookdetail;
    }

    public String getBooklocation() {
        return booklocation;
    }

    public void setBooklocation(String booklocation) {
        this.booklocation = booklocation;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Books)) {
            return false;
        }
        Books other = (Books) object;
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Books[ bookid=" + bookid + " ]";
    }
    
}
