/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.vo;

import com.sir.adresseapi.bean.*;
import java.io.Serializable;
import java.util.List;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
public class QuartierVo implements Serializable {

   

    private static final long serialVersionUID = 1L;
   
    
    private String reference;
    
    @ManyToOne
    private SecteurVo secteurVo;
    @OneToMany(mappedBy = "quartier")
    private List<RueVo> ruesVo;

    

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public SecteurVo getSecteurVo() {
        return secteurVo;
    }

    public void setSecteurVo(SecteurVo secteurVo) {
        this.secteurVo = secteurVo;
    }

    public List<RueVo> getRuesVo() {
        return ruesVo;
    }

    public void setRuesVo(List<RueVo> ruesVo) {
        this.ruesVo = ruesVo;
    }

   

    

  
    
}
