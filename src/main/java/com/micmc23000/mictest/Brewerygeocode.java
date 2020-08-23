/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micmc23000.mictest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "brewerygeocode")
@NamedQueries({
    @NamedQuery(name = "Brewerygeocode.findAll", query = "SELECT b FROM Brewerygeocode b"),
    @NamedQuery(name = "Brewerygeocode.findByBeerId", query = "SELECT b FROM Brewerygeocode b WHERE b.beerId = :beerId"),
    @NamedQuery(name = "Brewerygeocode.findByBreweryId", query = "SELECT b FROM Brewerygeocode b WHERE b.breweryId = :breweryId"),
    @NamedQuery(name = "Brewerygeocode.findByLatitude", query = "SELECT b FROM Brewerygeocode b WHERE b.latitude = :latitude"),
    @NamedQuery(name = "Brewerygeocode.findByLongitude", query = "SELECT b FROM Brewerygeocode b WHERE b.longitude = :longitude")})
public class Brewerygeocode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "beer_id")
    private Integer beerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "brewery_id")
    private int breweryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "latitude")
    private float latitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private float longitude;

    public Brewerygeocode() {
    }

    public Brewerygeocode(Integer beerId) {
        this.beerId = beerId;
    }

    public Brewerygeocode(Integer beerId, int breweryId, float latitude, float longitude) {
        this.beerId = beerId;
        this.breweryId = breweryId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getBeerId() {
        return beerId;
    }

    public void setBeerId(Integer beerId) {
        this.beerId = beerId;
    }

    public int getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(int breweryId) {
        this.breweryId = breweryId;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (beerId != null ? beerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Brewerygeocode)) {
            return false;
        }
        Brewerygeocode other = (Brewerygeocode) object;
        if ((this.beerId == null && other.beerId != null) || (this.beerId != null && !this.beerId.equals(other.beerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.micmc23000.mictest.Brewerygeocode[ beerId=" + beerId + " ]";
    }
    
}
