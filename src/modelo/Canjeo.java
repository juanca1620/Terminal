/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author USUARIO
 */
public class Canjeo implements Serializable{
    
    private int catidad_puntos;
    private LocalDateTime hora;
    private Reserva reserva;

    public Canjeo(int catidad_puntos, Reserva reserva) {
        this.catidad_puntos = catidad_puntos;
        this.hora = LocalDateTime.now();
        this.reserva = reserva;
    }

    public int getCatidad_puntos() {
        return catidad_puntos;
    }

    public void setCatidad_puntos(int catidad_puntos) {
        this.catidad_puntos = catidad_puntos;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
    
}
