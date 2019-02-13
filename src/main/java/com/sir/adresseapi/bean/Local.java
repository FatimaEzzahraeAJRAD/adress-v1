/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author user
 */
@Entity
public class Local implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private double  chiffreAffaire;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Redevable proprietaire;
    @ManyToOne
    private Rue rue;
    private double dernierMontantPaye ;
    private int dernierTrimestrePaye ;
    private double dernierAnneePaye ;
    private String refCategorie;

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

   
    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public Redevable getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Redevable proprietaire) {
        this.proprietaire = proprietaire;
    }
    

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }

    public String getRefCategorie() {
        return refCategorie;
    }

    public void setRefCategorie(String refCategorie) {
        this.refCategorie = refCategorie;
    }

    public double getDernierMontantPaye() {
        return dernierMontantPaye;
    }

    public void setDernierMontantPaye(double dernierMontantPaye) {
        this.dernierMontantPaye = dernierMontantPaye;
    }

    public int getDernierTrimestrePaye() {
        return dernierTrimestrePaye;
    }

    public void setDernierTrimestrePaye(int dernierTrimestrePaye) {
        this.dernierTrimestrePaye = dernierTrimestrePaye;
    }

    public double getDernierAnneePaye() {
        return dernierAnneePaye;
    }

    public void setDernierAnneePaye(double dernierAnneePaye) {
        this.dernierAnneePaye = dernierAnneePaye;
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
        if (!(object instanceof Local)) {
            return false;
        }
        Local other = (Local) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.adresseapi.bean.Local[ id=" + id + " ]";
    }
    
}
