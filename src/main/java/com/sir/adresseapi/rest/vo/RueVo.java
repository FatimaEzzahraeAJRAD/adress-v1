/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.vo;

import com.sir.adresseapi.bean.*;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
public class RueVo implements Serializable {

    


    private static final long serialVersionUID = 1L;
    private String reference;
    @ManyToOne
    private QuartierVo quartier;
    @OneToMany(mappedBy = "rue")
    private List<LocalVo> locals;

 
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public QuartierVo getQuartier() {
        return quartier;
    }

    public void setQuartier(QuartierVo quartier) {
        this.quartier = quartier;
    }

    public List<LocalVo> getLocals() {
        return locals;
    }

    public void setLocals(List<LocalVo> locals) {
        this.locals = locals;
    }
}
