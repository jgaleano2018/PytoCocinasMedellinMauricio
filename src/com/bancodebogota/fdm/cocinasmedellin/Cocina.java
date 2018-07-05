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
public class Cocina {
   private int Consecutivo;
   private String especialidad; 
   private String direccion;
   private String telefono;
   private Chef jefeCocina;
   private String nombre;

    public int getConsecutivo() {
        return Consecutivo;
    }

    public void setConsecutivo(int Consecutivo) {
        this.Consecutivo = Consecutivo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Chef getJefeCocina() {
        return jefeCocina;
    }

    public void setJefeCocina(Chef jefeCocina) {
        this.jefeCocina = jefeCocina;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString(){
        return "Nombre[".concat(nombre).concat("], Especialidad[").concat(especialidad).concat("], Jefe de Cocina[").concat(jefeCocina.getNombre()).concat("]");
    }
}
