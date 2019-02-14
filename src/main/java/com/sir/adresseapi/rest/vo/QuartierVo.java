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

   private Long id;
    private String reference;
    
    private SecteurVo secteurVo;
    private List<RueVo> rueVos;

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

    public SecteurVo getSecteurVo() {
        return secteurVo;
    }

    public void setSecteurVo(SecteurVo secteurVo) {
        this.secteurVo = secteurVo;
    }

    public List<RueVo> getRueVos() {
        return rueVos;
    }

    public void setRueVos(List<RueVo> rueVos) {
        this.rueVos = rueVos;
    }


}