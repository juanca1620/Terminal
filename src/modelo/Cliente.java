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
        this.buzon = new Buzon();
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
    
    public void eliminarReserva (Reserva reserva){
        reservas.remove(reserva);
        restarPuntos((int)(reserva.getValor_total()/10000) * 3);
    }
    
    public void agregarDevolucion(Devolucion devolucion){
        devoluciones.add(devolucion);
        Mensaje mensaje = new Mensaje("Sistema", devolucion.getMotivo());
        agregarMensaje(mensaje);
    }
    
    
    public void hacerDevolucion(String codigoViaje,String razon){
        Reserva reserva = encontrarRservaPorCodigo(codigoViaje);
        
        reserva.devolorverReserva(razon);
        
    }
    
    public Reserva encontrarRservaPorCodigo(String codigoViaje){
                IList<Reserva> reservas = this.reservas;
        
        for (int i = 0; i < reservas.size(); i++) {
            Viaje viaje = reservas.get(i).getViaje();
            if(viaje.getCodigo().equals(codigoViaje)){
                return reservas.get(i);
            }
        }
        return null;
    }
}
