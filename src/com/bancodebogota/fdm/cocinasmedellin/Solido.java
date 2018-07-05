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

    public int getNombre() {
        return nombre;
    }
    public int nombre;

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
    public int contarInventario(int consecutivoIngrediente){       
        int totalUnidades = 0;
        
        return (totalUnidades);
    }
}
