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
            if (rueVo.getQuartierVo()!= null) {
                rue.setQuartier(new QuartierVoConverter().toItem(rueVo.getQuartierVo()));
            }
            if (rueVo.getLocalsVo()!= null) {
                rue.setLocals(new LocalVoConverter().toItem(rueVo.getLocalsVo()));
            }
            }
        return rue;
        }
     
    public RueVo toVo(Rue rue) {
        RueVo rueVo = new RueVo();
        if (rue != null) {
             if (rue.getReference() != null) {
                rueVo.setReference(rue.getReference());
            }
            if (rue.getQuartier()!= null) {
                rueVo.setQuartierVo(new QuartierVoConverter().toVo(rue.getQuartier()));
            }
            if (rue.getLocals()!= null) {
                rueVo.setLocalsVo( new LocalVoConverter().toVo(rue.getLocals()));
            }
            }
        return rueVo;
    }

    public List<RueVo> toVo(List<Rue> rues) {
        List<RueVo> rueVos = new ArrayList();
        if (rues != null && !rues.isEmpty()) {
            for (Rue rue : rues) {
                rueVos.add(toVo(rue));
            }
        }
        return rueVos;
    }

    
}
