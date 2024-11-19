/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;
import util.IList;
import util.Lista;

/**
 *
 * @author USUARIO
 */
public class Cliente extends Persona{
    
    private int puntos;
    private IList<Canjeo> canjeos;
    private IList<Devolucion> devoluciones;
    private IList<Reserva> reservas;
    private Buzon buzon;

    public Cliente(String nombre, String cedula, LocalDateTime fecha_nacimiento, String userName, String contrasenna, String rol) {
        super(nombre, cedula, fecha_nacimiento, userName, contrasenna, rol);
        this.canjeos = new Lista<>();
        this.devoluciones = new Lista<>();
        this.reservas = new Lista<>();
    }

    public int getPuntos() {
        return puntos;
    }

    public IList<Canjeo> getCanjeos() {
        return canjeos;
    }

    public IList<Devolucion> getDevoluciones() {
        return devoluciones;
    }

    public IList<Reserva> getReservas() {
        return reservas;
    }

    public Buzon getBuzon() {
        return buzon;
    }
    
    public void sumarPuntos(int puntos){
        this.puntos+=puntos;
    }
    public void restarPuntos(int puntos){
        this.puntos-=puntos;
    }
    
    public void agregarMensaje(Mensaje mensaje){
        buzon.addMensaje(mensaje);
    }
    
    public void agregarReserva (Reserva reserva){
        reservas.add(reserva);
    }
}
