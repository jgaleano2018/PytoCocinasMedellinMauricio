/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.cocinasmedellin;

import static com.bancodebogota.fdm.cocinasmedellin.Ingrediente.tamaño;

/**
 *
 * @author Jose Mauricio
 */
public class Receta {
    private int consecutivoReceta;
    private Ingrediente[] inventario = new Ingrediente[1];
    private String nombreReceta;
    private String descripción;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Ingrediente[] getInventario() {
        return inventario;
    }

    public void setInventario(Ingrediente[] inventario) {
        this.inventario = inventario;
    }
    
    public int getConsecutivoReceta() {
        return consecutivoReceta;
    }

    public void setConsecutivoReceta(int consecutivoReceta) {
        this.consecutivoReceta = consecutivoReceta;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public String toString(){
        return "Nombre[".concat(nombreReceta).concat("], Total Ingredientes[").concat(String.valueOf(getInventario().length)).concat("]");
    }
    
    public Ingrediente[] validarInventarioReceta(Ingrediente[] listaInventario, Plato plato){
        boolean resultado = false;        
        int contador = 0;        
        int consecutivoReceta = plato.getReceta().getConsecutivoReceta();
        Ingrediente[] arrayInventarioFaltante = new Ingrediente[1];
        
        for (int i=0; i<this.getInventario().length;i++){
            for (int j=0; j<listaInventario.length;j++){
            
                if (this.getConsecutivoReceta()==consecutivoReceta)
                {
                    if (this.getInventario()[i].consecutivo == listaInventario[j].consecutivo 
                        && ((listaInventario[j].contestura.nombreEstructura=="Solido" 
                        && listaInventario[j].contable) || listaInventario[j].contestura.nombreEstructura=="Liquido")){  
                        if ( this.getInventario()[i].cantidad > listaInventario[i].cantidad){ 
                            contador++;                            
                            arrayInventarioFaltante = addInventario(listaInventario[i], arrayInventarioFaltante);                            
                        }
                    }
                    else {
                        
                        if (this.getInventario()[i].consecutivo == listaInventario[j].consecutivo 
                        && (listaInventario[j].contestura.nombreEstructura=="Solido" 
                        && listaInventario[j].contable == false)){                            
                            this.setError("El ingrediente: " + this.getInventario()[i].getNombre() + " es tipo Solido y por lo tanto debe ser Contable.");
                            break;
                        }
                    }
                }
                
            }
        }        
        return (arrayInventarioFaltante);//(this.getInventario().length != contador ? false : true);
    }
    
    
    public Ingrediente[] addInventario(Ingrediente ingrediente, Ingrediente[] inventario){
        
        int tamaño = (inventario.length + 1);       
        Ingrediente[] inventarioAux = new Ingrediente[tamaño];
        
        for (int i = 0; i<inventario.length; i++){ 
            inventarioAux[i] = inventario[i];            
        }
        
        inventarioAux[tamaño-1] = ingrediente; 
        
        return (inventarioAux);
    }
 
}
