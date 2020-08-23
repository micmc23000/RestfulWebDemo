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
@Table(name = "style")
@NamedQueries({
    @NamedQuery(name = "Style.findAll", query = "SELECT s FROM Style s"),
    @NamedQuery(name = "Style.findByStyleId", query = "SELECT s FROM Style s WHERE s.styleId = :styleId"),
    @NamedQuery(name = "Style.findByCatId", query = "SELECT s FROM Style s WHERE s.catId = :catId"),
    @NamedQuery(name = "Style.findByStyleName", query = "SELECT s FROM Style s WHERE s.styleName = :styleName"),
    @NamedQuery(name = "Style.findByLastMod", query = "SELECT s FROM Style s WHERE s.lastMod = :lastMod")})
public class Style implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "style_id")
    private Integer styleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_id")
    private int catId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "style_name")
    private String styleName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastMod;

    public Style() {
    }

    public Style(Integer styleId) {
        this.styleId = styleId;
    }

    public Style(Integer styleId, int catId, String styleName, Date lastMod) {
        this.styleId = styleId;
        this.catId = catId;
        this.styleName = styleName;
        this.lastMod = lastMod;
    }

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public Date getLastMod() {
        return lastMod;
    }

    public void setLastMod(Date lastMod) {
        this.lastMod = lastMod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (styleId != null ? styleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Style)) {
            return false;
        }
        Style other = (Style) object;
        if ((this.styleId == null && other.styleId != null) || (this.styleId != null && !this.styleId.equals(other.styleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.micmc23000.mictest.Style[ styleId=" + styleId + " ]";
    }
    
}
