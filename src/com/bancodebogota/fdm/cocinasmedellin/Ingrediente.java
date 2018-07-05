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
public class Ingrediente {
    public int consecutivo;
    public String nombre;
    public int cantidad;    
    public EstructuraIngrediente contestura;
    public boolean contable;
    public static final int tamaño = 100;

    public static int getTamaño() {
        return tamaño;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public boolean isContable() {
        return contable;
    }

    public void setContable(boolean contable) {
        this.contable = contable;
    }
    
    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setContestura(EstructuraIngrediente contestura) {
        this.contestura = contestura;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public String getNombre() {
        return nombre;
    }


    public EstructuraIngrediente getContestura() {
        return contestura;
    }    
         
    @Override
    public String toString(){
        return "Nombre[".concat(nombre).concat("], Cantidad[").concat(String.valueOf(cantidad)).concat("], Contestura[").concat(contestura.getNombreEstructura()).concat("], Contable[".concat(contable ? Si : No)).concat("], Total Ingrediente[").concat(String.valueOf(tamaño));
    }
    
    /*void updateInventario(int consecutivoIngrediente, int cantidad, Ingrediente[] listaInventario){ 
        if (this.consecutivo == consecutivoIngrediente){
            
            for (int i=0; i<listaInventario.length;i++){

                if (listaInventario[i].consecutivo == consecutivoIngrediente){  

                    listaInventario[i].cantidad = listaInventario[i].cantidad - cantidad;

                }
            }
        }        
    }
    
    public Ingrediente[] addIngrediente(Ingrediente[] listaIngredientes, String nombreIngrediente, int cantidad, EstructuraIngrediente contestura ){
    
        Ingrediente newIngrediente = new Ingrediente();
        
        newIngrediente.nombre = nombreIngrediente;
        newIngrediente.cantidad = cantidad;
        newIngrediente.contestura = contestura;
        
        int tamaño = (listaIngredientes.length + 1);       
        Ingrediente[] listaIngredientesAux = new Ingrediente[tamaño];
        
        for (int i = 0; i<listaIngredientes.length; i++){ 
            listaIngredientesAux[i] = listaIngredientes[i];            
        }
        
        listaIngredientesAux[tamaño-1] = newIngrediente; 
        
        return (listaIngredientesAux);
    }*/
    
}
