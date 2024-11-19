/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author USUARIO
 */
public class ClienteConReservaException extends Exception{
    
    public ClienteConReservaException (){
        super("Este cliente tiene una reserva existente para este viaje");
    }
}
