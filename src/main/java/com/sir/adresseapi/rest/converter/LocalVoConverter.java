/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Local;
import com.sir.adresseapi.common.util.NumberUtil;
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
                local.setDernierAnneePaye(NumberUtil.toDouble(localVo.getDernierAnneePaye()));
            }
            if (localVo.getDernierMontantPaye()!= null) {
                local.setDernierMontantPaye(NumberUtil.toDouble(localVo.getDernierMontantPaye()));
            }
            if (localVo.getDernierTrimestrePaye()!= null) {
                local.setDernierTrimestrePaye(NumberUtil.toIneger(localVo.getDernierTrimestrePaye()));
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
        if (local != null) {
                    LocalVo localVo = new LocalVo();

               localVo.setRueVo(new RueVoConverter().toVo(local.getRue()));
                localVo.setReference(local.getReference());
                localVo.setDernierAnneePaye(NumberUtil.toDouble(local.getDernierAnneePaye()) );
                localVo.setDernierMontantPaye(NumberUtil.toDouble(local.getDernierMontantPaye()));
                localVo.setDernierTrimestrePaye(NumberUtil.toIneger(local.getDernierTrimestrePaye()));
                localVo.setRedevableVo(new RedevableVoConverter().toVO(local.getRedevable()));
                localVo.setProprietaireVo(new RedevableVoConverter().toVO(local.getProprietaire()));
                return localVo;
            }
            return null;
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
