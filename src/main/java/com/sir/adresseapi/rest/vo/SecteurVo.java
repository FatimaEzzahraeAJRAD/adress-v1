/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.adresseapi.rest.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
public class SecteurVo implements Serializable {

   private Long id;
    private String reference;
    private List<QuartierVo> quartierVos;

}
