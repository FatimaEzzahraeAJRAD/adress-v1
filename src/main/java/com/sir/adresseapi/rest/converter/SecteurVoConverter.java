/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Rue;
import com.sir.adresseapi.bean.Secteur;
import com.sir.adresseapi.rest.vo.RueVo;
import com.sir.adresseapi.rest.vo.SecteurVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jawadoo
 */
public class SecteurVoConverter {
     public Secteur toItem( SecteurVo secteurVo) {
        Secteur secteur = new Secteur();
        if (secteurVo != null) {
            if (secteurVo.getReference() != null) {
                secteur.setReference(secteurVo.getReference());
            }
            if (secteurVo.getQuartiers()!= null) {
                secteur.setQuartier(new QuartierVoConverter().toItem(secteurVo.getQuartiers()));
            }
           
            }
        return secteur;
        }
     
     public SecteurVo toVo(Secteur secteur) {
        SecteurVo secteurVo = new SecteurVo();
        if (secteur != null) {
            if (secteur.getReference() != null) {
                secteurVo.setReference(secteur.getReference());
            }
            if (secteur.getQuartiers()!= null) {
                secteurVo.setQuartiers(new QuartierVoConverter().toVo(secteur.getQuartiers()));
            }
           
            }
        return secteurVo;
        }
     
   

    public List<SecteurVo> toVo(List<Secteur> secteurs) {
        List<SecteurVo> secteurVos = new ArrayList();
        if (secteurs != null && !secteurs.isEmpty()) {
            for (Secteur secteur : secteurs) {
                secteurVos.add(toVo(secteur));
            }
        }
        return secteurVos;
    }

    
}
