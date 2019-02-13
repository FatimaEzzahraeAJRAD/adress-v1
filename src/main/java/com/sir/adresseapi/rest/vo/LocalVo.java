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
    private RedevableVo redevableVo;
    @ManyToOne
    private RedevableVo proprietaireVo;
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

    public RedevableVo getRedevableVo() {
        return redevableVo;
    }

    public void setRedevableVo(RedevableVo redevableVo) {
        this.redevableVo = redevableVo;
    }

    public RedevableVo getProprietaireVo() {
        return proprietaireVo;
    }

    public void setProprietaireVo(RedevableVo proprietaireVo) {
        this.proprietaireVo = proprietaireVo;
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
