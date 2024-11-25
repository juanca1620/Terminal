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
public class Empresa implements Serializable {
    
    private AdminFlota admin;
    private IList<Buz> buces;
    private String nombreEmpresa;
    private int NIT;

    public Empresa(AdminFlota admin, String nombreEmpresa, int NIT) {
        this.admin = admin;
        this.nombreEmpresa = nombreEmpresa;
        this.buces = new Lista<>();
        this.NIT = NIT;
    }
    
    
    

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    

    public AdminFlota getAdmin() {
        return admin;
    }

    public void setAdmin(AdminFlota admin) {
        this.admin = admin;
    }

    public IList<Buz> getBuces() {
        return buces;
    }

    public void setBuces(IList<Buz> buces) {
        this.buces = buces;
    }
    
    public IList<Viaje> getViajes(){
        Lista<Viaje> viajes = new  Lista<>();
        
        for (int i = 0; i < buces.size(); i++) {
            Buz buz = buces.get(i);
            IList<Viaje> viajesBuz = buz.getViajes();
            for (int j = 0; j < viajesBuz.size(); j++) {
                viajes.add(viajesBuz.get(j));
            }
        }
        return viajes;
    }
    
    public void addBuz(Buz buz){
        buces.add(buz);
    }

    public Viaje obtenerViajePorCodigo(String codigo) {

        IList<Viaje> viajes = this.getViajes();

        for (int k = 0; k < viajes.size(); k++) {
            Viaje viaje = viajes.get(k);

            if (viaje.getCodigo().equals(codigo)) {
                return viaje;
            }
        }
        return null;
    }
}
