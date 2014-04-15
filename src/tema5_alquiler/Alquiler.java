/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tema5_alquiler;

import java.util.GregorianCalendar;

/**
 *
 * @author ProfVespertino
 */
public class Alquiler {
    private Cliente cliente;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFinal;
    private int posicion;
    private Barco barco;

    public Alquiler(Cliente cliente, GregorianCalendar fechaInicio, GregorianCalendar fechaFinal, int posicion, Barco barco) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.posicion = posicion;
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(GregorianCalendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public int calculaDias () {
        long numero1, numero2, diferencia; 
        int dias;
        
        numero1 = fechaInicio.getTimeInMillis();
        numero2 = fechaFinal.getTimeInMillis();
        diferencia = numero2 - numero1;
        dias = (int)diferencia / (1000*60*60*24);
        return dias;
    }
    
    
    
}
