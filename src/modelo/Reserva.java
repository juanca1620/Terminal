/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Reserva implements Serializable{
    
    public static final String ACTIVA = "Activa";
    public static final String ACEPTADA = "Aceptada";
    public static final String INACTIVA = "Inactiva";
    private Cliente cliente;
    private Viaje viaje;
    private int cantidad_sillas;
    private double valor_total;
    private String estado;

    public Reserva(Cliente cliente, int cantidad_sillas,Viaje viaje) {
        this.cliente = cliente;
        this.cantidad_sillas = cantidad_sillas;
        this.valor_total = cantidad_sillas *  viaje.getCosto();
        this.viaje = viaje;
        this.estado = ACTIVA;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidad_sillas() {
        return cantidad_sillas;
    }

    public void setCantidad_sillas(int cantidad_sillas) {
        this.cantidad_sillas = cantidad_sillas;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
    
    
    
}
