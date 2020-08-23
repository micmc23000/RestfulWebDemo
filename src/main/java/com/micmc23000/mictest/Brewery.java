/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micmc23000.mictest;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "brewery")
@NamedQueries({
    @NamedQuery(name = "Brewery.findAll", query = "SELECT b FROM Brewery b"),
    @NamedQuery(name = "Brewery.findByBreweryId", query = "SELECT b FROM Brewery b WHERE b.breweryId = :breweryId"),
    @NamedQuery(name = "Brewery.findByName", query = "SELECT b FROM Brewery b WHERE b.name = :name"),
    @NamedQuery(name = "Brewery.findByAddress1", query = "SELECT b FROM Brewery b WHERE b.address1 = :address1"),
    @NamedQuery(name = "Brewery.findByAddress2", query = "SELECT b FROM Brewery b WHERE b.address2 = :address2"),
    @NamedQuery(name = "Brewery.findByCity", query = "SELECT b FROM Brewery b WHERE b.city = :city"),
    @NamedQuery(name = "Brewery.findByState", query = "SELECT b FROM Brewery b WHERE b.state = :state"),
    @NamedQuery(name = "Brewery.findByCode", query = "SELECT b FROM Brewery b WHERE b.code = :code"),
    @NamedQuery(name = "Brewery.findByCountry", query = "SELECT b FROM Brewery b WHERE b.country = :country"),
    @NamedQuery(name = "Brewery.findByPhone", query = "SELECT b FROM Brewery b WHERE b.phone = :phone"),
    @NamedQuery(name = "Brewery.findByWebsite", query = "SELECT b FROM Brewery b WHERE b.website = :website"),
    @NamedQuery(name = "Brewery.findByImage", query = "SELECT b FROM Brewery b WHERE b.image = :image"),
    @NamedQuery(name = "Brewery.findByAddUser", query = "SELECT b FROM Brewery b WHERE b.addUser = :addUser"),
    @NamedQuery(name = "Brewery.findByLastMod", query = "SELECT b FROM Brewery b WHERE b.lastMod = :lastMod"),
    @NamedQuery(name = "Brewery.findByCreditLimit", query = "SELECT b FROM Brewery b WHERE b.creditLimit = :creditLimit"),
    @NamedQuery(name = "Brewery.findByEmail", query = "SELECT b FROM Brewery b WHERE b.email = :email")})
public class Brewery implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "brewery_id")
    private Integer breweryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "address1")
    private String address1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "address2")
    private String address2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "country")
    private String country;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "website")
    private String website;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "add_user")
    private int addUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastMod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "credit_limit")
    private double creditLimit;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;

    public Brewery() {
    }

    public Brewery(Integer breweryId) {
        this.breweryId = breweryId;
    }

    public Brewery(Integer breweryId, String name, String address1, String address2, String city, String state, String code, String country, String phone, String website, String image, String description, int addUser, Date lastMod, double creditLimit, String email) {
        this.breweryId = breweryId;
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.code = code;
        this.country = country;
        this.phone = phone;
        this.website = website;
        this.image = image;
        this.description = description;
        this.addUser = addUser;
        this.lastMod = lastMod;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Integer getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(Integer breweryId) {
        this.breweryId = breweryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAddUser() {
        return addUser;
    }

    public void setAddUser(int addUser) {
        this.addUser = addUser;
    }

    public Date getLastMod() {
        return lastMod;
    }

    public void setLastMod(Date lastMod) {
        this.lastMod = lastMod;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (breweryId != null ? breweryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Brewery)) {
            return false;
        }
        Brewery other = (Brewery) object;
        if ((this.breweryId == null && other.breweryId != null) || (this.breweryId != null && !this.breweryId.equals(other.breweryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.micmc23000.mictest.Brewery[ breweryId=" + breweryId + " ]";
    }
    
}
