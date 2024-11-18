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
public class Caseta implements Serializable{
       
    public static final String OCUPADO = "Ocupado";
    public static final String DISPONIBLE = "Disponible";
    
    private int slots;
    private double precio;
    private Empresa empresa;
    private String estado;
    private String ciudadOrigen;

    public Caseta() {
        this.estado = DISPONIBLE;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void addEmpresa(Empresa empresa,int slots,double precio,String ciudadOrigen) {
        this.empresa = empresa;
        this.precio = precio;
        this.slots = slots;
        this.ciudadOrigen = ciudadOrigen;
        this.estado = OCUPADO;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    
    
}
