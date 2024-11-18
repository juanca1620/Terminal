/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import exceptions.FechaNoValidaException;
import java.io.Serializable;
import java.time.LocalDateTime;
import util.IList;
import util.IQueue;
import util.Queue;

/**
 *
 * @author USUARIO
 */
public class Viaje implements Serializable{
    
    private String nombre_empresa;
    private IList<Reserva> reservas;
    private String lugarOrigen;
    private String lugarDestino;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private LocalDateTime fechaCreacion;
    private int cuposMaximos;
    private double costo;
    private IQueue<Reserva> listaEspera;
    
    public Viaje(String nombre_empresa, String lugarOrigen, String lugarDestino, LocalDateTime horaInicio, LocalDateTime horaFin, int cuposMaximos,double costo) {
        if(horaInicio.isAfter(horaFin) || horaInicio.isBefore(LocalDateTime.now()) || horaFin.isBefore(LocalDateTime.now())){
            throw new FechaNoValidaException("del viaje");
        }
        this.nombre_empresa = nombre_empresa;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.fechaCreacion = LocalDateTime.now();
        this.cuposMaximos = cuposMaximos;
        this.costo = costo;
        this.listaEspera = new Queue<>();
    }
    public boolean isThereSpace(Reserva reserva){
        int cantidadPasajeros = 0;
        for (int i = 0; i < reservas.size(); i++) {
            cantidadPasajeros+=reservas.get(i).getCantidad_sillas();
        }
        return cantidadPasajeros + reserva.getCantidad_sillas() <= cuposMaximos;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public IList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(IList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }

    public int getCuposMaximos() {
        return cuposMaximos;
    }

    public void setCuposMaximos(int cuposMaximos) {
        this.cuposMaximos = cuposMaximos;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public IQueue<Reserva> getListaEspera() {
        return listaEspera;
    }

    public void setListaEspera(IQueue<Reserva> listaEspera) {
        this.listaEspera = listaEspera;
    }
    
    
}
