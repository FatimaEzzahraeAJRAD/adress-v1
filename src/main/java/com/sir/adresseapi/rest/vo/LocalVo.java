/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.vo;

import java.io.Serializable;
import javax.persistence.ManyToOne;

/**
 *
 * @author user
 */
public class LocalVo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private String reference;
    @ManyToOne
    private RedevableVo redevable;
    @ManyToOne
    private RedevableVo proprietaire;
    @ManyToOne
    private RueVo rueVo;
    private String dernierMontantPaye ;
    private String dernierTrimestrePaye ;
    private String dernierAnneePaye ;
    private String refCategorie;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public RedevableVo getRedevable() {
        return redevable;
    }

    public void setRedevable(RedevableVo redevable) {
        this.redevable = redevable;
    }

    public RedevableVo getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(RedevableVo proprietaire) {
        this.proprietaire = proprietaire;
    }

    public RueVo getRueVo() {
        return rueVo;
    }

    public void setRueVo(RueVo rueVo) {
        this.rueVo = rueVo;
    }

    public String getDernierMontantPaye() {
        return dernierMontantPaye;
    }

    public void setDernierMontantPaye(String dernierMontantPaye) {
        this.dernierMontantPaye = dernierMontantPaye;
    }

    public String getDernierTrimestrePaye() {
        return dernierTrimestrePaye;
    }

    public void setDernierTrimestrePaye(String dernierTrimestrePaye) {
        this.dernierTrimestrePaye = dernierTrimestrePaye;
    }

    public String getDernierAnneePaye() {
        return dernierAnneePaye;
    }

    public void setDernierAnneePaye(String dernierAnneePaye) {
        this.dernierAnneePaye = dernierAnneePaye;
    }

    public String getRefCategorie() {
        return refCategorie;
    }

    public void setRefCategorie(String refCategorie) {
        this.refCategorie = refCategorie;
    }

   

    
    
}
