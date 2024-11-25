/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author USUARIO
 */
public class ReservaAceptadaException extends Exception{
    
    public ReservaAceptadaException(){
        super("Esta reserva esta confirmada, no se puede cancelar");
    }
    
}
