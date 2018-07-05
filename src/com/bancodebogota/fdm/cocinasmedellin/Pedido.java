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
public class Pedido {
    public int consecutivoPedido;
    public int consecutivoPlato;
    public int consecutivoCliente;
    public String fecha;
    public int porcentajePago;
    public int cantidad;
    public double porcion;

    public int getConsecutivoCliente() {
        return consecutivoCliente;
    }

    public void setConsecutivoCliente(int consecutivoCliente) {
        this.consecutivoCliente = consecutivoCliente;
    }

    public double getPorcion() {
        return porcion;
    }

    public void setPorcion(double porcion) {
        this.porcion = porcion;
    }

    public void setConsecutivoPedido(int consecutivoPedido) {
        this.consecutivoPedido = consecutivoPedido;
    }

    public void setConsecutivoPlato(int consecutivoPlato) {
        this.consecutivoPlato = consecutivoPlato;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPorcentajePago(int porcentajePago) {
        this.porcentajePago = porcentajePago;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getConsecutivoPedido() {
        return consecutivoPedido;
    }

    public int getConsecutivoPlato() {
        return consecutivoPlato;
    }

    public String getFecha() {
        return fecha;
    }

    public int getPorcentajePago() {
        return porcentajePago;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    @Override
    public String toString(){
        return "#Pedido[".concat(String.valueOf(consecutivoPedido)).concat("], Porcentaje Pago[").concat(String.valueOf(porcentajePago)).concat("], Cantidad[").concat(String.valueOf(cantidad)).concat("], Porcion[").concat(String.valueOf(porcion)).concat("]");
    }
    
    /*public Object[] GenerarPedido(int consecutivoCliente, int consecutivoReceta, String fechaPedido){
    
        Object[] arrayPedido = new Object[10];
        
        Plato plato = new Plato();
        double valorPlato = plato.getValorPorcionPlato(consecutivoReceta);        
        String descripcionPlato = plato.getPorcionPlato(consecutivoReceta);
        
        if (this.consecutivoCliente == consecutivoCliente && this.fecha == fechaPedido){
            
            object[0] = consecutivoCliente;
            object[1] = 
            
        }
        else {
            return (null);
        }
        
        return (arrayPedido);
    }*/
}
