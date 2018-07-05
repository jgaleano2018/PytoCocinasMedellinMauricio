/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.cocinasmedellin;

/**
 *
 * @author Jose Mauricio
 */
public class EstructuraIngrediente {
    
    public int consecutivo;
    public String nombreEstructura;

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setNombreEstructura(String nombreEstructura) {
        this.nombreEstructura = nombreEstructura;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public String getNombreEstructura() {
        return nombreEstructura;
    }
    
}
