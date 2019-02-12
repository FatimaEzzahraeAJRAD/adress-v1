/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Local;
import com.sir.adresseapi.bean.Redevable;
import com.sir.adresseapi.rest.vo.LocalVo;
import com.sir.adresseapi.rest.vo.RedevableVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class RedevableVoConverter {
    
    public Redevable toItem(RedevableVo redevableVo) {
        Redevable redevable = new Redevable();
        if (redevableVo != null) {
            
             
            if (redevableVo.getNom() != null) {
                redevable.setNom(redevableVo.getNom());
            }
            
            if (redevableVo.getCin()!= null) {
                redevable.setCin(redevableVo.getCin());
            }
            if (redevableVo.getAdresse()!= null) {
                redevable.setAdresse(redevableVo.getAdresse());
            }
            if (redevableVo.getPrenom()!= null) {
                redevable.setPrenom(redevableVo.getPrenom());
            }
            if (redevableVo.getTelephone()!= null) {
                redevable.setTelephone(redevableVo.getTelephone());
            }
            if (redevableVo.getMatricule()!= null) {
                redevable.setMatricule(redevableVo.getMatricule());
            }
            
            
            
        }
        return redevable;
    }
    public RedevableVo toVO(Redevable redevable) {
        RedevableVo redevableVo = new RedevableVo();
        if (redevable != null) {
            if (redevable.getCin()!= null) {
               redevableVo.setCin(redevable.getCin());
            }
            
            if (redevable.getNom()!= null) {
               redevableVo.setNom(redevable.getNom());
            }
            if (redevable.getAdresse()!= null) {
                redevableVo.setAdresse(redevable.getAdresse());
            }
            if (redevable.getPrenom()!= null) {
                redevableVo.setPrenom(redevable.getPrenom());
            }
            if (redevable.getTelephone()!= null) {
                redevableVo.setTelephone(redevable.getTelephone());
            }
            if (redevable.getMatricule()!= null) {
                redevableVo.setMatricule(redevable.getMatricule());
            }
            
            
        }
        return redevableVo;
    }

//    public List<RedevableVo> toVo(List<Redevable> redevables) {
//        List<RedevableVo> redevableVos = new ArrayList();
//        if (redevables != null && !redevables.isEmpty()) {
//            for (Redevable redevable : redevables) {
//                redevableVos.add(toVo(redevable));
//            }
//        }
//        return redevableVos;
//    }

    
}
