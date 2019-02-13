/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Local;
import com.sir.adresseapi.rest.vo.LocalVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jawadoo
 */
public class LocalVoConverter {
    
     public Local toItem(LocalVo localVo) {
        Local local = new Local();
        if (localVo != null) {
            if (localVo.getRueVo()!= null) {
               local.setRue(new RueVoConverter().toItem(localVo.getRueVo()));
            }
             
            if (localVo.getReference() != null) {
                local.setReference(localVo.getReference());
            }
            if (localVo.getDernierAnneePaye()!= null) {
                local.setDernierAnneePaye(new Integer(localVo.getDernierAnneePaye()));
            }
            if (localVo.getDernierMontantPaye()!= null) {
                local.setDernierMontantPaye(new Double(localVo.getDernierMontantPaye()));
            }
            if (localVo.getDernierTrimestrePaye()!= null) {
                local.setDernierTrimestrePaye(new Integer(localVo.getDernierTrimestrePaye()));
            }
            if (localVo.getRedevableVo()!= null) {
                local.setRedevable(new RedevableVoConverter().toItem(localVo.getRedevableVo()));
            }
            if (localVo.getProprietaireVo()!= null) {
                local.setProprietaire(new RedevableVoConverter().toItem(localVo.getProprietaireVo()));
            }
           
        }
        return local;
    }
    public LocalVo toVO(Local local) {
        LocalVo localVo = new LocalVo();
        if (local != null) {
            if (local.getRue()!= null) {
               localVo.setRueVo(new RueVoConverter().toVo(local.getRue()));
            }
            if (local.getReference() != null) {
                localVo.setReference(local.getReference());
            }
            if (local.getDernierAnneePaye()!= null) {
                localVo.setDernierAnneePaye(new Integer(local.getDernierAnneePaye()));
            }
            if (local.getDernierMontantPaye()!= null) {
                localVo.setDernierMontantPaye(new Double(localVo.getDernierMontantPaye()));
            }
            if (local.getDernierTrimestrePaye()!= null) {
                local.setDernierTrimestrePaye(new Integer(localVo.getDernierTrimestrePaye()));
            }
            if (local.getRedevable()!= null) {
                localVo.setRedevableVo(new RedevableVoConverter().toVO(local.getRedevable()));
            }
            if (local.getProprietaire()!= null) {
                localVo.setProprietaireVo(new RedevableVoConverter().toVO(local.getProprietaire()));
            }
            
        }
        return localVo;
    }

   public List<LocalVo> toVo(List<Local> locals) {
        List<LocalVo> localVos = new ArrayList();
        if (locals != null && !locals.isEmpty()) {
            for (Local local : locals) {
                localVos.add(toVo(local));
            }
        }
        return localVos;
    }

    
}
