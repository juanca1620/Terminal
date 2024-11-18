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
public class Buzon implements Serializable{
    
    private IList<Mensaje> mensajes;

    public Buzon() {
        this.mensajes = new Lista<>();
    }

    public IList<Mensaje> getMensajes() {
        return mensajes;
    }
    
    public void addMensaje(Mensaje mensaje){
        mensajes.add(mensaje);
    }
}
