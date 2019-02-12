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
        }
        return local;
    }
    public Local toVO(LocalVo localVo) {
        Local local = new Local();
        if (localVo != null) {
            if (localVo.getRue()!= null) {
               local.setRue(localVo.getRue());
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
        }
        return local;
    }

    public List<LocalVo> toVo(List<Local> locals) {
        List<LocalVo> localVos = new ArrayList();
        if (locals != null && !localVos.isEmpty()) {
            for (Local local : locals) {
                localVos.add(local);
            }
        }
        return localVos;
    }

    
}
