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
@Table(name = "beer")
@NamedQueries({
    @NamedQuery(name = "Beer.findAll", query = "SELECT b FROM Beer b"),
    @NamedQuery(name = "Beer.findByBeerId", query = "SELECT b FROM Beer b WHERE b.beerId = :beerId"),
    @NamedQuery(name = "Beer.findByBreweryId", query = "SELECT b FROM Beer b WHERE b.breweryId = :breweryId"),
    @NamedQuery(name = "Beer.findByName", query = "SELECT b FROM Beer b WHERE b.name = :name"),
    @NamedQuery(name = "Beer.findByCatId", query = "SELECT b FROM Beer b WHERE b.catId = :catId"),
    @NamedQuery(name = "Beer.findByStyleId", query = "SELECT b FROM Beer b WHERE b.styleId = :styleId"),
    @NamedQuery(name = "Beer.findByAbv", query = "SELECT b FROM Beer b WHERE b.abv = :abv"),
    @NamedQuery(name = "Beer.findByIbu", query = "SELECT b FROM Beer b WHERE b.ibu = :ibu"),
    @NamedQuery(name = "Beer.findBySrm", query = "SELECT b FROM Beer b WHERE b.srm = :srm"),
    @NamedQuery(name = "Beer.findByAddUser", query = "SELECT b FROM Beer b WHERE b.addUser = :addUser"),
    @NamedQuery(name = "Beer.findByLastMod", query = "SELECT b FROM Beer b WHERE b.lastMod = :lastMod"),
    @NamedQuery(name = "Beer.findByBuyPrice", query = "SELECT b FROM Beer b WHERE b.buyPrice = :buyPrice"),
    @NamedQuery(name = "Beer.findBySellPrice", query = "SELECT b FROM Beer b WHERE b.sellPrice = :sellPrice")})
public class Beer implements Serializable {

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
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_id")
    private int catId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "style_id")
    private int styleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "abv")
    private float abv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ibu")
    private float ibu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "srm")
    private float srm;
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
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buy_price")
    private double buyPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sell_price")
    private double sellPrice;

    public Beer() {
    }

    public Beer(Integer beerId) {
        this.beerId = beerId;
    }

    public Beer(Integer beerId, int breweryId, String name, int catId, int styleId, float abv, float ibu, float srm, String description, int addUser, Date lastMod, String image, double buyPrice, double sellPrice) {
        this.beerId = beerId;
        this.breweryId = breweryId;
        this.name = name;
        this.catId = catId;
        this.styleId = styleId;
        this.abv = abv;
        this.ibu = ibu;
        this.srm = srm;
        this.description = description;
        this.addUser = addUser;
        this.lastMod = lastMod;
        this.image = image;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public int getStyleId() {
        return styleId;
    }

    public void setStyleId(int styleId) {
        this.styleId = styleId;
    }

    public float getAbv() {
        return abv;
    }

    public void setAbv(float abv) {
        this.abv = abv;
    }

    public float getIbu() {
        return ibu;
    }

    public void setIbu(float ibu) {
        this.ibu = ibu;
    }

    public float getSrm() {
        return srm;
    }

    public void setSrm(float srm) {
        this.srm = srm;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
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
        if (!(object instanceof Beer)) {
            return false;
        }
        Beer other = (Beer) object;
        if ((this.beerId == null && other.beerId != null) || (this.beerId != null && !this.beerId.equals(other.beerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.micmc23000.mictest.Beer[ beerId=" + beerId + " ]";
    }
    
}
