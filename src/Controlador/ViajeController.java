/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import exceptions.HorariosTrocadosException;
import java.time.LocalDateTime;
import modelo.Buz;
import modelo.Caseta;
import modelo.Empresa;
import modelo.Viaje;
import singleton.Singleton;

/**
 *
 * @author USUARIO
 */
public class ViajeController {
    
    private Caseta caseta;
    private Empresa empresa;

    public ViajeController(Caseta caseta) {
        this.caseta = caseta;
        this.empresa = caseta.getEmpresa();
    }
    
    public Viaje crearViaje(String lugarDestino,LocalDateTime horaInicio,LocalDateTime horaFin,double costo){
        return new Viaje(
                empresa.getNombreEmpresa(), 
                caseta.getCiudadOrigen(), 
                lugarDestino,
                horaInicio, 
                horaFin, 
                caseta.getSlots(),
                costo);
    }
    
    public Buz obtenerBuzPorPlaca (String placa){
        return BucesController.buscarBusPorPlaca(placa);
    }
    
    public void agregarViaje (Buz buz,Viaje viaje) throws HorariosTrocadosException{
        boolean sePuedeAgregar = buz.canAddAtravel(viaje);
        if(!sePuedeAgregar){
            throw new HorariosTrocadosException("Buz", "Algun viaje");
        }
        buz.addViaje(viaje);
        Singleton.getINSTANCE().escribirCasetas();
    }
}
