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
public class Plato {
    public int consecutivo;
    private String nombre;    
    public Receta receta;    
    public double precio;
    
    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
    
    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString(){
        return "Nombre Plato[".concat(nombre).concat("], Nombre Receta[").concat(receta.getNombreReceta()).concat("], Precio[").concat(String.valueOf(precio)).concat("]");
    }
   
    /*public double getValorPorcionPlato(int consecutivoReceta){
        
        if (this.receta.consecutivoReceta == consecutivoReceta)
        {
            if (this.porcion == 1)
            {
                return (this.precio);
            }
            else {
                return (this.precio * 0.8);
            }
        }
        else {
            return (0.00);
        }
    }
    
    public String getPorcionPlato(int consecutivoReceta){
        
        String descripcionPorcion = "";
        if (this.receta.consecutivoReceta == consecutivoReceta)
        {
            if (this.porcion == 1)
            {
                descripcionPorcion = "Plato Completo";
            }
            else {
                descripcionPorcion = "Medio Plato";
            }
        }
        
        return (descripcionPorcion);
    }*/
}
