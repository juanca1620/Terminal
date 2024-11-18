/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import util.IList;
import util.Lista;

/**
 *
 * @author USUARIO
 */
public class Buz implements Serializable{
    
    private IList<Viaje> viajes;
    private String placa;
    private int asientos;
    
    public Buz(int asientos,String placa) {
        this.viajes = new Lista<>();
        this.placa = placa;
        this.asientos = asientos;
    }
    
    public boolean canAddAtravel(Viaje viaje){
        for (int i = 0; i < viajes.size(); i++) {
            boolean seCruza = isCrosedTravel(viajes.get(i), viaje);
            if(seCruza){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isCrosedTravel(Viaje viajeUno,Viaje viajeDos){
        return !(viajeUno.getHoraFin().plusDays(1).isBefore(viajeDos.getHoraInicio()) || 
                viajeUno.getHoraInicio().isAfter(viajeDos.getHoraFin().plusDays(1)));
    }
    public IList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(IList<Viaje> viajes) {
        this.viajes = viajes;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
