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
 * @author macbookair
 */
@Entity
@Table(name = "BOOKISSUEDATE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookissuedate.findAll", query = "SELECT b FROM Bookissuedate b"),
    @NamedQuery(name = "Bookissuedate.findById", query = "SELECT b FROM Bookissuedate b WHERE b.id = :id"),
    @NamedQuery(name = "Bookissuedate.findByEmployeeid", query = "SELECT b FROM Bookissuedate b WHERE b.employeeid = :employeeid"),
    @NamedQuery(name = "Bookissuedate.findByUserid", query = "SELECT b FROM Bookissuedate b WHERE b.userid = :userid"),
    @NamedQuery(name = "Bookissuedate.findByBookid", query = "SELECT b FROM Bookissuedate b WHERE b.bookid = :bookid"),
    @NamedQuery(name = "Bookissuedate.findByIssuedate", query = "SELECT b FROM Bookissuedate b WHERE b.issuedate = :issuedate"),
    @NamedQuery(name = "Bookissuedate.findByReceivedate", query = "SELECT b FROM Bookissuedate b WHERE b.receivedate = :receivedate")})
public class Bookissuedate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "EMPLOYEEID")
    private Integer employeeid;
    @Column(name = "USERID")
    private Integer userid;
    @Size(max = 100)
    @Column(name = "BOOKID")
    private String bookid;
    @Size(max = 100)
    @Column(name = "ISSUEDATE")
    private String issuedate;
    @Size(max = 100)
    @Column(name = "RECEIVEDATE")
    private String receivedate;

    public Bookissuedate() {
    }

    public Bookissuedate(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(String receivedate) {
        this.receivedate = receivedate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookissuedate)) {
            return false;
        }
        Bookissuedate other = (Bookissuedate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Bookissuedate[ id=" + id + " ]";
    }
    
}
