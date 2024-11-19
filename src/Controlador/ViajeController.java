/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import exceptions.HorariosTrocadosException;
import exceptions.IdentificadorRepetidoException;
import java.time.LocalDateTime;
import modelo.Buz;
import modelo.Caseta;
import modelo.Empresa;
import modelo.Viaje;
import singleton.Singleton;
import util.IList;
import util.Lista;

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
    
    public Viaje crearViaje(String codigo,String lugarDestino,LocalDateTime horaInicio,LocalDateTime horaFin,double costo){
        return new Viaje(
                codigo,
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
    
    public void agregarViaje (Buz buz,Viaje viaje) throws HorariosTrocadosException, IdentificadorRepetidoException{
        boolean sePuedeAgregar = buz.canAddAtravel(viaje);
        if(!sePuedeAgregar){
            throw new HorariosTrocadosException("Buz", "Algun viaje");
        }
        
        Viaje aux = obtenerViajePorCodigo(viaje.getCodigo());
        
        if(aux != null){
            throw new IdentificadorRepetidoException("Codigo del viaje");
        }
        buz.addViaje(viaje);
        Singleton.getINSTANCE().escribirSingleton();
    }
    
    public static Viaje obtenerViajePorCodigo (String codigo){
        Caseta[][] casetas = Singleton.getINSTANCE().getCasetas();
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if(empresa != null){
                    IList<Viaje> viajes = empresa.getViajes();
                    
                    for (int k = 0; k < viajes.size(); k++) {
                        Viaje viaje = viajes.get(k);
                        
                        if(viaje.getCodigo().equals(codigo)){
                            return viaje;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static IList<Viaje> obtenerViajes (){
        Caseta[][] casetas = Singleton.getINSTANCE().getCasetas();
        IList<Viaje> aux = new Lista<>();
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if(empresa != null){
                    IList<Viaje> viajes = empresa.getViajes();
                    
                    for (int k = 0; k < viajes.size(); k++) {
                        Viaje viaje = viajes.get(k);
                        if(viaje.getEstado().equals(Viaje.INACTIVO)){
                            continue;
                        }
                        
                        aux.add(viaje);
                    }
                }
            }
        }
        return aux;
    }
}
