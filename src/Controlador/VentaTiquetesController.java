/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import exceptions.ReservaAceptadaException;
import modelo.Caseta;
import modelo.Cliente;
import modelo.Devolucion;
import modelo.Reserva;
import modelo.Viaje;
import singleton.Singleton;
import util.IList;

/**
 *
 * @author USUARIO
 */
public class VentaTiquetesController {
    
    private Caseta caseta;

    public VentaTiquetesController(Caseta caseta) {
        this.caseta = caseta;
    }
    
    public IList<Viaje> getViajes (){
        return caseta.getEmpresa().getViajes();
    }
    
    public Viaje obteneViajePorCodigo(String codigo){
        return caseta.getEmpresa().obtenerViajePorCodigo(codigo);
    }
            
    public Cliente obtenerClientePorCedula (String cedula,Viaje viaje){
        return viaje.obtenerClientePorCedula(cedula);
    }
    
    public void inscribirReservaConfirmada(Reserva reserva){

        reserva.inscribirReserva();
        
    }
    
    public void confirmarReserva(Reserva reserva){  
        reserva.setEstado(Reserva.ACEPTADA);
    }
    
    public void CancelarReserva(Reserva reserva,String razon) throws ReservaAceptadaException{
        if(reserva.getEstado().equals(Reserva.ACEPTADA)){
            throw new ReservaAceptadaException();
        }
        
        reserva.devolorverReserva(razon);
        
        Singleton.getINSTANCE().escribirSingleton();
    }
    
    
    
}
