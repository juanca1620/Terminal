/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import exceptions.ClienteConReservaException;
import exceptions.ViajeLlenoException;
import modelo.Cliente;
import modelo.Reserva;
import modelo.Viaje;
import singleton.Singleton;
import util.IList;

/**
 *
 * @author USUARIO
 */
public class ClienteController {
    
    private Cliente cliente;
    
    public ClienteController(Cliente cliente){
        this.cliente = cliente;
    }

    public void agregarReserva (Reserva reserva) throws ClienteConReservaException, ViajeLlenoException{
        
        Reserva aux = buscarReservaPorCodigoCliente(reserva.getViaje().getCodigo());
        
        if(aux != null){
            throw new ClienteConReservaException();
        }
        
        if(!reserva.getViaje().isThereSpace(reserva)){
            throw new ViajeLlenoException();
        }
        
         cliente.sumarPuntos((int) reserva.getValor_total()/10000 * 3);
         cliente.agregarReserva(reserva);
         
         reserva.getViaje().addReserva(reserva);
         Singleton.getINSTANCE().escribirSingleton();
    }
    
    public static Viaje obtenerViajePorCodigo (String codigo){
        return ViajeController.obtenerViajePorCodigo(codigo);
    }
    
    public Reserva buscarReservaPorCodigoCliente (String codigoViaje){
        IList<Reserva> reservas = cliente.getReservas();
        
        for (int i = 0; i < reservas.size(); i++) {
            Reserva reserva = reservas.get(i);
            if(reserva.getViaje().getCodigo().equals(codigoViaje)){
                return reserva;
            }
        }
        return null;
    }
}
