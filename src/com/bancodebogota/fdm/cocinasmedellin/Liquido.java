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
public class Liquido extends Ingrediente {
    
    public int Consecutivo;
    public String Nombre;

    public int getConsecutivo() {
        return Consecutivo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setConsecutivo(int Consecutivo) {
        this.Consecutivo = Consecutivo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
