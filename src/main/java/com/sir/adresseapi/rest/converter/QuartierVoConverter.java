/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Quartier;
import com.sir.adresseapi.bean.Redevable;
import com.sir.adresseapi.rest.vo.QuartierVo;
import com.sir.adresseapi.rest.vo.RedevableVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class QuartierVoConverter {
    
     public Quartier toItem(QuartierVo quartierVo) {
         Quartier quartier = new Quartier();
        if (quartierVo != null) {
            
             
            if (quartierVo.getReference()!= null) {
                quartier.setReference(quartierVo.getReference());
            }
            
             
            if (quartierVo.getRuesVo()!= null) {
                quartier.setRuesVo(new RueVoConverter().toItem(quartierVo.getRuesVo()));
            }
            
             
            if (quartierVo.getSecteurVo()!= null) {
                quartier.setSecteurVo(new SecteurVoConverter().toItem(quartierVo.getSecteurVo()));
            }
            
            
            
            
        }
        return quartier;
    }
    public QuartierVo toVO(Quartier quartier) {
         QuartierVo quartierVo = new QuartierVo();
        if (quartier != null) {
            
             
            if (quartier.getReference()!= null) {
                quartierVo.setReference(quartier.getReference());
            }
            
             
            if (quartier.getRues()!= null) {
                quartierVo.setRuesVo(new RueVoConverter().toVo(quartier.getRues()));
            }
            
             
            if (quartierVo.getSecteurVo()!= null) {
                quartier.setSecteurVo(new SecteurVoConverter().toVo(quartier.getSecteur()));
            }
            
            
            
            
        }
        return quartierVo;
    }
//    public List<QuartierVo> toVo(List<Quartier> quartiers) {
//        List<QuartierVo> quartierVos = new ArrayList();
//        if (quartiers != null && !quartiers.isEmpty()) {
//            for (Quartier quartier : quartiers) {
//                quartierVos.add(toVo(quartier));
//            }
//        }
//        return quartierVos;
//    }

    
    
}
