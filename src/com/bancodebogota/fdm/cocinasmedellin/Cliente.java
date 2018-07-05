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
public class Cliente {
    public int consecutivo;
    public String nombre;
    public String cedula;

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
    
    @Override
    public String toString(){
        return "#Cédula[".concat(cedula).concat("], Nombre[").concat(nombre).concat("]");
    }

    //PagarFactura()
}
