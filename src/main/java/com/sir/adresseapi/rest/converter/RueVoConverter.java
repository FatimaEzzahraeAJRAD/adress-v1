/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.converter;

import com.sir.adresseapi.bean.Local;
import com.sir.adresseapi.bean.Quartier;
import com.sir.adresseapi.bean.Rue;
import com.sir.adresseapi.rest.vo.LocalVo;
import com.sir.adresseapi.rest.vo.RueVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jawadoo
 */
public class RueVoConverter {
     public Rue toItem( RueVo rueVo) {
        Rue rue = new Rue();
        if (rueVo != null) {
            if (rueVo.getReference() != null) {
                rue.setReference(rueVo.getReference());
            }
            if (rueVo.getQuartier()!= null) {
                rue.setQuartier(new QuartierVoConverter.toItem( rueVo.getQuartier()));
            }
            if (rueVo.getLocals()!= null) {
                rue.setLocals( new LocalVoConverter.toItem(rueVo.getLocals()));
            }
            }
        return rue;
        }
     
    public Rue toVO(RueVo rueVo) {
        Rue rue = new Rue();
        if (rueVo != null) {
             if (rueVo.getReference() != null) {
                rue.setReference(rueVo.getReference());
            }
            if (rueVo.getQuartier()!= null) {
                rue.setQuartier(new QuartierVoConverter.toItem( rueVo.getQuartier()));
            }
            if (rueVo.getLocals()!= null) {
                rue.setLocals( new LocalVoConverter.toItem(rueVo.getLocals()));
            }
            }
        return rue;
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
