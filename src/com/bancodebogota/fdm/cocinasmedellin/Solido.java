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
public class Solido extends Ingrediente {    
    public int consecutivo;

    public int getConsecutivo() {
        return consecutivo;
    }

    public String getNombre() {
        return nombre;
    }
    public String nombre;

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int contarInventario(int consecutivoIngrediente){       
        int totalUnidades = 0;
        
        return (totalUnidades);
    }
}
